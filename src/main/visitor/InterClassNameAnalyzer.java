package main.visitor;

import main.ast.nodes.Program;
import main.ast.nodes.declaration.classDec.ClassDeclaration;
import main.ast.nodes.declaration.classDec.classMembersDec.ConstructorDeclaration;
import main.ast.nodes.declaration.classDec.classMembersDec.FieldDeclaration;
import main.ast.nodes.declaration.classDec.classMembersDec.MethodDeclaration;
import main.ast.nodes.declaration.variableDec.VarDeclaration;
import main.ast.nodes.expression.*;
import main.ast.nodes.expression.values.ListValue;
import main.ast.nodes.expression.values.NullValue;
import main.ast.nodes.expression.values.primitive.BoolValue;
import main.ast.nodes.expression.values.primitive.IntValue;
import main.ast.nodes.expression.values.primitive.StringValue;
import main.ast.nodes.statement.*;
import main.ast.nodes.statement.loop.BreakStmt;
import main.ast.nodes.statement.loop.ContinueStmt;
import main.ast.nodes.statement.loop.ForStmt;
import main.ast.nodes.statement.loop.ForeachStmt;
import main.symbolTable.*;
import main.symbolTable.exceptions.ItemAlreadyExistsException;
import main.symbolTable.exceptions.ItemNotFoundException;
import main.symbolTable.items.*;
import main.symbolTable.utils.Stack;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class InterClassNameAnalyzer extends Visitor<Void> {
    private int numOfErrors;
    private Stack stack;
    private SymbolTable root;

    public InterClassNameAnalyzer() {
        stack = new Stack();
        numOfErrors = 0;
    }

    public Stack getStack() {
        return stack;
    }
    public int getNumOfErrors() {
        return numOfErrors;
    }
    public SymbolTable getRoot() {
        return root;
    }

    @Override
    public Void visit(Program program) {
        root = new SymbolTable();
        stack.push(root);
        ArrayList<ClassDeclaration> classes = program.getClasses();
        for (ClassDeclaration classDec : classes)
            classDec.accept(this);

        return null;
    }

    @Override
    public Void visit(ClassDeclaration classDeclaration) {
        ClassSymbolTableItem classSymbolTableItem = new ClassSymbolTableItem(classDeclaration);
        try {
            root.put(classSymbolTableItem);
        }
        catch (ItemAlreadyExistsException e) {
            System.out.println("Line:"+classDeclaration.getLine()+":Redefinition of "+classDeclaration.getClassName().getName());
            numOfErrors++;
            classSymbolTableItem.setName(("%Class_"+numOfErrors));
            try {
                root.put(classSymbolTableItem);
            }
            catch (ItemAlreadyExistsException exception) {
            }
        }
        SymbolTable symbolTable = new SymbolTable();
        classSymbolTableItem.setClassSymbolTable(symbolTable);
        symbolTable.pre = root;
        stack.push(symbolTable);

        classDeclaration.getClassName().accept(this);
        if (classDeclaration.getParentClassName() != null)
            classDeclaration.getParentClassName().accept(this);
        ArrayList<FieldDeclaration> fields = classDeclaration.getFields();
        ConstructorDeclaration constructor = classDeclaration.getConstructor();
        ArrayList<MethodDeclaration> methods = classDeclaration.getMethods();
        for (FieldDeclaration f : fields)
            f.accept(this);
        if (constructor != null) constructor.accept(this);
        for (MethodDeclaration m : methods)
            m.accept(this);

        stack.pop();
        return null;
    }

    @Override
    public Void visit(ConstructorDeclaration constructorDeclaration) {
        SymbolTable symbolTable = (SymbolTable) stack.pop();
        MethodSymbolTableItem methodSymbolTableItem = new MethodSymbolTableItem(constructorDeclaration);
        try {
            symbolTable.getItem("Field_" + constructorDeclaration.getMethodName().getName(), true);
            System.out.println("Line:" + constructorDeclaration.getLine() + ":Name of method " + constructorDeclaration.getMethodName().getName() + " conflicts with a field's name");
            constructorDeclaration.haveConflict = true;
            numOfErrors++;
        } catch (ItemNotFoundException e) {
        }

        try {
            symbolTable.put(methodSymbolTableItem);
        } catch (ItemAlreadyExistsException e) {
            System.out.println("Line:" + constructorDeclaration.getLine() + ":Redefinition of method " + constructorDeclaration.getMethodName().getName());
            constructorDeclaration.isRedefined = true;
            numOfErrors++;
        }

        SymbolTable methodSymbolTable = new SymbolTable();
        methodSymbolTableItem.setMethodSymbolTable(methodSymbolTable);
        methodSymbolTable.pre = symbolTable;
        // restore stack
        stack.push(symbolTable);

        constructorDeclaration.getMethodName().accept(this);
        for (VarDeclaration arg : constructorDeclaration.getArgs()) {
            LocalVariableSymbolTableItem localVariableSymbolTableItem = new LocalVariableSymbolTableItem(arg);
            try {
                methodSymbolTable.put(localVariableSymbolTableItem);
            }
            catch (ItemAlreadyExistsException e) {
                System.out.println("Line:"+arg.getLine()+":Redefinition of local variable "+arg.getVarName().getName());
                numOfErrors++;
            }

            arg.accept(this);
        }
        for (VarDeclaration var : constructorDeclaration.getLocalVars()) {
            LocalVariableSymbolTableItem localVariableSymbolTableItem = new LocalVariableSymbolTableItem(var);
            try {
                methodSymbolTable.put(localVariableSymbolTableItem);
            }
            catch (ItemAlreadyExistsException e) {
                System.out.println("Line:"+var.getLine()+":Redefinition of local variable "+var.getVarName().getName());
                numOfErrors++;
            }

            var.accept(this);
        }
        ArrayList<Statement> body = constructorDeclaration.getBody();
        for (Statement s : body)
            s.accept(this);
        return null;
    }

    @Override
    public Void visit(MethodDeclaration methodDeclaration) {
        SymbolTable symbolTable = (SymbolTable) stack.pop();
        MethodSymbolTableItem methodSymbolTableItem = new MethodSymbolTableItem(methodDeclaration);
        try {
            symbolTable.getItem("Field_"+methodDeclaration.getMethodName().getName(), true);
            System.out.println("Line:"+methodDeclaration.getLine()+":Name of method "+methodDeclaration.getMethodName().getName()+" conflicts with a field's name");
            methodDeclaration.haveConflict = true;
            numOfErrors++;
        }
        catch (ItemNotFoundException e) {
        }

        try {
            symbolTable.put(methodSymbolTableItem);
        }
        catch (ItemAlreadyExistsException e) {
            System.out.println("Line:"+methodDeclaration.getLine()+":Redefinition of method "+methodDeclaration.getMethodName().getName());
            methodDeclaration.isRedefined = true;
            numOfErrors++;
        }
        SymbolTable methodSymbolTable = new SymbolTable();
        methodSymbolTableItem.setMethodSymbolTable(methodSymbolTable);
        methodSymbolTable.pre = symbolTable;
        // restore stack
        stack.push(symbolTable);

        methodDeclaration.getMethodName().accept(this);
        for (VarDeclaration arg : methodDeclaration.getArgs()) {
            LocalVariableSymbolTableItem localVariableSymbolTableItem = new LocalVariableSymbolTableItem(arg);
            try {
                methodSymbolTable.put(localVariableSymbolTableItem);
            }
            catch (ItemAlreadyExistsException e) {
                System.out.println("Line:"+arg.getLine()+":Redefinition of local variable "+arg.getVarName().getName());
                numOfErrors++;
            }

            arg.accept(this);
        }
        for (VarDeclaration var : methodDeclaration.getLocalVars()) {
            LocalVariableSymbolTableItem localVariableSymbolTableItem = new LocalVariableSymbolTableItem(var);
            try {
                methodSymbolTable.put(localVariableSymbolTableItem);
            }
            catch (ItemAlreadyExistsException e) {
                System.out.println("Line:"+var.getLine()+":Redefinition of local variable "+var.getVarName().getName());
                numOfErrors++;
            }

            var.accept(this);
        }
        ArrayList<Statement> body = methodDeclaration.getBody();
        for (Statement s : body)
            s.accept(this);

        return null;
    }

    @Override
    public Void visit(FieldDeclaration fieldDeclaration) {
        SymbolTable symbolTable = (SymbolTable) stack.pop();
        FieldSymbolTableItem fieldSymbolTableItem = new FieldSymbolTableItem(fieldDeclaration);
        try {
            symbolTable.put(fieldSymbolTableItem);
        }
        catch (ItemAlreadyExistsException e) {
            System.out.println("Line:"+fieldDeclaration.getLine()+":Redefinition of field "+fieldDeclaration.getVarDeclaration().getVarName().getName());
            fieldDeclaration.isRedefined = true;
            numOfErrors++;
        }

        stack.push(symbolTable);

        fieldDeclaration.getVarDeclaration().accept(this);
        return null;
    }

    @Override
    public Void visit(VarDeclaration varDeclaration) {
        varDeclaration.getVarName().accept(this);
        return null;
    }

    @Override
    public Void visit(AssignmentStmt assignmentStmt) {
        assignmentStmt.getlValue().accept(this);
        assignmentStmt.getrValue().accept(this);
        return null;
    }

    @Override
    public Void visit(BlockStmt blockStmt) {
        ArrayList<Statement> block = blockStmt.getStatements();
        for (Statement s : block)
            s.accept(this);
        return null;
    }

    @Override
    public Void visit(ConditionalStmt conditionalStmt) {
        conditionalStmt.getCondition().accept(this);
        conditionalStmt.getThenBody().accept(this);
        if (conditionalStmt.getElseBody() != null)
            conditionalStmt.getElseBody().accept(this);
        return null;
    }

    @Override
    public Void visit(MethodCallStmt methodCallStmt) {
        methodCallStmt.getMethodCall().accept(this);
        return null;
    }

    @Override
    public Void visit(PrintStmt print) {
        print.getArg().accept(this);
        return null;
    }

    @Override
    public Void visit(ReturnStmt returnStmt) {
        returnStmt.getReturnedExpr().accept(this);
        return null;
    }

    @Override
    public Void visit(BreakStmt breakStmt) {
        return null;
    }

    @Override
    public Void visit(ContinueStmt continueStmt) {
        return null;
    }

    @Override
    public Void visit(ForeachStmt foreachStmt) {
        foreachStmt.getVariable().accept(this);
        foreachStmt.getList().accept(this);
        foreachStmt.getBody().accept(this);
        return null;
    }

    @Override
    public Void visit(ForStmt forStmt) {
        forStmt.getInitialize().accept(this);
        forStmt.getCondition().accept(this);
        forStmt.getUpdate().accept(this);
        forStmt.getBody().accept(this);
        return null;
    }

    @Override
    public Void visit(BinaryExpression binaryExpression) {
        binaryExpression.getFirstOperand().accept(this);
        binaryExpression.getSecondOperand().accept(this);
        return null;
    }

    @Override
    public Void visit(UnaryExpression unaryExpression) {
        unaryExpression.getOperand().accept(this);
        return null;
    }

    @Override
    public Void visit(ObjectOrListMemberAccess objectOrListMemberAccess) {
        objectOrListMemberAccess.getInstance().accept(this);
        objectOrListMemberAccess.getMemberName().accept(this);
        return null;
    }

    @Override
    public Void visit(Identifier identifier) {
        return null;
    }

    @Override
    public Void visit(ListAccessByIndex listAccessByIndex) {
        listAccessByIndex.getInstance().accept(this);
        listAccessByIndex.getIndex().accept(this);
        return null;
    }

    @Override
    public Void visit(MethodCall methodCall) {
        ArrayList<Expression> args = methodCall.getArgs();
        methodCall.getInstance().accept(this);
        for (Expression arg : args)
            arg.accept(this);
        return null;
    }

    @Override
    public Void visit(NewClassInstance newClassInstance) {
        ArrayList<Expression> args = newClassInstance.getArgs();
        for (Expression arg : args)
            arg.accept(this);
        return null;
    }

    @Override
    public Void visit(ThisClass thisClass) {
        return null;
    }

    @Override
    public Void visit(ListValue listValue) {
        ArrayList<Expression>  elements = listValue.getElements();
        for (Expression element : elements)
            element.accept(this);
        return null;
    }

    @Override
    public Void visit(NullValue nullValue) {
        return null;
    }

    @Override
    public Void visit(IntValue intValue) {
        return null;
    }

    @Override
    public Void visit(BoolValue boolValue) {
        return null;
    }

    @Override
    public Void visit(StringValue stringValue) {
        return null;
    }

}

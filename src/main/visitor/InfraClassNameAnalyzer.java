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
import main.symbolTable.SymbolTable;
import main.symbolTable.exceptions.ItemAlreadyExistsException;
import main.symbolTable.exceptions.ItemNotFoundException;
import main.symbolTable.items.ClassSymbolTableItem;
import main.symbolTable.items.MethodSymbolTableItem;
import main.symbolTable.items.SymbolTableItem;
import main.symbolTable.utils.Stack;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class InfraClassNameAnalyzer extends Visitor<Void> {
    private Stack stack;
    private int numOfErrors;
    private SymbolTable root;

    public InfraClassNameAnalyzer(Stack _stack, SymbolTable _root) {
        stack = _stack;
        numOfErrors = 0;
        root = _root;
    }

    public int getNumOfErrors() {
        return numOfErrors;
    }

    @Override
    public Void visit(Program program) {
        ArrayList<ClassDeclaration> classes = program.getClasses();

        for (ClassDeclaration classDec : classes){
            try {
                String classKey = "Class_" + classDec.getClassName().getName();
                ClassSymbolTableItem classSymbolTableItem = (ClassSymbolTableItem) root.getItem(classKey, true);
                SymbolTable classSymbolTable = classSymbolTableItem.getClassSymbolTable();

                if (classDec.getParentClassName() != null) {
                    SymbolTable parentSymbolTable;
                    try {
                        String parentKey = "Class_" + classDec.getParentClassName().getName();
                        ClassSymbolTableItem parentSymbolTableItem = (ClassSymbolTableItem) root.getItem(parentKey, true);
                        parentSymbolTable = parentSymbolTableItem.getClassSymbolTable();
                        classSymbolTable.pre = parentSymbolTable;
                    }
                    catch (ItemNotFoundException e) {
                    }
                }
            }
            catch(ItemNotFoundException e){
            }
        }



        for (ClassDeclaration classDec : classes)
            classDec.accept(this);
        return null;
    }

    @Override
    public Void visit(ClassDeclaration classDeclaration) {
        try {
            String classKey = "Class_" + classDeclaration.getClassName().getName();
            ClassSymbolTableItem classSymbolTableItem = (ClassSymbolTableItem) root.getItem(classKey, true);
            SymbolTable classSymbolTable = classSymbolTableItem.getClassSymbolTable();

            if (classSymbolTable.haveCircularInheritance()) {
                String errorMessage = "Line:" + classDeclaration.getLine() + ":Class " + classDeclaration.getClassName().getName() + " is in an inheritance cycle";
                System.out.println(errorMessage);
                numOfErrors++;
            }

            stack.push(classSymbolTable);
        }
        catch (ItemNotFoundException e) {
        }

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
        SymbolTable classSymbolTable = (SymbolTable) stack.pop();
        if (!constructorDeclaration.isRedefined) {
            try {
                classSymbolTable.getItem("Method_" + constructorDeclaration.getMethodName().getName(), false);
                String errorMessage = "Line:"+constructorDeclaration.getLine()+":Redefinition of method "+constructorDeclaration.getMethodName().getName();
                System.out.println(errorMessage);
                constructorDeclaration.isRedefined = true;
                numOfErrors++;
            }
            catch (ItemNotFoundException e) {
            }
        }

        if (!constructorDeclaration.haveConflict) {
            try {
                classSymbolTable.getItem("Field_" + constructorDeclaration.getMethodName().getName(), false);
                String errorMessage = "Line:"+constructorDeclaration.getLine()+":Name of method "+constructorDeclaration.getMethodName().getName()+" conflicts with a field's name";
                System.out.println(errorMessage);
                constructorDeclaration.haveConflict = true;
                numOfErrors++;
            }
            catch (ItemNotFoundException e) {
            }
        }

        // restore stack
        stack.push(classSymbolTable);

        constructorDeclaration.getMethodName().accept(this);
        ArrayList<VarDeclaration> args = constructorDeclaration.getArgs();
        for (VarDeclaration arg : args)
            arg.accept(this);
        ArrayList<VarDeclaration> localVars = constructorDeclaration.getLocalVars();
        for (VarDeclaration var : localVars)
            var.accept(this);
        ArrayList<Statement> body = constructorDeclaration.getBody();
        for (Statement s : body)
            s.accept(this);
        return null;
    }

    @Override
    public Void visit(MethodDeclaration methodDeclaration) {
        SymbolTable classSymbolTable = (SymbolTable) stack.pop();
        if (!methodDeclaration.isRedefined) {
            try {
                classSymbolTable.getItem("Method_" + methodDeclaration.getMethodName().getName(), false);
                String errorMessage = "Line:"+methodDeclaration.getLine()+":Redefinition of method "+methodDeclaration.getMethodName().getName();
                System.out.println(errorMessage);
                methodDeclaration.isRedefined = true;
                numOfErrors++;
            }
            catch (ItemNotFoundException e) {
            }
        }

        if (!methodDeclaration.haveConflict) {
            try {
                classSymbolTable.getItem("Field_" + methodDeclaration.getMethodName().getName(), false);
                String errorMessage = "Line:"+methodDeclaration.getLine()+":Name of method "+methodDeclaration.getMethodName().getName()+" conflicts with a field's name";
                System.out.println(errorMessage);
                methodDeclaration.haveConflict = true;
                numOfErrors++;
            }
            catch (ItemNotFoundException e) {
            }
        }

        // restore stack
        stack.push(classSymbolTable);

        methodDeclaration.getMethodName().accept(this);
        ArrayList<VarDeclaration> args = methodDeclaration.getArgs();
        for (VarDeclaration arg : args)
            arg.accept(this);
        ArrayList<VarDeclaration> localVars = methodDeclaration.getLocalVars();
        for (VarDeclaration var : localVars)
            var.accept(this);
        ArrayList<Statement> body = methodDeclaration.getBody();
        for (Statement s : body)
            s.accept(this);
        return null;
    }

    @Override
    public Void visit(FieldDeclaration fieldDeclaration) {
        SymbolTable classSymbolTable = (SymbolTable) stack.pop();
        if (!fieldDeclaration.isRedefined) {
            try {
                classSymbolTable.getItem("Field_" + fieldDeclaration.getVarDeclaration().getVarName().getName(), false);
                String errorMessage = "Line:"+fieldDeclaration.getLine()+":Redefinition of field "+fieldDeclaration.getVarDeclaration().getVarName().getName();
                System.out.println(errorMessage);
                fieldDeclaration.isRedefined = true;
                numOfErrors++;
            }
            catch (ItemNotFoundException e) {
            }
        }

        ArrayList<SymbolTableItem> allItems = classSymbolTable.getAllItems("Method_" + fieldDeclaration.getVarDeclaration().getVarName().getName(), false);
        for (SymbolTableItem item : allItems) {
            MethodSymbolTableItem methodItem = (MethodSymbolTableItem) item;
            String errorMessage = "Line:"+methodItem.getMethodDeclaration().getLine()+":Name of method "+methodItem.getMethodDeclaration().getMethodName().getName()+" conflicts with a field's name";
            if (!methodItem.getMethodDeclaration().haveConflict) {
                System.out.println(errorMessage);
                methodItem.getMethodDeclaration().haveConflict = true;
                numOfErrors++;
            }
        }
        // restore stack
        stack.push(classSymbolTable);

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
    public Void visit(NullValue nullValue) { return null; }

    @Override
    public Void visit(IntValue intValue) { return null; }

    @Override
    public Void visit(BoolValue boolValue) { return null; }

    @Override
    public Void visit(StringValue stringValue) { return null; }

}

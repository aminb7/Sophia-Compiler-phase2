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

import java.util.ArrayList;

public class ASTTreePrinter extends Visitor<Void> {

    @Override
    public Void visit(Program program) {
        System.out.println("Line:"+program.getLine()+":"+program.toString());
        ArrayList<ClassDeclaration> classes = program.getClasses();
        for (ClassDeclaration classDec : classes)
            classDec.accept(this);
        return null;
    }

    @Override
    public Void visit(ClassDeclaration classDeclaration) {
        System.out.println("Line:"+classDeclaration.getLine()+":"+classDeclaration.toString());
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
        return null;
    }

    @Override
    public Void visit(ConstructorDeclaration constructorDeclaration) {
        System.out.println("Line:"+constructorDeclaration.getLine()+":"+constructorDeclaration.toString());
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
        System.out.println("Line:"+methodDeclaration.getLine()+":"+methodDeclaration.toString());
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
        System.out.println("Line:"+fieldDeclaration.getLine()+":"+fieldDeclaration.toString());
        fieldDeclaration.getVarDeclaration().accept(this);
        return null;
    }

    @Override
    public Void visit(VarDeclaration varDeclaration) {
        System.out.println("Line:"+varDeclaration.getLine()+":"+varDeclaration.toString());
        varDeclaration.getVarName().accept(this);
        return null;
    }

    @Override
    public Void visit(AssignmentStmt assignmentStmt) {
        System.out.println("Line:"+assignmentStmt.getLine()+":"+assignmentStmt.toString());
        assignmentStmt.getlValue().accept(this);
        assignmentStmt.getrValue().accept(this);
        return null;
    }

    @Override
    public Void visit(BlockStmt blockStmt) {
        System.out.println("Line:"+blockStmt.getLine()+":"+blockStmt.toString());
        ArrayList<Statement> block = blockStmt.getStatements();
        for (Statement s : block)
            s.accept(this);
        return null;
    }

    @Override
    public Void visit(ConditionalStmt conditionalStmt) {
        System.out.println("Line:"+conditionalStmt.getLine()+":"+conditionalStmt.toString());
        conditionalStmt.getCondition().accept(this);
        conditionalStmt.getThenBody().accept(this);
        if (conditionalStmt.getElseBody() != null)
            conditionalStmt.getElseBody().accept(this);
        return null;
    }

    @Override
    public Void visit(MethodCallStmt methodCallStmt) {
        System.out.println("Line:"+methodCallStmt.getLine()+":"+methodCallStmt.toString());
        methodCallStmt.getMethodCall().accept(this);
        return null;
    }

    @Override
    public Void visit(PrintStmt print) {
        System.out.println("Line:"+print.getLine()+":"+print.toString());
        print.getArg().accept(this);
        return null;
    }

    @Override
    public Void visit(ReturnStmt returnStmt) {
        System.out.println("Line:"+returnStmt.getLine()+":"+returnStmt.toString());
        returnStmt.getReturnedExpr().accept(this);
        return null;
    }

    @Override
    public Void visit(BreakStmt breakStmt) {
        System.out.println("Line:"+breakStmt.getLine()+":"+breakStmt.toString());
        return null;
    }

    @Override
    public Void visit(ContinueStmt continueStmt) {
        System.out.println("Line:"+continueStmt.getLine()+":"+continueStmt.toString());
        return null;
    }

    @Override
    public Void visit(ForeachStmt foreachStmt) {
        System.out.println("Line:"+foreachStmt.getLine()+":"+foreachStmt.toString());
        foreachStmt.getVariable().accept(this);
        foreachStmt.getList().accept(this);
        foreachStmt.getBody().accept(this);
        return null;
    }

    @Override
    public Void visit(ForStmt forStmt) {
        System.out.println("Line:"+forStmt.getLine()+":"+forStmt.toString());
        forStmt.getInitialize().accept(this);
        forStmt.getCondition().accept(this);
        forStmt.getUpdate().accept(this);
        forStmt.getBody().accept(this);
        return null;
    }

    @Override
    public Void visit(BinaryExpression binaryExpression) {
        System.out.println("Line:"+binaryExpression.getLine()+":"+binaryExpression.toString());
        binaryExpression.getFirstOperand().accept(this);
        binaryExpression.getSecondOperand().accept(this);
        return null;
    }

    @Override
    public Void visit(UnaryExpression unaryExpression) {
        System.out.println("Line:"+unaryExpression.getLine()+":"+unaryExpression.toString());
        unaryExpression.getOperand().accept(this);
        return null;
    }

    @Override
    public Void visit(ObjectOrListMemberAccess objectOrListMemberAccess) {
        System.out.println("Line:"+objectOrListMemberAccess.getLine()+":"+objectOrListMemberAccess.toString());
        objectOrListMemberAccess.getInstance().accept(this);
        objectOrListMemberAccess.getMemberName().accept(this);
        return null;
    }

    @Override
    public Void visit(Identifier identifier) {
        System.out.println("Line:"+identifier.getLine()+":"+identifier.toString());
        return null;
    }

    @Override
    public Void visit(ListAccessByIndex listAccessByIndex) {
        System.out.println("Line:"+listAccessByIndex.getLine()+":"+listAccessByIndex.toString());
        listAccessByIndex.getInstance().accept(this);
        listAccessByIndex.getIndex().accept(this);
        return null;
    }

    @Override
    public Void visit(MethodCall methodCall) {
        System.out.println("Line:"+methodCall.getLine()+":"+methodCall.toString());
        ArrayList<Expression> args = methodCall.getArgs();
        methodCall.getInstance().accept(this);
        for (Expression arg : args)
            arg.accept(this);
        return null;
    }

    @Override
    public Void visit(NewClassInstance newClassInstance) {
        System.out.println("Line:"+newClassInstance.getLine()+":"+newClassInstance.toString());
        ArrayList<Expression> args = newClassInstance.getArgs();
        for (Expression arg : args)
            arg.accept(this);
        return null;
    }

    @Override
    public Void visit(ThisClass thisClass) {
        System.out.println("Line:"+thisClass.getLine()+":"+thisClass.toString());
        return null;
    }

    @Override
    public Void visit(ListValue listValue) {
        System.out.println("Line:"+listValue.getLine()+":"+listValue.toString());
        ArrayList<Expression>  elements = listValue.getElements();
        for (Expression element : elements)
            element.accept(this);
        return null;
    }

    @Override
    public Void visit(NullValue nullValue) {
        System.out.println("Line:"+nullValue.getLine()+":"+nullValue.toString());
        return null;
    }

    @Override
    public Void visit(IntValue intValue) {
        System.out.println("Line:"+intValue.getLine()+":"+intValue.toString());
        return null;
    }

    @Override
    public Void visit(BoolValue boolValue) {
        System.out.println("Line:"+boolValue.getLine()+":"+boolValue.toString());
        return null;
    }

    @Override
    public Void visit(StringValue stringValue) {
        System.out.println("Line:"+stringValue.getLine()+":"+stringValue.toString().replace("\"", ""));
        return null;
    }

}

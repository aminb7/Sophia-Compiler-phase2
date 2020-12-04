package main.ast.nodes.declaration.classDec.classMembersDec;

import main.ast.nodes.expression.Identifier;
import main.ast.types.NullType;
import main.visitor.IVisitor;

//line -> DEF
public class ConstructorDeclaration extends MethodDeclaration{
    public boolean isRedefined;
    public boolean hasConflict;

    public ConstructorDeclaration(Identifier methodName) {
        super(methodName, new NullType());
        this.isRedefined = false;
        this.hasConflict = false;
    }

    @Override
    public String toString() {
        return "ConstructorDeclaration_" + this.methodName.getName();
    }

    @Override
    public <T> T accept(IVisitor<T> visitor) {
        return visitor.visit(this);
    }
}

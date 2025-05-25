package AST;

import AST.ClassDecleration.FuncBodyStatement;

public class PlusStatement extends FuncBodyStatement {
    Expression expression;
    String op1;

    public Expression getExpression() {
        return expression;
    }
    public void setExpression(Expression expression) {
        this.expression = expression;
    }

    public String getOp1() {
        return op1;
    }

    public void setOp1(String op1) {
        this.op1 = op1;
    }

    public String toString() {
        return expression  + op1  + op1 + ";";
    }
}

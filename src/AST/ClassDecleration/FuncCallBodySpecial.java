package AST.ClassDecleration;

import AST.Expression;

public class FuncCallBodySpecial implements FunctionCallBody{
    String identirier;
    Expression expression1;
    Expression expression2;

    public void setIdentirier(String identirier) {
        this.identirier = identirier;
    }
    public String getIdentirier() {
        return identirier;
    }

    public Expression getExpression1() {
        return expression1;
    }
    public void setExpression1(Expression expression1) {
        this.expression1 = expression1;
    }

    public Expression getExpression2() {
        return expression2;
    }
    public void setExpression2(Expression expression2) {
        this.expression2 = expression2;
    }

    @Override
    public String toString() {
        return identirier + " => " + expression1 + " !== " + expression2 ;
    }
}

package AST.ComponentDecleration.HTML;

import AST.Expression;

public class HtmlAttQuestion implements AttributeHTML{
    Expression expression1;
    Expression expression2;
    Expression expression3;
    Expression expression4;

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

    public Expression getExpression3() {
        return expression3;
    }
    public void setExpression3(Expression expression3) {
        this.expression3 = expression3;
    }

    public Expression getExpression4() {
        return expression4;
    }
    public void setExpression4(Expression expression4) {
        this.expression4 = expression4;
    }


    @Override
    public String toString() {
        return "[style." + expression1 + "]=\"" + expression2 + " ? " + expression3 + " : " + expression4 + "\"";
    }
}


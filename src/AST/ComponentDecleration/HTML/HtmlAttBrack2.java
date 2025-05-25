package AST.ComponentDecleration.HTML;

import AST.Expression;

public class HtmlAttBrack2 implements AttributeHTML{
    Expression expression;
    String string;

    public Expression getExpression() {
        return expression;
    }
    public void setExpression(Expression expression) {
        this.expression = expression;
    }

    public String getString() {
        return string;
    }
    public void setString(String string) {
        this.string = string;
    }

    @Override
    public String toString() {
        return "[(" + string + ")]= \"" + expression.toString() + "\"";
    }
}

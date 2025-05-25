package AST.ComponentDecleration.HTML;

import AST.Expression;

public class HtmlAttSrcFunc implements AttributeHTML{
    Expression expression;

    public Expression getExpression() {
        return expression;
    }
    public void setExpression(Expression expression) {
        this.expression = expression;
    }

    @Override
    public String toString() {
        return "[src]= \"" + expression.toString() + "\"";
    }
}

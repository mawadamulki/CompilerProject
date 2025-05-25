package AST.ComponentDecleration.HTML;

import AST.Expression;

public class TagBodyExpression implements TagBody{
    Expression expression;

    public Expression getExpression() {
        return expression;
    }
    public void setExpression(Expression expression) {
        this.expression = expression;
    }

    @Override
    public String toString() {
        return "{{" + expression.toString() + "}}";
    }
}

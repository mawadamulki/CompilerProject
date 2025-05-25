package AST.ComponentDecleration.HTML;

import AST.ClassDecleration.FunctionCall;
import AST.Expression;

public class HtmlAttBrack1 implements AttributeHTML{
    Expression expression;
    FunctionCall functionCall;

    public Expression getExpression() {
        return expression;
    }
    public void setExpression(Expression expression) {
        this.expression = expression;
    }

    public FunctionCall getFunctionCall() {
        return functionCall;
    }
    public void setFunctionCall(FunctionCall functionCall) {
        this.functionCall = functionCall;
    }

    @Override
    public String toString() {
        return "(" + expression.toString() + ")= \"" + functionCall.toString() +"\"";
    }
}

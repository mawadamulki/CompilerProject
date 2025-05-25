package AST.ClassDecleration;

import AST.Expression;

public class FunctionCall {
    Expression expression;
    FunctionCallBody functionCallBody;

    public Expression getExpression() {
        return expression;
    }
    public void setExpression(Expression expression) {
        this.expression = expression;
    }

    public FunctionCallBody getFunctionCallBody() {
        return functionCallBody;
    }
    public void setFunctionCallBody(FunctionCallBody functionCallBody) {
        this.functionCallBody = functionCallBody;
    }


    public String toString() {
        if(functionCallBody != null)
            return expression + "( " + functionCallBody +" )";
        else
            return expression + "()";
    }
}

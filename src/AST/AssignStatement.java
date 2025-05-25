package AST;

import AST.ClassDecleration.FuncBodyStatement;
import AST.ClassDecleration.FunctionCall;

public class AssignStatement extends FuncBodyStatement {

    Expression expression1;
    Expression expression2;
    FunctionCall functionCall;

    public Expression getExpression1() {
        return expression1;
    }
    public void setExpression1(Expression expression) {
        this.expression1 = expression;
    }

    public Expression getExpression2() {
        return expression2;
    }
    public void setExpression2(Expression expression2) {
        this.expression2 = expression2;
    }

    public FunctionCall getFunctionCall() {
        return functionCall;
    }
    public void setFunctionCall(FunctionCall functionCall) {
        this.functionCall = functionCall;
    }

    @Override
    public String toString() {
        if(expression2 != null) {
            return expression1 + " = " + expression2 + "; ";
        }else {
            return expression1 + " = " + functionCall + ";";
        }

    }
}

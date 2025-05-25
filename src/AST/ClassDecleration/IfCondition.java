package AST.ClassDecleration;

public class IfCondition {
    FunctionCall functionCall;

    public FunctionCall getFunctionCall() {
        return functionCall;
    }
    public void setFunctionCall(FunctionCall functionCall) {
        this.functionCall = functionCall;
    }

    @Override
    public String toString() {
        return functionCall.toString();
    }
}

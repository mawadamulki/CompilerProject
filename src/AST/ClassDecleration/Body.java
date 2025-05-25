package AST.ClassDecleration;

public class Body {
    String bool;
    String identifier;
    FunctionCall functionCall;

    public String getBool() {
        return bool;
    }
    public void setBool(String bool) {
        this.bool = bool;
    }

    public String getIdentifier() {
        return identifier;
    }
    public void setIdentifier(String identifier) {
        this.identifier = identifier;
    }

    public FunctionCall getFunctionCall() {
        return functionCall;
    }
    public void setFunctionCall(FunctionCall functionCall) {
        this.functionCall = functionCall;
    }


    @Override
    public String toString() {
        if(functionCall != null)
            return identifier + " : " + functionCall.toString();
        else
            return identifier + " : " + bool;
    }
}

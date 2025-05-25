package AST.ComponentDecleration.HTML;

import AST.ClassDecleration.FunctionCall;

public class HtmlAttClick implements AttributeHTML{
    FunctionCall functionCall;

    public FunctionCall getFunctionCall() {
        return functionCall;
    }

    public void setFunctionCall(FunctionCall functionCall) {
        this.functionCall = functionCall;
    }

    @Override
    public String toString() {
        return "(click)= \"" + functionCall.toString() + "\"";
    }
}

package AST.ClassDecleration;

import AST.AssignStatement;

public class IfBody {
    FunctionCall functionCall;
    AssignStatement assignStatement;

    public FunctionCall getFunctionCall() {
        return functionCall;
    }
    public void setFunctionCall(FunctionCall functionCall) {
        this.functionCall = functionCall;
    }

    public AssignStatement getAssignStatement() {
        return assignStatement;
    }
    public void setAssignStatement(AssignStatement assignStatement) {
        this.assignStatement = assignStatement;
    }

    @Override
    public String toString() {
        if(functionCall != null){
            return  functionCall + ";";
        }else
            return assignStatement.toString();
    }
}

package AST.ClassDecleration;

import AST.PlusStatement;
import AST.AssignStatement;

public class FuncBodyStatement implements FunctionBody{
    AssignStatement assignStatement;
    PlusStatement plusStatement;

    public AssignStatement getAssignStatement() {
        return assignStatement;
    }
    public void setAssignStatement(AssignStatement assignStatement) {
        this.assignStatement = assignStatement;
    }

    public PlusStatement getPlusStatement() {
        return plusStatement;
    }
    public void setPlusStatement(PlusStatement plusStatement) {
        this.plusStatement = plusStatement;
    }

    @Override
    public String toString() {
        if(assignStatement != null)
            return assignStatement.toString();
        else
            return plusStatement.toString();
    }
}

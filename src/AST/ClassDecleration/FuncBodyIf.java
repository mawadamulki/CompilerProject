package AST.ClassDecleration;

import java.util.List;
import java.util.ArrayList;

public class FuncBodyIf implements FunctionBody{
    IfCondition ifCondition;
    List<IfBody> ifBody = new ArrayList<IfBody>();

    public IfCondition getIfCondition() {
        return ifCondition;
    }
    public void setIfCondition(IfCondition ifCondition) {
        this.ifCondition = ifCondition;
    }

    public List<IfBody> getIfBody() {
        return ifBody;
    }
    public void setIfBody(List<IfBody> ifBody) {
        this.ifBody = ifBody;
    }



    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();

        for (int i = 0; i < ifBody.size(); i++) {
            if(i != ifBody.size() - 1){
                stringBuilder.append(ifBody.get(i)).append("\n ");
            } else {
                stringBuilder.append(ifBody.get(i));
            }
        }

        return "if(" + ifCondition + ") { \n" + stringBuilder.toString() + "\n}";
    }
}

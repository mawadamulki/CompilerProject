package AST.ClassDecleration;

import AST.ParamList;

import java.util.ArrayList;
import java.util.List;

public class ClassBodyFunc implements ClassBody{
    String identifier;
    ParamList paramList;
    List<FunctionBody> functionBody = new ArrayList<FunctionBody>();

    public String getIdentifier(){
        return identifier;
    }
    public void setIdentifier(String identifier){
        this.identifier = identifier;
    }

    public ParamList getParamList(){
        return paramList;
    }
    public void setParamList(ParamList paramList){
        this.paramList = paramList;
    }

    public List<FunctionBody> getFunctionBody(){
        return functionBody;
    }
    public void setFunctionBody(List<FunctionBody> functionBody){
        this.functionBody = functionBody;
    }

    public String toString(){
        StringBuilder stringBuilder = new StringBuilder();

        for (int i = 0; i < functionBody.size(); i++) {
            if(i != functionBody.size() - 1){
                stringBuilder.append(functionBody.get(i)).append("\n ");
            } else {
                stringBuilder.append(functionBody.get(i));
            }
        }


        if(paramList != null) {
            return identifier + "(" + paramList + ") {\n" + stringBuilder.toString() + "\n}";
        }
        else
            return identifier + "(" + ") {\n" + stringBuilder.toString() + "\n}";
    }
}
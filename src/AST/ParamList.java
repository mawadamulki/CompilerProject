package AST;

import java.util.ArrayList;
import java.util.List;

public class ParamList {
    List<Parameter> parameter = new ArrayList<Parameter>();

    public List<Parameter> getParameter(){
        return parameter;
    }
    public void setParameter(List<Parameter> parameter){
        this.parameter = parameter;
    }

    public String toString(){
        StringBuilder stringBuilder = new StringBuilder();

        for (int i = 0; i < parameter.size(); i++) {
            if(i != parameter.size() - 1){
                stringBuilder.append(parameter.get(i)).append(", ");
            } else {
                stringBuilder.append(parameter.get(i));
            }
        }

        return stringBuilder.toString();
    }
}
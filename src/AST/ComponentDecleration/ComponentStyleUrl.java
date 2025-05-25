package AST.ComponentDecleration;

import java.util.ArrayList;
import java.util.List;

public class ComponentStyleUrl implements ComponentData{
    List<String> strings = new ArrayList<String>();

    public List<String> getStrings() {
        return strings;
    }
    public void setStrings(List<String> strings) {
        this.strings = strings;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();

        for (int i = 0; i < strings.size(); i++) {
            if(i != strings.size() - 1){
                stringBuilder.append(strings.get(i)).append(", \n");
            } else {
                stringBuilder.append(strings.get(i));
            }
        }

        return "styleUrl: [" + stringBuilder.toString() + "]";
    }
}

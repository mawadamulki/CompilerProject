package AST.ComponentDecleration.HTML.Style;

import java.util.ArrayList;
import java.util.List;

public class StyleElementAssign implements StyleElement{
    String string;
    List<String> identifer = new ArrayList<String>();

    public String getString() {
        return string;
    }
    public void setString(String string) {
        this.string = string;
    }

    public List<String> getIdentifer() {
        return identifer;
    }
    public void setIdentifer(List<String> identifer) {
        this.identifer = identifer;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();

        for (int i = 0; i < identifer.size(); i++) {
            if(i != identifer.size() - 1){
                stringBuilder.append(identifer.get(i)).append(", ");
            } else {
                stringBuilder.append(identifer.get(i));
            }
        }

        return string + ": " + stringBuilder.toString() + ";";
    }
}

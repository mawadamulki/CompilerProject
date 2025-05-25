package AST.ComponentDecleration;

import java.util.ArrayList;
import java.util.List;

public class ComponentImports implements ComponentData{
    List<String> identifier = new ArrayList<String>();

    public List<String> getIdentifier() {
        return identifier;
    }
    public void setIdentifier(List<String> identifier) {
        this.identifier = identifier;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();

        for (int i = 0; i < identifier.size(); i++) {
            if(i != identifier.size() - 1){
                stringBuilder.append(identifier.get(i)).append(", ");
            } else {
                stringBuilder.append(identifier.get(i));
            }
        }
        return "imports: [" + stringBuilder.toString() + "]";
    }
}

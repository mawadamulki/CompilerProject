package SemanticErrors;

import java.util.ArrayList;
import java.util.List;

public class BindingErrorSymbolTable {
    List<String> varComponent = new ArrayList<String>();
    List<String> varClass = new ArrayList<String>();
    boolean isError = false;
    String name;

    public String getName() {
        return name;
    }

    public void setVarComponent(List<String> varComponent) {
        this.varComponent = varComponent;
    }

    public List<String> getVarComponent() {
        return varComponent;
    }

    public List<String> getVarClass() {
        return varClass;
    }

    public void setVarClass(List<String> varClass) {
        this.varClass = varClass;
    }

    public void addItemVarComponent(String string){
        varComponent.add(string);
    }
    public void addItemvarClass(String string){
        varClass.add(string);
    }

    public boolean checkError(){
        List<String> errors = new ArrayList<>();

        for (String call : varComponent) {
            if(!varClass.contains(call))
                errors.add(call);
        }

        if(!errors.isEmpty()) {
            isError = true;
            name = errors.get(0);
        }

        return isError;
    }
}

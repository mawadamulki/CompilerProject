package SemanticErrors;

import java.util.List;
import java.util.ArrayList;

public class SelectorCollisionsSymbolTable {
    List<String> selectorCollisions = new ArrayList<String>();

    public List<String> getSelectorCollisions() {
        return selectorCollisions;
    }

    public void setSelectorCollisions(List<String> selectorCollisions) {
        this.selectorCollisions = selectorCollisions;
    }

    public void addItem(String item){
        selectorCollisions.add(item);
    }

    public boolean checkIfExist(String selector){
        for (String selectorCollision : selectorCollisions)
            if (selectorCollision.equals(selector))
                return true;
        return false;
    }

}

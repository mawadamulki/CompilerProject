package AST;

import java.util.ArrayList;
import java.util.List;


public class ImportItems{
    List<String> importItems = new ArrayList<String>();

    public List<String> getImportItems(){
        return importItems;
    }
    public void setImportItems(List<String> importItems){
        this.importItems = importItems;
    }

    public String toString(){
        StringBuilder stringBuilder = new StringBuilder();

        for (int i = 0; i < importItems.size(); i++) {
            if(i != importItems.size() - 1){
                stringBuilder.append(importItems.get(i)).append(", ");
            } else {
                stringBuilder.append(importItems.get(i));
            }
        }

        return stringBuilder.toString();
    }

}



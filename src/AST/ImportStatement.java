package AST;

import java.util.ArrayList;
import java.util.List;


public class ImportStatement{
    ImportItems importItems;
    String importString;

    public ImportItems getImportItems(){
        return importItems;
    }
    public void setImportItems(ImportItems importItems){
        this.importItems = importItems;
    }

    public String getImportString(){
        return importString;
    }
    public void setImportString(String importString){
        this.importString = importString;
    }

    public String toString(){
        return "import {" + importItems + "} from "+
                 importString +";"
                ;
    }

}
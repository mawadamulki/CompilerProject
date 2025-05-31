package SemanticErrors;

import java.util.ArrayList;
import java.util.List;

public class ConflictingAliasesSymbolTable {
    List<String> conflictingAliasesSymbolTable = new ArrayList<>();

    public List<String> getConflictingAliasesSymbolTable() {
        return conflictingAliasesSymbolTable;
    }

    public void setConflictingAliasesSymbolTable(List<String> conflictingAliasesSymbolTable) {
        this.conflictingAliasesSymbolTable = conflictingAliasesSymbolTable;
    }

    public void addItem(String item){
        conflictingAliasesSymbolTable.add(item);
    }

    public boolean checkIfExist(String attName){
        for (String conflictingAliases : conflictingAliasesSymbolTable)
            if (conflictingAliases.equals(attName))
                return true;
        return false;
    }
}

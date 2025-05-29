package SemanticErrors;

import java.util.List;
import java.util.ArrayList;

public class TemplateMissingSymbolTable {
    List<String> MissingTemplate = new ArrayList<String>();

    public List<String> getMissingTemplate() {
        return MissingTemplate;
    }

    public void setMissingTemplate(List<String> MissingTemplate) {
        this.MissingTemplate = MissingTemplate;
    }

    public void addItem(String item) {
        MissingTemplate.add(item);
    }

    public int templateSize() {

        return MissingTemplate.size();
    }
}
package AST.ComponentDecleration.HTML;

public class CloseTag {
    String identifier;

    public String getIdentifier() {
        return identifier;
    }
    public void setIdentifier(String identifier) {
        this.identifier = identifier;
    }

    @Override
    public String toString() {
        return "</" + identifier + ">";
    }
}

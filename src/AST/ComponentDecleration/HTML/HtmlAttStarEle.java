package AST.ComponentDecleration.HTML;

public class HtmlAttStarEle implements AttributeHTML{

    String identifier;
    String string;

    public String getIdentifier() {
        return identifier;
    }

    public void setIdentifier(String identifier) {
        this.identifier = identifier;
    }

    public String getString() {
        return string;
    }
    public void setString(String string) {
        this.string = string;
    }

    @Override
    public String toString() {
        return "*"+ identifier + " = " + string;
    }
}

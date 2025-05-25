package AST.ComponentDecleration.HTML;

public class HtmlAttPlaceholder implements AttributeHTML{
    String string;

    public String getString() {
        return string;
    }

    public void setString(String string) {
        this.string = string;
    }

    @Override
    public String toString() {
        return "placeholder= " + string ;
    }
}

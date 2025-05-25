package AST.ComponentDecleration.HTML;

public class HtmlAttSrc implements AttributeHTML{
    String string;

    public String getString() {
        return string;
    }
    public void setString(String string) {
        this.string = string;
    }

    @Override
    public String toString() {
        return "src= \"" + string + "\"";
    }
}

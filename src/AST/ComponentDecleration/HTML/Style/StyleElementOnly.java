package AST.ComponentDecleration.HTML.Style;

public class StyleElementOnly implements StyleElement{
    String string;

    public String getString() {
        return string;
    }

    public void setString(String string) {
        this.string = string;
    }

    @Override
    public String toString() {
        return string + ";";
    }
}

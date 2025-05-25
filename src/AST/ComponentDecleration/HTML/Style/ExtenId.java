package AST.ComponentDecleration.HTML.Style;

public class ExtenId implements Extention{
    String string;

    public String getString() {
        return string;
    }

    public void setString(String string) {
        this.string = string;
    }

    @Override
    public String toString() {
        return string;
    }
}

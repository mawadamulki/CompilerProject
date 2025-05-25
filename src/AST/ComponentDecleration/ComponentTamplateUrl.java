package AST.ComponentDecleration;

public class ComponentTamplateUrl implements ComponentData{
    String string;

    public String getString() {
        return string;
    }

    public void setString(String string) {
        this.string = string;
    }

    @Override
    public String toString() {
        return "templateUrl: '" + string + "'";
    }
}

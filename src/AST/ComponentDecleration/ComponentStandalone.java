package AST.ComponentDecleration;

public class ComponentStandalone implements ComponentData{
    String bool;

    public String getBool() {
        return bool;
    }

    public void setBool(String bool) {
        this.bool = bool;
    }

    @Override
    public String toString() {
        return "standalone: " + bool ;
    }
}

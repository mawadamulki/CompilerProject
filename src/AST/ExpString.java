package AST;

public class ExpString implements Expression {
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

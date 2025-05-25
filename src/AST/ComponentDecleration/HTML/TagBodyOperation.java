package AST.ComponentDecleration.HTML;

public class TagBodyOperation implements TagBody{
    String op;

    public String getOp() {
        return op;
    }
    public void setOp(String op) {
        this.op = op;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(op);
        return stringBuilder.toString();
    }
}

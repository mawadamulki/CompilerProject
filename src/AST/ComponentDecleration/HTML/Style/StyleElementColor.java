package AST.ComponentDecleration.HTML.Style;

public class StyleElementColor implements StyleElement{
    String identifier1;
    String identifier2;
    String number;

    public String getIdentifier1() {
        return identifier1;
    }
    public void setIdentifier1(String identifier1) {
        this.identifier1 = identifier1;
    }

    public String getIdentifier2() {
        return identifier2;
    }
    public void setIdentifier2(String identifier2) {
        this.identifier2 = identifier2;
    }

    public String getNumber() {
        return number;
    }
    public void setNumber(String number) {
        this.number = number;
    }

    @Override
    public String toString() {
        if(number != null && identifier2 != null)
            return identifier1 + ": " + "#" + number + identifier2 + ";";
        else if(number != null )
            return identifier1 + ": " + "#" + number + ";";
        else if(identifier2 != null)
            return identifier1 + ": " + "#" + identifier2 + ";";
        else
            return identifier1 + ": " + "#" + ";";

    }
}

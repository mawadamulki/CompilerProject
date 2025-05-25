package AST.ComponentDecleration.HTML.Style;

public class ExtenHex implements Extention{
    String number;
    String identifier;

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getIdentifier() {
        return identifier;
    }

    public void setIdentifier(String identifier) {
        this.identifier = identifier;
    }

    @Override
    public String toString() {
        if(number != null && identifier != null)
            return "#" + number + identifier ;
        else if(number != null && identifier == null)
            return "#" + number;
        else if(identifier != null && number == null)
            return "#" + identifier;
        else
            return "#";
    }
}


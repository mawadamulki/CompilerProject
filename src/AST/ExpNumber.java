package AST;

public class ExpNumber implements Expression{
    String number;

    public String getNumber() {
        return number;
    }
    public void setNumber(String number) {
        this.number = number;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(number);
        return stringBuilder.toString();
    }
}

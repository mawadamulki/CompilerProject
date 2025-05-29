package SemanticErrors;

public class BindingErrorException extends Exception{
    private final String name;
    private final int line;
    private final int charPosition;

    public BindingErrorException(String name, int line, int charPosition) {
        super("Binding Error detected for: " + name);
        this.name = name;
        this.line = line;
        this.charPosition = charPosition;
    }

    public String getname() {
        return name;
    }

    public int getLine() {
        return line;
    }

    public int getCharPosition() {
        return charPosition;
    }

    public String getFormattedMessage() {
        return String.format("[Line %d:%d] BindingError: %s is already defined",
                line, charPosition, name);
    }
}

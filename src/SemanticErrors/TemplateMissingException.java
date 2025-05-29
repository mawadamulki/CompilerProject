package SemanticErrors;

public class TemplateMissingException extends Exception {
    private final int line;
    private final int charPosition;

    public TemplateMissingException( int line, int charPosition) {
        super("Missing template for component: ");
        this.line = line;
        this.charPosition = charPosition;
    }

    public int getLine() {
        return line;
    }

    public int getCharPosition() {
        return charPosition;
    }

    public String getFormattedMessage() {
        return String.format("[Line %d:%d] Component '%s' is missing both template and templateUrl",
                line, charPosition);
    }
}
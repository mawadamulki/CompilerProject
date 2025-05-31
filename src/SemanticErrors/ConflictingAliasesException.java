package SemanticErrors;

public class ConflictingAliasesException extends Exception {
    private final String attName;
    private final int line;
    private final int charPosition;

    public ConflictingAliasesException(String attName, int line, int charPosition) {
        super("Attribute Conflicting detected for: " + attName);
        this.attName = attName;
        this.line = line;
        this.charPosition = charPosition;
    }

    public String getAttName() {
        return attName;
    }

    public int getLine() {
        return line;
    }

    public int getCharPosition() {
        return charPosition;
    }

    public String getFormattedMessage() {
        return String.format("[Line %d:%d] Attribute Conflicting Error: %s is already defined",
                line, charPosition, attName);
    }
}
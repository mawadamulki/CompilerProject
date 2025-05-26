package SemanticErrors;

public class SelectorCollisionsException extends Exception {
    private final String selector;
    private final int line;
    private final int charPosition;

    public SelectorCollisionsException(String selector, int line, int charPosition) {
        super("Selector collision detected for: " + selector);
        this.selector = selector;
        this.line = line;
        this.charPosition = charPosition;
    }

    public String getSelector() {
        return selector;
    }

    public int getLine() {
        return line;
    }

    public int getCharPosition() {
        return charPosition;
    }

    public String getFormattedMessage() {
        return String.format("[Line %d:%d] Selector collision: %s is already defined",
                line, charPosition, selector);
    }
}
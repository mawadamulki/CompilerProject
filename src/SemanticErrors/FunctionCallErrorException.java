package SemanticErrors;

public class FunctionCallErrorException extends RuntimeException {

  private final String functionName;
  private final int line;
  private final int charPosition;

  public FunctionCallErrorException(String functionName, int line, int charPosition) {
    super("Selector collision detected for: " + functionName);
    this.functionName = functionName;
    this.line = line;
    this.charPosition = charPosition;
  }

  public String getSelector() {
    return functionName;
  }

  public int getLine() {
    return line;
  }

  public int getCharPosition() {
    return charPosition;
  }

  public String getFormattedMessage() {
    return String.format("[Line %d:%d] Function Call Error : %s is not a function",
            line, charPosition, functionName);
  }
}

package AST;

import java.util.ArrayList;
import java.util.List;

public class ExpId implements Expression{
    DotIdentifier dotIdentifier;

    public DotIdentifier getDotIdentifier() {
        return dotIdentifier;
    }

    public void setDotIdentifier(DotIdentifier dotIdentifier) {
        this.dotIdentifier = dotIdentifier;
    }

    @Override
    public String toString() {
        return dotIdentifier.toString();
    }
}

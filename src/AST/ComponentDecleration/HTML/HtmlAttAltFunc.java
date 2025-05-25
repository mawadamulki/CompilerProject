package AST.ComponentDecleration.HTML;

import AST.Expression;

import java.util.ArrayList;
import java.util.List;

public class HtmlAttAltFunc implements AttributeHTML{
    List<Expression> expression = new ArrayList<Expression>();

    public List<Expression> getExpression() {
        return expression;
    }

    public void setExpression(List<Expression> expression) {
        this.expression = expression;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();

        for (int i = 0; i < expression.size(); i++) {
            if(i != expression.size() - 1){
                stringBuilder.append(expression.get(i)).append("+ ");
            } else {
                stringBuilder.append(expression.get(i));
            }
        }
        return "[alt]= \"" + stringBuilder.toString() + "\"";
    }
}

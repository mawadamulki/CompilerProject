package AST.ComponentDecleration.HTML;

import AST.Expression;

import java.util.List;
import java.util.ArrayList;

public class TagBodyExpressionExc implements TagBody{
    List<Expression> expression = new ArrayList<Expression>();
    String  c ;

    public List<Expression> getExpression() {
        return expression;
    }
    public void setExpression(List<Expression> expression) {
        this.expression = expression;
    }

    public String getC() {
        return c;
    }
    public void setC(String c) {
        this.c = c;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();

        for (int i = 0; i < expression.size(); i++) {
            if(i != expression.size() - 1){
                stringBuilder.append(expression.get(i)).append(" ");
            } else {
                stringBuilder.append(expression.get(i));
            }
        }
        if(c != null)
            return stringBuilder.toString() + c ;
        else
            return stringBuilder.toString();
    }
}

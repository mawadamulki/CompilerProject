package AST.ClassDecleration;

import AST.Expression;

import java.util.ArrayList;
import java.util.List;

public class FuncCallBodyexp implements FunctionCallBody{
    List<Expression> expressions = new ArrayList<Expression>();

    public List<Expression> getExpressions() {
        return expressions;
    }
    public void setExpressions(List<Expression> expressions) {
        this.expressions = expressions;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();

        for (int i = 0; i < expressions.size(); i++) {
            if(i != expressions.size() - 1){
                stringBuilder.append(expressions.get(i)).append(", ");
            } else {
                stringBuilder.append(expressions.get(i));
            }
        }

        return stringBuilder.toString();

    }
}

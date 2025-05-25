package AST.ClassDecleration;

import AST.Expression;

public class ClassBodyVariable implements ClassBody{
    String identifier;
    Expression expression;

    public String getIdentifier(){
        return identifier;
    }
    public void setIdentifier(String identifier){
        this.identifier = identifier;
    }

    public Expression getExpression(){
        return expression;
    }
    public void setExpression(Expression expression){
        this.expression = expression;
    }

    public String toString(){
        return identifier +" ="+ expression +";";
    }
}

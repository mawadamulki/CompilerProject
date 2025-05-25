package AST.ClassDecleration;


import AST.Expression;

public class FuncBodyReturn implements FunctionBody{
    Expression expression;

    public Expression getExpression(){
        return expression;
    }
    public void setExpression(Expression expression){
        this.expression = expression;
    }

    public String toString(){
        return "return "+ expression +" ;";
    }
}
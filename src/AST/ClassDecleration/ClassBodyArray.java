package AST.ClassDecleration;


public class ClassBodyArray implements ClassBody{
    String string1;
    String string2;

    public String getString1(){
        return string1;
    }
    public void setString1(String string1){
        this.string1 = string1;
    }

    public String getString2(){
        return string2;
    }
    public void setString2(String string2){
        this.string2 = string2;
    }

    public String toString(){
        return string1 +" : "+ string2 +"[] = [];";
    }

}
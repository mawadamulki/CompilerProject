package AST;


public class Parameter{
    String id1;
    String id2;

    public String getId1(){
        return id1;
    }
    public void setId1(String id1){
        this.id1 = id1;
    }

    public String getId2(){
        return id2;
    }
    public void setId2(String id2){
        this.id2 = id2;
    }

    public String toString(){
        return id1 +" : "+ id2;
    }
}
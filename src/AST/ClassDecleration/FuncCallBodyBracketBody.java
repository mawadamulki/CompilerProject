package AST.ClassDecleration;

import java.util.ArrayList;
import java.util.List;

public class FuncCallBodyBracketBody implements FunctionCallBody{
    List<Body> body = new ArrayList<Body>();

    public List<Body> getBody() {
        return body;
    }

    public void setBody(List<Body> body) {
        this.body = body;
    }

    @Override
    public String toString() {

        StringBuilder stringBuilder = new StringBuilder();

        for (int i = 0; i < body.size(); i++) {
            if(i != body.size() - 1){
                stringBuilder.append(body.get(i)).append(", \n");
            } else {
                stringBuilder.append(body.get(i));
            }
        }

        return "{\n" + stringBuilder.toString() + ",\n}";
    }
}

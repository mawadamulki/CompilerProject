package AST;


import java.util.ArrayList;
import java.util.List;


public class AppInterface implements AppContent{
List<Parameter> interfaceDecl = new ArrayList<Parameter>() ;
String identifier;

public List<Parameter> getInterfaceDecl(){
    return interfaceDecl;
}
public void setInterfaceDecl(List<Parameter> interfaceDecl){
    this.interfaceDecl = interfaceDecl;
}

public String getIdentifier(){
    return identifier;
}
public void setIdentifier(String identifier){
    this.identifier = identifier;
}


public String toString(){
    StringBuilder stringBuilder = new StringBuilder();

    for (int i = 0; i < interfaceDecl.size(); i++) {
        if(i != interfaceDecl.size() - 1){
            stringBuilder.append(interfaceDecl.get(i)).append(";\n");
        } else {
            stringBuilder.append(interfaceDecl.get(i));
        }
    }

    return "interface " + identifier + "{\n" + stringBuilder.toString() +";\n}";
}

}
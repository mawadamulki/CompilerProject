package AST;


import java.util.ArrayList;
import java.util.List;


public class AppService implements AppContent{
String service;

public String getService(){
    return service;
}
public void setService(String service){
    this.service = service;
}

public String toString(){
    return "injectable (providedIn :"+ service + ") ";
}
}
package AST.ClassDecleration;


import AST.AppContent;

import java.util.ArrayList;
import java.util.List;


public class AppClass implements AppContent {

    List<ClassBody> appClass = new ArrayList<ClassBody>();

    public List<ClassBody> getAppClass(){
        return appClass;
    }
    public void setAppClass(List<ClassBody> appClass){
        this.appClass = appClass;
    }

    public String toString(){
        StringBuilder stringBuilder = new StringBuilder();

        for (int i = 0; i < appClass.size(); i++) {
            if(i != appClass.size() - 1){
                stringBuilder.append(appClass.get(i)).append(" \n");
            } else {
                stringBuilder.append(appClass.get(i));
            }
        }


        return "export class AppComponent{ \n" + stringBuilder.toString() + "\n}";
    }


}
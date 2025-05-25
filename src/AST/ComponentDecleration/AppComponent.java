package AST.ComponentDecleration;


import AST.AppContent;

import java.util.ArrayList;
import java.util.List;


public class AppComponent implements AppContent {
    List<ComponentData> componentData = new ArrayList<ComponentData>();

    public List<ComponentData> getComponentData() {
        return componentData;
    }
    public void setComponentData(List<ComponentData> componentData) {
        this.componentData = componentData;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();

        for (int i = 0; i < componentData.size(); i++) {
            if(i != componentData.size() - 1){
                stringBuilder.append(componentData.get(i)).append(", \n");
            } else {
                stringBuilder.append(componentData.get(i));
            }
        }
        return "@Component({ \n" + stringBuilder.toString() + "})";
    }
}
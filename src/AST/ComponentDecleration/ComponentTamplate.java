package AST.ComponentDecleration;

import AST.ComponentDecleration.HTML.Html;

import java.util.ArrayList;
import java.util.List;

public class ComponentTamplate implements ComponentData{
    List<Html> html = new ArrayList<Html>();

    public List<Html> getHtml() {
        return html;
    }

    public void setHtml(List<Html> html) {
        this.html = html;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();

        for (int i = 0; i < html.size(); i++) {
            if(i != html.size() - 1){
                stringBuilder.append(html.get(i)).append(" \n");
            } else {
                stringBuilder.append(html.get(i));
            }
        }
        return "tamplate: ` \n" + stringBuilder.toString() + "\n`\n";
    }
}

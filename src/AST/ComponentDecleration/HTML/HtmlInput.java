package AST.ComponentDecleration.HTML;

import java.util.ArrayList;
import java.util.List;

public class HtmlInput implements Html,TagBody{
    List<AttributeHTML> attributeHTML = new ArrayList<AttributeHTML>();

    public List<AttributeHTML> getAttributeHTML() {
        return attributeHTML;
    }

    public void setAttributeHTML(List<AttributeHTML> attributeHTML) {
        this.attributeHTML = attributeHTML;
    }


    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();

        for (int i = 0; i < attributeHTML.size(); i++) {
            if(i != attributeHTML.size() - 1){
                stringBuilder.append(attributeHTML.get(i)).append(" \n");
            } else {
                stringBuilder.append(attributeHTML.get(i));
            }
        }

        return "<input " + stringBuilder.toString() + " >";
    }
}

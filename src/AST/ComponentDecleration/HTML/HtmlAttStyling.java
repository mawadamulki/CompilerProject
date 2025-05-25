package AST.ComponentDecleration.HTML;

import AST.ComponentDecleration.HTML.Style.StyleElement;

import java.util.ArrayList;
import java.util.List;

public class HtmlAttStyling implements AttributeHTML{
    List<StyleElement> styleElement = new ArrayList<StyleElement>();

    public List<StyleElement> getStyleElement() {
        return styleElement;
    }

    public void setStyleElement(List<StyleElement> styleElement) {
        this.styleElement = styleElement;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();

        for (int i = 0; i < styleElement.size(); i++) {
            if(i != styleElement.size() - 1){
                stringBuilder.append(styleElement.get(i)).append(" ");
            } else {
                stringBuilder.append(styleElement.get(i));
            }
        }

        return "style= \"" + stringBuilder.toString() + "\"";
    }
}

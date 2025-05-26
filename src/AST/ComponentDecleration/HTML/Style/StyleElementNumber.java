package AST.ComponentDecleration.HTML.Style;


import AST.Expression;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class StyleElementNumber implements StyleElement {
    String identifier;
    String number ;
    List<Extention> extentions = new ArrayList<>();

    public String getIdentifier() {
        return identifier;
    }
    public void setIdentifier(String identifier) {
        this.identifier = identifier;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public List<Extention> getExtentions() {
        return extentions;
    }

    public void setExtentions(List<Extention> extentions) {
        this.extentions = extentions;
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(identifier).append(": ");

        sb.append(number);

            for( int j = 0 ; j< extentions.size() ; j++) {
                sb.append(" ");
                sb.append(extentions.get(j).toString());
            }


        sb.append(";");

        return sb.toString();
    }
}

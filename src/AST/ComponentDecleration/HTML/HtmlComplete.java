package AST.ComponentDecleration.HTML;

import java.util.ArrayList;
import java.util.List;

public class HtmlComplete implements Html,TagBody{
    List<TagBody> tagBody = new ArrayList<TagBody>();
    OpenTag openTag ;
    CloseTag closeTag;

    public List<TagBody> getTagBody() {
        return tagBody;
    }
    public void setTagBody(List<TagBody> tagBody) {
        this.tagBody = tagBody;
    }

    public OpenTag getOpenTag() {
        return openTag;
    }
    public void setOpenTag(OpenTag openTag) {
        this.openTag = openTag;
    }

    public CloseTag getCloseTag() {
        return closeTag;
    }
    public void setCloseTag(CloseTag closeTag) {
        this.closeTag = closeTag;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();

        for (int i = 0; i < tagBody.size(); i++) {
            if(i != tagBody.size() - 1){
                stringBuilder.append(tagBody.get(i)).append(" \n");
            } else {
                stringBuilder.append(tagBody.get(i));
            }
        }

        return openTag.toString() + stringBuilder.toString() + closeTag.toString();
    }
}

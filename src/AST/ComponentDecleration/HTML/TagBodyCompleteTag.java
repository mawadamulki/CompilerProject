package AST.ComponentDecleration.HTML;

public class TagBodyCompleteTag implements TagBody{
    TagBodyCompleteTag completeTag;

    public TagBodyCompleteTag getCompleteTag() {
        return completeTag;
    }
    public void setCompleteTag(TagBodyCompleteTag completeTag) {
        this.completeTag = completeTag;
    }

    @Override
    public String toString() {
        return completeTag.toString();
    }
}

package AST.ComponentDecleration.HTML;

public class TagBodyInputTag implements TagBody{
    TagBodyInputTag inputTag;

    public TagBodyInputTag getInputTag() {
        return inputTag;
    }
    public void setInputTag(TagBodyInputTag inputTag) {
        this.inputTag = inputTag;
    }

    @Override
    public String toString() {
        return inputTag.toString();
    }
}

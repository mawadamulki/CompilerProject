package AST.ComponentDecleration.HTML;

public class TagBodyImageTag implements TagBody {
    TagBodyImageTag imageTag;

    public TagBodyImageTag getImageTag() {
        return imageTag;
    }
    public void setImageTag(TagBodyImageTag imageTag) {
        this.imageTag = imageTag;
    }


    @Override
    public String toString() {
        return imageTag.toString();
    }
}

package AST.ComponentDecleration.HTML;

public class TagBodyCommentTag implements TagBody{
    TagBodyCommentTag commentTag;

    public TagBodyCommentTag getCommentTag() {
        return commentTag;
    }
    public void setCommentTag(TagBodyCommentTag commentTag) {
        this.commentTag = commentTag;
    }

    @Override
    public String toString() {
        return commentTag.toString();
    }
}

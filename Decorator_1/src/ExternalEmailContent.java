public class ExternalEmailContent extends EmailDecorator{

    public ExternalEmailContent(EmailContent decorator) {
        super(decorator);
    }
    private String addDisclainer(String content){
        return content + " : disclaner";
    }

    public String getContent() {
        String content = super.getContent();
        String externalContent = addDisclainer(content);
        return externalContent;
    }
}

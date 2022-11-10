public class ExternalSecureEmailContent extends BasicEmailContent{

    public ExternalSecureEmailContent(String content) {
        super(content);
    }

    private String encrypt(String content){
        return content + " : encrypted";
    }
    private String addDisclainer(String content){
        return content + " : disclaner";
    }

    public String getContent() {
        String content = super.getContent();
        String encryptedContent = encrypt(content);
        String ExternalEncryptedContent = addDisclainer(encryptedContent);

        return ExternalEncryptedContent;
    }
}

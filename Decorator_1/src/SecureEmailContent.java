public class SecureEmailContent extends EmailDecorator{

    public SecureEmailContent(EmailContent decorator) {
        super(decorator);
    }
    private String encrypt(String content){
        return content + " : encrypted";
    }

    public String getContent() {
        String content = super.getContent();
        String encryptedContent = encrypt(content);
        return encryptedContent;
    }
}

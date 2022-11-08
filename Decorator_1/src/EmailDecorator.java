public abstract class EmailDecorator implements EmailContent {

    public EmailContent decorate;
    public EmailDecorator(EmailContent decorate) {
        this.decorate = decorate;
    }

    public String getContent(){
        return decorate.getContent();
    }

}

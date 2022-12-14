public class ExternalEmailContent extends EmailDecorator{

    public ExternalEmailContent(EmailContent decorator) {
        super(decorator);
    }
    private String addDisclainer(String content){
        return content + " : disclaner";
    } // super 핵심

    public String getContent() {
        String content = super.getContent();
        /*
        super 핵심 --> 부모인 추상클래스 EmailDecorator의 속성 EmailContent decorate 의
        getContent()  !!-> 이전단계(상위레벨)에서의 값 호출      ex) Basic의 insang
         */
        String externalContent = addDisclainer(content);
        return externalContent;
    }
}

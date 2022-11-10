public class Main {
    public static void main(String[] args) {
        EmailContent b = new BasicEmailContent("insang");
        EmailContent d1 = new SecureEmailContent(b);
        EmailContent d2 = new ExternalEmailContent(d1);
        System.out.println(d2.getContent());

    }
}

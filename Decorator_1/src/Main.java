public class Main {
    public static void main(String[] args) {
        EmailContent d = new BasicEmailContent("insang");
        EmailContent d1 = new SecureEmailContent(d);
        EmailContent d2 = new ExternalEmailContent(d1);
        System.out.println(d2.getContent());

    }
}

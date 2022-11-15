public class Main {
    public static void main(String[] args) {
        EmailContent d0 = new BasicEmailContent("insang");
        EmailContent d1 = new SecureEmailContent(d0);
        EmailContent d2 = new ExternalEmailContent(d1);
        System.out.println(d2.getContent());

    }
}

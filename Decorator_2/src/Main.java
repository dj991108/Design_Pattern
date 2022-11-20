public class Main {
    public static void main(String[] args) {
        Report r = new Sharp(new Star(new BasicReport("Design Pattern")));
        r.displayContent();
    }
}
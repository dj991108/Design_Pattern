public class Main {
    // brigde
    public static void main(String[] args) {
        CountDisplay d = new CountDisplay(new StringDisplayImpl("Hello, Universe!"));
        d.multiDisplay(5);
    }
}

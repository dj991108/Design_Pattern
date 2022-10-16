public class Main {
    public static void main(String[] args) {

        FileNew file = new FileNew();
        Command cmd1 = new FileNewCmd(file);

        MenuItem m = new MenuItem();
        m.setCmd(cmd1);
        m.buttonPressed();
    }
}

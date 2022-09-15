import java.util.Optional;

public class Main {
    private static final int  NUM = 5;

    public static void main(String[] args) {
        User[] users = new User[NUM];

        for (int j = 0; j < NUM; j++) {
            users[j] = new User("user" + j);
            users[j].start();
        }
    }
}

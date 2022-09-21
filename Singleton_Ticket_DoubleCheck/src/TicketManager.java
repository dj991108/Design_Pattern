import java.util.Optional;

public class TicketManager {
    private static volatile TicketManager instance; // Volatile : Happens-Before Guarantee = 메모리 할당, 초기화를 무조건 먼저시킨다
    private int count;
    private final int LIMITS = 2;

    private TicketManager() {
        count = 0;
    }

    public static TicketManager getInstance() {

        if (instance == null) {
            synchronized (TicketManager.class) { // this 인자로 주면 X
                if (instance == null)
                    instance = new TicketManager();
            }
        }
        return instance;
    }

    public synchronized Optional<Ticket> issue() {
        if (count >= LIMITS) return Optional.empty();
        Ticket t = new Ticket(count);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e){
            e.printStackTrace();
        }

        count++;
        return Optional.of(t);
    }
}

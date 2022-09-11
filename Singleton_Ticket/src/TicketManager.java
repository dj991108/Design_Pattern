import java.util.Optional;

public class TicketManager {
    private int count;
    private final int LIMITS = 2;
    private TicketManager() { // private
        count = 0;
    }

    public static TicketManager instance; // Lazy Initialization
    public static TicketManager getInstance(){ //인스턴스 생성 메소드 생성
        if(instance == null){
            instance = new TicketManager();
        }
        return instance;
    }
    public Optional<Ticket> issue() {
        if (count >= LIMITS) return Optional.empty();
        return Optional.of(new Ticket(count++));
    }
    /*
    Optional<T> : null이 올 수 있는 값을 감싸는 Wrapper 클래스 (NPE를 방지)
    - 메소드 -
    .empty()  /  .of(value)  / .ofNullbale(value)
     */
}

import java.util.Optional;

// User 쓰레드 생성
public class User extends Thread{
    public User(String name) {
        super(name);
    }
    public void run() {
        TicketManager mgr = TicketManager.getInstance();
        Optional<Ticket> t = mgr.issue();
        watchMovie(t);
    }

    private void watchMovie(Optional<Ticket> t) {
        int serialNum = t.map(Ticket::getSerialNum).orElse(-1);
        // Ticket != null -> getSerialNum 메소드 실행
        // Ticket == null -> -1 리턴
        boolean hasTicket = serialNum >=0 ? true : false;
        if (hasTicket)
            System.out.println(Thread.currentThread().getName() +
                    " is watching movie with ticket"+ serialNum);
    }
}

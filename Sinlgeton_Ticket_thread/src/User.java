import java.util.Optional;

public class User extends Thread{
    public User(String name) {
        super(name);
    }
    public void run() {
        TicketManager mgr = TicketManager.getInstance();
//        System.out.println(mgr.toString());
        Optional<Ticket> t = mgr.issue();
        watchMovie(t);
    }

    private void watchMovie(Optional<Ticket> t) {
        int serialNum = t.map(Ticket::getSerialNum).orElse(-1);
        boolean hasTicket = serialNum >=0 ? true : false;
        if (hasTicket)
            System.out.println(Thread.currentThread().getName() +
                    " watching Movie with"+ serialNum);

    }
}

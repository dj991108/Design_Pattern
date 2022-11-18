import java.util.ArrayList;
import java.util.List;

public abstract class Subject {
    private List<Observer> observers = new ArrayList<Observer>();

    public void atatch(Observer o){
        observers.add(o);
    }

    public void updateObservers() {
        for (Observer o : observers) {
            o.update();
        }
    }


}

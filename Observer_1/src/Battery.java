import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;

// Subject 추상클래스로 구현하기

public class Battery extends Subject{
    private int level = 100;
    private BatteryLevelDisplay display;
    private LowBatteryWarning warning;
    private List<Observer> observer = new ArrayList<>();

    public void atatch(Observer o){
        observer.add(o);
    }
    public void consume(int amount) {
        level -= amount;
        updateObservers();
    }
    private void updateObservers() {
        for (Observer o : observer) o.update();
    }
    public int getLevel(){
        return level;
    }
}

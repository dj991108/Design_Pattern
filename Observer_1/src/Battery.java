import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;

// Subject 추상클래스로 구현하기

public class Battery extends Subject{
    private int level = 100;
//    private BatteryLevelDisplay display;
//    private LowBatteryWarning warning;
//    private List<Observer> observers = new ArrayList<Observer>();

    public void consume(int amount) {
        level -= amount;
        updateObservers();
    }
    public int getLevel(){
        return level;
    }
}

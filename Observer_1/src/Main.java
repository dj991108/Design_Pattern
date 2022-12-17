public class Main {
    // Observer Pattern!
    public static void main(String[] args) {
        Battery battery = new Battery();
        Observer display = new BatteryLevelDisplay(battery);
        Observer warning = new LowBatteryWarning(battery);

        battery.atatch(display);
        battery.atatch(warning);

        battery.consume(20);
        battery.consume(50);
        battery.consume(10);
    }
}

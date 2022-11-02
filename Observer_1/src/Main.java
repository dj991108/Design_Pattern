public class Main {

    public static void main(String[] args) {
        Battery battery = new Battery();
        BatteryLevelDisplay display = new BatteryLevelDisplay(battery);
        LowBatteryWarning warning = new LowBatteryWarning(battery);

        battery.atatch(display);
        battery.atatch(warning);

        battery.consume(20);
        battery.consume(50);
        battery.consume(10);


    }
}

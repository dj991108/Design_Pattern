public class Shirts extends ParcelItem{

    public Shirts(int weight) {
        super(weight);
    }
    public int price() {
        return this.weight/100*200;
    }
}

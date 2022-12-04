import java.util.ArrayList;
import java.util.List;

public class Box extends ParcelItem{

    // Box클래스도 하나의 ParcelItem으로 List에 들어가기 가능(Box안의 Box)
    public Box(int weight) {
        super(weight);
    }
    private List<ParcelItem> items = new ArrayList<>();
    public void addItems(ParcelItem item) { items.add(item); }


    public int price() {
        int totalPrice = 0;


        for (ParcelItem item : items) {
            totalPrice += item.price();
        }
        return totalPrice;
    }
}

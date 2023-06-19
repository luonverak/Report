package Report;
import java.util.ArrayList;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

public class ListProduct {

    private int id;
    private String name;
    private int qty;
    private float price;

    public ListProduct() {
    }

    public ListProduct(int id, String name, int qty, float price) {
        this.id = id;
        this.name = name;
        this.qty = qty;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getQty() {
        return qty;
    }

    public float getPrice() {
        return price;
    }

    public static List<ListProduct> getList() {
        return list;
    }
    
    static List<ListProduct> list=new ArrayList<>();
}

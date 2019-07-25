import java.util.UUID;

/**
 * 请求类
 */
public class PurchaseRequest {
    private String id;
    private int type;
    private int price;

    public PurchaseRequest(int type, int price) {
        this.type = type;
        this.price = price;
        this.id = UUID.randomUUID().toString().toUpperCase().replace("-","");
    }

    public String getId() {
        return id;
    }

    public int getType() {
        return type;
    }

    public int getPrice() {
        return price;
    }
}

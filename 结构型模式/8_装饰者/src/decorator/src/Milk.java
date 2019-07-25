/**
 * 牛奶
 */
public class Milk extends Decorator {
    public Milk(Drink obj) {
        super(obj);
        setDes(" 牛奶");
        setPrice(1.5f);
    }
}

/**
 * 装饰者
 */
public class Decorator extends Drink{
    private Drink obj;
    public Decorator(Drink obj){
        this.obj = obj;
    }
    /**
     * 计算费用的抽象方法
     *
     * @return
     */
    @Override
    public float cost() {
        //getPrice 自己价格
        return super.getPrice() + obj.cost();
    }

    @Override
    public String getDes() {
        //super.getDes()  输出了被装饰者的信息
        return super.des + " " +super.getPrice() + " && " + super.getDes();
    }
}

package simpleFactory.c_工厂方法模式.pizza;

/**
 * @Author:
 * @Date:2019/7/15
 * @Description:simpleFactory.c_工厂方法模式
 * @Version:1.0
 */
public abstract class Pizza {
    private String name;
    /**
     * 选择原材料
     */
    public abstract void prepare();

    public void bake(){
        System.out.println("制作披萨");
    }

    public void cut(){
        System.out.println("切披萨");
    }

    public void box(){
        System.out.println("打包");
    }

    public void setName(String name){
        this.name = name;
    }
}

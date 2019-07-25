package simpleFactory.b_简单工厂实现实例;

/**
 * Pizza抽象类
 */
public abstract class Pizza {
    private String name;
    /**
     * 准备原材料
     */
    abstract void prepare();

    /**
     * 烘烤
     */
    void bake(){
        System.out.println(name+":烘烤..");
    }

    /**
     * 切割
     */
    void cat(){
        System.out.println(name+":切割..");
    }

    /**
     * 打包
     */
    void box(){
        System.out.println(name + ":打包..");
    }

    public void setName(String name) {
        this.name = name;
    }
}

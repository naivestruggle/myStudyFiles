package pizza;

/**
 * 披萨
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

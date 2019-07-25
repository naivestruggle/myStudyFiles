package improve;

/**
 * 抽象的建造者
 */
public abstract class HouseBuilder {
    protected House house = new House();

    //将建造的流程写好 ， 抽象的方法
    public abstract void buildBasic();
    public abstract void buildWalls();
    public abstract void roofed();

    /**
     * 建造房子 ，将建好的房子返回
     * @return
     */
    public House buildHouse(){
        return house;
    }

}

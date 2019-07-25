package improve;

/**
 * @Author:
 * @Date:2019/7/16
 * @Description:improve
 * @Version:1.0
 */
public class HighBuilding extends HouseBuilder {
    @Override
    public void buildBasic() {
        house.setBaise("100米");
        System.out.println("高楼打地基100米");
    }

    @Override
    public void buildWalls() {
        house.setWall("20cm");
        System.out.println("高楼砌墙20cm");
    }

    @Override
    public void roofed() {
        house.setRoofed("高楼封顶有200米");
        System.out.println("高楼封顶");
    }
}

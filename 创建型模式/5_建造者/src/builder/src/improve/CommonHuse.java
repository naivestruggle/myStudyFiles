package improve;

/**
 * @Author:
 * @Date:2019/7/16
 * @Description:improve
 * @Version:1.0
 */
public class CommonHuse extends HouseBuilder {
    @Override
    public void buildBasic() {
        house.setBaise("20米");
        System.out.println("普通房子打地基20米");
    }

    @Override
    public void buildWalls() {
        house.setWall("10cm");
        System.out.println("普通房子砌墙10cm");
    }

    @Override
    public void roofed() {
        house.setRoofed("高楼封顶有10米");
        System.out.println("普通房子封顶");
    }
}

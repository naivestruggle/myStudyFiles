package improve;

/**
 * @Author:
 * @Date:2019/7/25
 * @Description:improve
 * @Version:1.0
 */
public class Duck {
    /**
     * 属性，策略接口
     */
    Fly fly;

    //其他属性也是和策略接口关联的


    public Duck(Fly fly) {
        this.fly = fly;
    }

    public void fly(){
        fly.fly();
    }
}

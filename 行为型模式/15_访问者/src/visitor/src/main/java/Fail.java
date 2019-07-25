/**
 * @Author:
 * @Date:2019/7/20
 * @Description:PACKAGE_NAME
 * @Version:1.0
 */
public class Fail extends Action {
    /**
     * 得到男性 的测评
     *
     * @param man
     */
    @Override
    public void getManResult(Man man) {
        System.out.println("男人给的评价是 失败 ...");
    }

    /**
     * 得到女性 的测评
     *
     * @param woman
     */
    @Override
    public void getWomanResult(Woman woman) {
        System.out.println("女人给的评价是 失败 ...");
    }
}

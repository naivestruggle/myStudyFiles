/**
 * 女人
 * 说明：
 *  1、这里使用到了双分派，
 *      即首先在客户端程序中，将具体状态作为参数传递woman中（第一次分派）
 *      然后woman类调用作为参数的“具体方法”中的方法getWomanResult(),同时将自己（this）作为参数传入（第二次分派）
 */
public class Woman extends Person {
    /**
     * 提供一个方法，让访问者可以访问
     *
     * @param action
     */
    @Override
    public void accept(Action action) {
        action.getWomanResult(this);
    }
}

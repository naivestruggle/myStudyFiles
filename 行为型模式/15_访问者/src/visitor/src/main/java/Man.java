/**
 * 男人
 */
public class Man extends Person {
    /**
     * 提供一个方法，让访问者可以访问
     *
     * @param action
     */
    @Override
    public void accept(Action action) {
        action.getManResult(this);
    }
}

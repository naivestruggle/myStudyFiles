package Runtime类使用单例实现;

/**
 * @Author:
 * @Date:2019/7/15
 * @Description:Runtime类使用单例实现
 * @Version:1.0
 */
public class Main {
    public static void main(String[] args) {
        Runtime runtime = Runtime.getRuntime();
    }
}

//使用饿汉式
class Runtime {
    private static Runtime currentRuntime = new Runtime();
    public static Runtime getRuntime() {
        return currentRuntime;
    }
    private Runtime() {}
}

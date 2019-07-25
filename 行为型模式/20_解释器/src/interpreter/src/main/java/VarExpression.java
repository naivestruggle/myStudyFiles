import java.util.HashMap;

/**
 * 变量的解释器
 */
public class VarExpression extends Expression {
    /**
     * key=a b c
     */
    private String key;

    public VarExpression(String key) {
        this.key = key;
    }

    /**
     * 根据变量名称，返回对应值
     * @param var {a=10,b=20}
     * @return
     */
    @Override
    public int interpreter(HashMap<String, Integer> var) {

        return var.get(this.key);
    }
}

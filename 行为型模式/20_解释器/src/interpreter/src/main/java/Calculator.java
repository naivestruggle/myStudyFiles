import java.util.HashMap;
import java.util.Stack;

/**
 * 计算器
 */
public class Calculator {
    /**
     * 定义表达式
     */
    private Expression expression;

    /**
     * 构造函数传参，并解析
     * @param expStr
     */
    public Calculator(String expStr) {
        //安排运算先后顺序
        Stack<Expression> stack = new Stack<>();
        //表达式拆分成字符数组
        char[] charArr = expStr.toCharArray();

        Expression left = null;
        Expression right = null;
        int len = charArr.length;

        //遍历我们的字符数组，即遍历[a,+,b]   针对不同情况做处理
        for(int i=0;i<len;i++){
            switch (charArr[i]){
                case '+':
                    left = stack.pop();
                    right = new VarExpression(String.valueOf(charArr[++i]));
                    stack.push(new AddExpression(left,right));
                    break;
                case '-':
                    left = stack.pop();
                    right = new VarExpression(String.valueOf(charArr[++i]));
                    stack.push(new SubExpression(left,right));
                    break;
                default:
                    //如果是一个Var   就创建要给VarExpression对象，并push到stack
                    stack.push(new VarExpression(String.valueOf(charArr[i])));
                    break;
            }
        }
        //当遍历完整个charArray数组后，stack就得到最后的Expression
        this.expression = stack.pop();
    }

    public int run(HashMap<String,Integer> var){
        //最后将表达式a+b和var={a=10,b=20}
        //然后传递给expression的interpreter进行解释执行
        return this.expression.interpreter(var);
    }
}

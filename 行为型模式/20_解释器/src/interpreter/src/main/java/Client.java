import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

/**
 * @Author:
 * @Date:2019/7/24
 * @Description:PACKAGE_NAME
 * @Version:1.0
 */
public class Client {
    public static void main(String[] args) throws IOException {
        //得到表达式  a+b
        String expStr = getExpStr();
        //给变量赋值  a=10 b=20
        HashMap<String,Integer> var = getValue(expStr);

        Calculator calculator = new Calculator(expStr);
        System.out.println("=====运算结果："+expStr+"="+calculator.run(var));
    }

    /**
     * 给变量赋值
     * @param expStr
     * @return
     * @throws IOException
     */
    private static HashMap<String, Integer> getValue(String expStr) throws IOException {
        HashMap<String , Integer> map = new HashMap<>();
        for(char ch:expStr.toCharArray()){
            if(ch != '+' && ch != '-'){
                System.out.println("请输入"+String.valueOf(ch)+"的值：");
                String in = (new BufferedReader(new InputStreamReader(System.in))).readLine();
                int value = Integer.valueOf(in);
                map.put(String.valueOf(ch),value);
            }
        }
        return map;
    }

    /**
     * 得到表达式
     * @return
     * @throws IOException
     */
    private static String getExpStr() throws IOException {
        System.out.println("请输入表达式：");
        return (new BufferedReader(new InputStreamReader(System.in))).readLine();
    }
}

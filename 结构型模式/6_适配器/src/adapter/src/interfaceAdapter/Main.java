package interfaceAdapter;

/**
 * @Author:
 * @Date:2019/7/16
 * @Description:interfaceAdapter
 * @Version:1.0
 */
public class Main {
    public static void main(String[] args) {
        PhoneListenerAdapt phoneListenerAdapt = new PhoneListenerAdapt() {
            /**
             * 充电
             */
            @Override
            public void onCharging() {
                System.out.println("正在充电....");
            }
        };

        phoneListenerAdapt.onCharging();
    }
}

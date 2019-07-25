package phone;

import brand.Brand;

/**
 * 折叠式手机类  继承了  抽象类Phone
 */
public class FoldedPhone extends Phone {
    public FoldedPhone(Brand brand) {
        super(brand);
    }

    @Override
    public void open(){
        super.open();
        System.out.println(" 折叠样式手机");
    }

    @Override
    public void close() {
        super.close();
        System.out.println(" 折叠样式手机");
    }

    @Override
    public void call() {
        super.call();
        System.out.println(" 折叠样式手机");
    }
}

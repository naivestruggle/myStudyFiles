package phone;

import brand.Brand;

/**
 * 手机   充当了桥的作用
 */
public abstract class Phone {
    //组合品牌
    private Brand brand;

    //构造器
    public Phone(Brand brand) {
        this.brand = brand;
    }

    public void open(){
        this.brand.open();
    }

    public void close(){
        brand.close();
    }

    public void call(){
        brand.call();
    }
}

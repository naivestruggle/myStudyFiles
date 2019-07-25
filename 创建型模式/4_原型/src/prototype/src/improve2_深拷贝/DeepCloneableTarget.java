package improve2_深拷贝;

import java.io.Serializable;

/**
 * @Author:
 * @Date:2019/7/16
 * @Description:improve2_深拷贝
 * @Version:1.0
 */
public class DeepCloneableTarget implements Serializable,Cloneable {

    private String cloneName;
    private String cloneClass;

    public DeepCloneableTarget(String cloneName, String cloneClass) {
        this.cloneName = cloneName;
        this.cloneClass = cloneClass;
    }

    //因为该类的属性，都是String,因此我们这里使用默认的clone方法即可
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}

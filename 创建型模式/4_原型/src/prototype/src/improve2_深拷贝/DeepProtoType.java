package improve2_深拷贝;

import java.io.*;

/**
 * @Author:
 * @Date:2019/7/16
 * @Description:improve2_深拷贝
 * @Version:1.0
 */
public class DeepProtoType implements Serializable,Cloneable {

    public String name;

    //引用类型
    public DeepCloneableTarget deepCloneableTarget;

    //深拷贝 - 方式1 ：使用clone方法
    @Override
    protected Object clone() throws CloneNotSupportedException {
        Object deep = null;
        //这里完成对基本数据类型和字符串属性的克隆
        deep = super.clone();

        //对引用类型的属性进行单独的处理
        DeepProtoType deepProtoType = (DeepProtoType) deep;
        //调用引用数据类型对象的clone方法  让它自己克隆  然后赋值给本类的引用类型
        deepProtoType.deepCloneableTarget = (DeepCloneableTarget) deepCloneableTarget.clone();
        return deepProtoType;
    }


    //深拷贝 - 方式2 ： 通过对象的序列化实现深拷贝（推荐使用）
    public Object deepClone(){
        //创建流对象
        ByteArrayOutputStream bos = null;
        ObjectOutputStream oos = null;
        ByteArrayInputStream bis = null;
        ObjectInputStream ois = null;
        Object target = null;
        try{
            //序列化
            bos = new ByteArrayOutputStream();
            oos = new ObjectOutputStream(bos);
            //当前这个对象以对象流的方式输出  如果成员变量中有引用型变量，也会被输出
            oos.writeObject(this);

            //反序列化
            bis = new ByteArrayInputStream(bos.toByteArray());
            ois = new ObjectInputStream(bis);
            target = ois.readObject();
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            try {
                bos.close();
                oos.close();
                bis.close();
                ois.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return target;
    }
}

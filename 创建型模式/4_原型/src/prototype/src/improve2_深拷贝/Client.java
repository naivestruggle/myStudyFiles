package improve2_深拷贝;

/**
 * @Author:
 * @Date:2019/7/16
 * @Description:improve2_深拷贝
 * @Version:1.0
 */
public class Client {
    public static void main(String[] args) throws CloneNotSupportedException {
        DeepProtoType deepProtoType = new DeepProtoType();
        deepProtoType.name = "松江";
        deepProtoType.deepCloneableTarget = new DeepCloneableTarget("黑旋风","李逵类");

        //方式1 - 使用clone方法 进行深拷贝
//        DeepProtoType clone = (DeepProtoType) deepProtoType.clone();

        //方式2 - 使用对象的序列化 进行深拷贝
        DeepProtoType clone = (DeepProtoType) deepProtoType.deepClone();

        //hashcode不相同  说明深拷贝成功
        System.out.println(deepProtoType.deepCloneableTarget.hashCode() == clone.deepCloneableTarget.hashCode());
    }
}

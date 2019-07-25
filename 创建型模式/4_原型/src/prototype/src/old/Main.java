package old;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author:
 * @Date:2019/7/16
 * @Description:old
 * @Version:1.0
 */
public class Main {
    public static void main(String[] args) {
        //new10次
        Sheep sheep = new Sheep("tom",1,"白色");


        Sheep sheep1 = new Sheep(sheep.getName(),sheep.getAge(),sheep.getColor());
        Sheep sheep2 = new Sheep(sheep.getName(),sheep.getAge(),sheep.getColor());
        Sheep sheep3 = new Sheep(sheep.getName(),sheep.getAge(),sheep.getColor());
        Sheep sheep4 = new Sheep(sheep.getName(),sheep.getAge(),sheep.getColor());
        Sheep sheep5 = new Sheep(sheep.getName(),sheep.getAge(),sheep.getColor());

        //......
    }
}

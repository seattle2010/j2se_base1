package _10接口内部类枚举;

/**
 * Created by E430 on 2017/7/23.
 */
interface IWalkablex {
    String NAME = "tom";
    void walk();
}

interface ISwimablex {
    int AGE = 18;

    void swim();

}
class Amimalsx {
}

//interface Bothx extends IWalkable, Iswimable {
//
//}

//猫
class Cat extends Amimalsx implements ISwimablex,IWalkablex {

    @Override
    public void swim() {
        System.out.println("swim"); 
    }

    @Override
    public void walk() {
        System.out.println("walk"); 
    }
}
// fish
public class InterfaceTest {
    public static void main(String[] args) {
        //Cat cat = new Cat();   //不是多态形式定义也是可以的 但是不推荐
        //cat.swim();
        //cat.walk();

        IWalkablex cat = new Cat();
        cat.walk();
    }
}

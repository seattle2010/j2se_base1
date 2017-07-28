package InterfaceDemo;

import Extends.AnimalDemo;

/**
 * Created by shi on 2017/7/25.
 */
//interface = abstract class
//interface 接口类名

interface IWalkable {
    public static final String name = "walk";

    public abstract void walk();
}
interface ISwimable {
    public static final String name = "swim";
    public abstract void swim();
}
//接口可以继承父类,并且接口可以多继承
interface IBothable extends IWalkable,ISwimable {
}
class Animalx {  }
class Cat extends Animalx implements IWalkable {
    public void walk() {
        System.out.println("走猫步");
    }
}

//鱼类
class Fish implements ISwimable {
    @Override
    public void swim() {
        System.out.println("游呀游");

    }
}

//青蛙
class Frog implements IWalkable, ISwimable {

    @Override
    public void walk() {
       System.out.println("青蛙跳");

}
    @Override
    public void swim() {
        System.out.println("蛙泳");

    }
}

public class InterfaceDemo {
    public static void main(String[] args) {
System.out.println("hello");
        IWalkable cat = new Cat();
        cat.walk();
        ISwimable fish = new Fish();
        fish.swim();
        Frog frog = new Frog();
        frog.swim();
        frog.walk();


//        接口和抽象类的区别:
//        相同点：
//        1):都位于继承的顶端，用于被其他实现或继承。
//        2):都不能实例化。
//        3):都可以定义抽象方法，其子类/实现类都必须覆写这些抽象方法。
//        不同：
//        1):接口没有构造方法，抽象类有构造方法。
//        2):抽象类可包含普通方法和抽象方法，接口只能包含抽象方法(Java8之前);
//        3):一个类只能继承一个直接父类(可能是抽象类)，接口是多继承的并且只支持一个类实现多个接口(接口弥补了Java的单继承)。
//        4):成员变量：接口里默认是public static final，抽象类是默认包权限。
//        5):方法：接口里默认是public abstract，抽象类默认是默认包访问权限。
//        6):内部类：接口里默认是public static，抽象类默认是默认包访问权限。
//        -----------------------------------------------------------
//
//                如果接口和实现类可以完成相同的功能,尽量使用接口,面向接口编程.
    }
}

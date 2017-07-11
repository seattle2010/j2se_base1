package _10接口内部类枚举;

/**
 * Created by E430 on 2017/7/9.
 */
interface IWalkable2 {

    void walk();

}

interface ISwimable2 {
    void swim();
}

interface Both extends IWalkable2, ISwimable2 {  //接口可以多继承

}

class Animal {
    //多余 站位的父类
}
//只有实现类才有意义
class Dog extends Animal implements IWalkable2 {


    @Override
    public void walk() {//实现类的范围必须大于父类 父类默认是public 所以实现类也必须是public修饰符
            System.out.println("走猫步");
    }

}

//第二个例子  多出这个  鱼
class Fish extends Animal implements ISwimable2 {

    @Override
    public void swim() {
        System.out.println("游呀游");
    }
}

//第三个例子 青蛙
class Frog extends Animal implements IWalkable2, ISwimable2 {
    @Override
    public void walk() {
        System.out.println("青蛙跳"); 
    }

    @Override
    public void swim() {
        System.out.println("青蛙游呀游");
    }
}

public class _01InterfaceDemo2 {
    public static void main(String[] args) {
        System.out.println("hello");
        //①　没有构造方法，也不能显示定义构造器，不能实例化。
        //new IWalkable();

        Dog dog = new Dog(); //这样是面向对象编程
        dog.walk();

        //面向接口编程 存在多态
        IWalkable2 dog1 = new Dog();
        dog1.walk();

        //鱼的实现
        ISwimable2 fish = new Fish();
        fish.swim();

        //如果继承了两个接口  就用实现类本身创建对象 这样都具有两者功能
        Frog frog = new Frog();
        frog.swim();
        frog.walk();


        //最后可以把抽象的三角形改成接口  很简单  就是extends换成implements
    }
}

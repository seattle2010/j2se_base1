package _8继承多态;

/**
 * Created by E430 on 2017/7/6.
 */


//普通动物
class Animal3 {
    public void eat() {
        System.out.println("吃一般的");
    }
}

//狗狗
class Dog3 extends Animal3{
    public void eat() {
        System.out.println("吃特殊的");
    }
}

//不使用多态的例子
//猫
class Cat3 extends Animal3 {
    public void eat() {
        System.out.println("吃鱼");
    }
}

//饲养员
class Person3 {
    //喂养所有动物的方法
    public void feed(Animal3 a) {
        System.out.println("喂养");
        a.eat();
    }

}

public class _11多态使用 {

    public static void main(String[] args) {
        //创建饲养员对象
        Person3 p3 = new Person3();
        //创建狗狗对象
        //Dog3 d = new Dog3();   //上下两种一样效果Dog3 d = new Dog3()和 Animal3 a = new Dog3();
        Animal3 a = new Dog3();
        //p3.feed(d);//饲养员喂养狗狗
        p3.feed(a);//饲养员喂养狗狗

        //创建猫对象
        //Cat3 c = new Cat3();
        a = new Cat3();
        //p3.feed(c);
        p3.feed(a);


    }
}


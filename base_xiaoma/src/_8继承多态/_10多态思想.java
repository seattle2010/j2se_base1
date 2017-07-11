package _8继承多态;

/**
 * Created by E430 on 2017/7/6.
 */
//普通动物
class Animal1 {
    public void eat() {
        System.out.println("吃一般的");
    } 
}

//狗狗
class Dog extends Animal1{
    public void eat() {
        System.out.println("吃特殊的");
    }
}

//不使用多态的例子
//猫
class Cat extends Animal1 {
    public void eat() {
        System.out.println("吃鱼");
    }
}

//饲养员
class Person2 {
    //喂养狗狗的方法
    public void feed(Dog d) {
        System.out.println("喂养");
        d.eat();
    }
    public void feed(Cat c) {
        System.out.println("喂养");
        c.eat();
    }
}

public class _10多态思想 {

    public static void main(String[] args) {
        //所谓多态 :对象具有多种形态,对象可以存在不同形式
        //多态的前提:可以是继承关系(类和类)/也可以是实现关系(接口和实现类)
        //多态的特点:把子类对象付给父类变量,在运行时期表现出子类的特征
        //Animal1 a = null;
        //a = new Dog();//a此时表示Dog类型的形态
        //a.eat();
        //a = new Cat();//a此时表示Cat类型的形态
        //a.eat();


        //创建饲养员对象
        Person2 p2 = new Person2();
        //创建狗狗对象
        Dog d = new Dog();
        p2.feed(d);//饲养员喂养狗狗

        //创建猫对象
        Cat c = new Cat();
        p2.feed(c);


    }
}

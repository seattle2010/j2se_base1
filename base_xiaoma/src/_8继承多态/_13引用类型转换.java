package _8继承多态;

/**
 * Created by E430 on 2017/7/6.
 */
//引用类型转换
       //引入 instanceof    boolean boo = 对象A instanceof 类B
class Animal4 {
    public void eat() {
        System.out.println("吃饭一般");
    }
}

class Dog4 extends Animal4 {
    public void eat() {
        System.out.println("吃饭狗粮");
    }

    public void watch() {
        System.out.println("看门"); 
    }
}

class Cat4 extends Animal4 {
    @Override
    public void eat() {
        System.out.println("吃饭猫粮");
    }

    public void catchMouse() {
        System.out.println("抓老鼠");
    }
}

class Person4 {
    public void feed(Animal4 a) {
        System.out.println("feed");
        a.eat();
        //a.watch();//这个不行 因为这时候父类里没有watch方法 bianyi报错 需要判断
        if(a instanceof Dog4){
            Dog4 dd = (Dog4)a;
            dd.watch();
        } else if (a instanceof Cat4) {
            Cat4 cc = (Cat4)a;
            cc.catchMouse();
        }
    }
}
public class _13引用类型转换 {

    public static void main(String[] args) {
        Person4 p4 = new Person4();
        Dog4 d4 = new Dog4();
        Cat4 c4 = new Cat4();
        //p4.feed(new Dog4());
        p4.feed(d4);
        p4.feed(c4);

    }
}

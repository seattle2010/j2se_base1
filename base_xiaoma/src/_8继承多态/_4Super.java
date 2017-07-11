package _8继承多态;

/**
 * Created by E430 on 2017/7/5.
 */
//鸟类
class Bird1 {
    public void fly() {
        System.out.println("飞翔");
    }
}

class Penguin1 extends Bird1 {
    @Override
    public void fly() {
        super.fly(); //可以用super调用父类被覆盖的方法
        System.out.println("企鹅飞翔");
    }
    public void say() {
        this.fly();
    }
}

public class _4Super {
    public static void main(String[] args) {
        Penguin1 penguin1 = new Penguin1();
        penguin1.fly();
        System.out.println("*****");
        penguin1.say();
    }
}

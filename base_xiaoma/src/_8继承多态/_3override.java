package _8继承多态;

/**
 * Created by E430 on 2017/7/5.
 */
//鸟类
class Bird {
   // public void fly() {
   protected Object fly() {
        System.out.println("飞翔");
        return null;
    }

}

//企鹅   只有方法有覆盖的概念 字段没有覆盖
class Penguin extends Bird {
    //方法覆盖
    //public void fly() {
    @Override
    public String fly() {
        System.out.println("企鹅飞翔");
        return null;
    }
}
//方法覆盖
public class _3override {

    public static void main(String[] args) {
        Penguin penguin = new Penguin();
        penguin.fly(); //子类可以调用父类方法 也可以覆盖父类方法
    }
}

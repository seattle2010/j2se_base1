package Extends;
class SuperClass{
    String name = "father";
}
class SubClass extends SuperClass{
    String name = "son";
    void doWork(){
        String name = "work";
        System.out.println(name);//方法内局部变量调用
        System.out.println(this.name);//所在对象调用
        System.out.println(super.name);//父类调用
    }
}
public class SuperDemo {
    public static void main(String[] args) {
        //匿名函数
        new SubClass().doWork();
    }
}

package _8继承多态;

/**
 * Created by E430 on 2017/7/6.
 */
class SuperClass3 {
    public void doWork() {
        System.out.println("superclass.dowork");
    }
}

//子类
class SubClass3 extends SuperClass3{
    public void doWork() {
        System.out.println("subclass.dowork");
    }

}
//多态时方法调用问题2
public class _12多态度时方法的调用3 {
    public static void main(String[] args) {
        SuperClass3 s2 = new SubClass3();
        s2.doWork();
    }
}

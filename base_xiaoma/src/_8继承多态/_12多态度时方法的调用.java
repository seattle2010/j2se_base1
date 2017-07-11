package _8继承多态;

/**
 * Created by E430 on 2017/7/6.
 */
//情况1: doWork方法存在于SuperClass中,不存在于SubClass中.

    //此时执行结果: 编译通过,执行SuperClass的doWork方法.
    //        应该先从SubClass类中去找doWork方法,找不到,再去父类SuperClass类中找.

//父类
class SuperClass1 {
    public void doWork() {
        System.out.println("super.dowork");
    }
}

//子类
class SubClass1 extends SuperClass1{

}
//多态时方法调用问题
public class _12多态度时方法的调用 {

    public static void main(String[] args) {
        SubClass1 s1 = new SubClass1();
        s1.doWork();

    }
}

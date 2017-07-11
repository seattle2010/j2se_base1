package _8继承多态;

/**
 * Created by E430 on 2017/7/6.
 */
//情况2: doWork方法存在于SubClass中,不存在于SuperClass中.

//父类
class SuperClass2 {

}

//子类
class SubClass2 extends SuperClass2{
    public void doWork() {
        System.out.println("subclass.dowork");
    }

}
//多态时方法调用问题2
public class _12多态度时方法的调用2 {
    public static void main(String[] args) {
        SuperClass2 s2 = new SubClass2();
        //s2.doWork();  //调用时候bianyi会报错
    }
}

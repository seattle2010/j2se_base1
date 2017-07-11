package _8继承多态;

/**
 * Created by E430 on 2017/7/6.
 */
class SuperClass {
    public String name = "tom";
}

class SubClass extends SuperClass {

    public String name ="jack";

    public void doWork() {
        System.out.println(name);
        System.out.println(super.name);
    }
}
public class _08SuperUseDemo {
    public static void main(String[] args) {
        SubClass subClass = new SubClass();
        subClass.doWork();
    }
}

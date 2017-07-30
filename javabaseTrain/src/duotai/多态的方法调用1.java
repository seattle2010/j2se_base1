package duotai;
//多态的方法调用
//   子类中有某个方法,父类中没有这个方法时
//   父类中有某个方法,子类中没有这个方法时
//   子类,父类中都有这个方法
class SuperClass{
    void doWork(){
        System.out.println("父类方法");
    }
}
class SubClass extends SuperClass{
    void doWork(){
        System.out.println("子类方法");
    }
}
public class 多态的方法调用1 {
    public static void main(String[] args) {
        SuperClass clz = new SubClass();
        clz.doWork();//
    }
}

package duotai;
class SuperClass1{
    String name = "父类";
    int age = 18;

    void  doWork(){
        System.out.println("父类dowork");

    }
}
class SubClass1 extends SuperClass1{
    String name = "子类";
    int age = 1;
    void  doWork(){
        System.out.println("子类dowork");

    }
}
public class AtrributesDemo {
    public static void main(String[] args) {
        SuperClass1 clz1 = new SubClass1();
        clz1.doWork();

        
        
    }
}

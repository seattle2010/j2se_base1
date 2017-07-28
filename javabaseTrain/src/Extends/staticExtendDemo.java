package Extends;
class SuperClass2{
    static void  fly(){
       System.out.println("父类飞");
    }
}
class SubClass2 extends SuperClass2{
    static void fly(){

       System.out.println("子类飞");
    }
}
public class staticExtendDemo {
    public static void main(String[] args) {

        SubClass2.fly();
//        SuperClass2.fly();

    }
}

package _7面向对象2;

/**
 * Created by E430 on 2017/7/18.
 */
class Person2{
    String name;
    int age;
    static  int totalNum =70;
    Person2(){}

    void die(){
        System.out.println("die");
    }

    static void destroy(){
        System.out.println("人类毁灭");
    }
}
public class StaticDemo {
    public static void main(String[] args) {
        Person2 p1 = new Person2();
        p1.name = "will";
        p1.age = 16;

        Person2 p2 = new Person2();
        p2.name = "tom";
        p2.age = 18;
        
        System.out.println(p1.totalNum);
        p1.totalNum = 10;
        System.out.println(p1.totalNum);
    }

}

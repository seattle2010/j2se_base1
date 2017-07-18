package _7面向对象2;

/**
 * Created by E430 on 2017/7/18.
 */
class Person3{
    static String name;
    int age;
    static  int totalNum;

    Person3(String n,int a) {
        name = n;
        age = a;
        totalNum++;
    }

    void die(){
        System.out.println("die");
    }

    static void destroy(){
        System.out.println("人类毁灭");
    }
}
public class StaticDemo2 {
    
    String color = "red";
    public static void main(String[] args) {
        System.out.println(new StaticDemo2().color);

        System.out.println(Person3.name);
        Person3 p1 = new Person3("tom",17);
        p1.destroy();

    }
}

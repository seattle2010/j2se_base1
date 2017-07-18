package _6面向对象;

/**
 * Created by E430 on 2017/7/18.
 */
class P {
    String name;
    int age;
    public P(String n,int a) {
        name = n;
        age = a;
    }

    public P() {

    }
}

public class _3Constructor2 {
    public static void main(String[] args) {
        P p1 = new P("tom",18);
        System.out.println(p1.name);
        System.out.println(p1.age);
    }


}

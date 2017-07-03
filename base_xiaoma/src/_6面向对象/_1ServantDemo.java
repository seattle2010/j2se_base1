package _6面向对象;

/**
 * Created by E430 on 2017/7/3.
 */
public class _1ServantDemo {
    public static void main(String[] args) {
        //创建对象
        final Servant s1 = new Servant();

        s1.name = "tom";
        s1.age = 18;
        System.out.println(s1.name);
        System.out.println(s1.age);
        s1.shopping();
        s1.wash();
        s1.cook();
        final Coder c1 = new Coder();
        c1.coding();

    }
}
//用人
class Servant{
    String name;
    int age;
    void shopping(){
        System.out.println("买菜");
    }
    void  cook(){
        System.out.println("做饭");
    }
    void  wash(){
        System.out.println("洗完");
    }
}
//工程师
class Coder{
    void coding(){
        System.out.println("coding");
    }
}

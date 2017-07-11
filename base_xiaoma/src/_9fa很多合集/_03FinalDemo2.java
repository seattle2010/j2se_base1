package _9fa很多合集;

/**
 * Created by E430 on 2017/7/8.
 */
//是final了引用 不是值
class Person {
    public String info = "最初的值";
}

public class _03FinalDemo2 {

    final static String name = "tom";
    public static void main(String[] args) {
        final Person p1 = new Person();//final修饰
        System.out.println(p1.info);
        p1.info = "jack";  //能够改变值
        System.out.println(p1.info);

        //final是不能重新给对象分配地址
        //p1 = new Person();  //这个重新分配不行 引用地址不能变 引用的内容可以变

        
        
        
    }

}




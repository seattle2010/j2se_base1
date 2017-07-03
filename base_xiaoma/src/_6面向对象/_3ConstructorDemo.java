package _6面向对象;

/**
 * Created by E430 on 2017/7/3.
 */
class Person{
    String name;
    Person() {  //如果没有这个 只有上面那个构造器 new Person();就会出错 因为没参数
        System.out.println("构造器");
    }
    Person(String n){
        name = n;
    }


}
public class _3ConstructorDemo {
    public static void main(String[] args) {

        new Person();

        Person p1 = new Person(); //表示调用person类中 无参数的构造器
        p1.name = "tom";

        Person p2 = new Person("jack");
        System.out.println(p2.name); 
    

    }
}

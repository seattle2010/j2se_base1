package _8继承多态;

/**
 * Created by E430 on 2017/7/19.
 */
class Animalx{
    private String name;
    private int age;

    Animalx(){
        System.out.println("父类构造器");
    }
    //如果改成有参数  则子类报错 说找不到父类无参数构造器
    //Animalx(String x){
    //    System.out.println("父类有参数构造器"+x);
    //}

}
class Fishx extends Animalx{
    private String color;
    Fishx(){
        super();
        //super("xxx");
        System.out.println("子类构造器");
    }
}
public class _4Super1 {
    public static void main(String[] args) {
        Fishx f = new Fishx();

    }
}

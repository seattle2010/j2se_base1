package _10接口内部类枚举;

/**
 * Created by E430 on 2017/7/9.
 */
interface IWalkable {   //1):接口中没有构造器

    //     2):接口中定义的成员变量,实质是全局静态常量,默认使用  public static final来修饰.
    //              public static final String NAME = "tom";
    String name = "tom";
//     3):接口中定义的方法都是公共的抽象方法,默认的使用  public abstract 来修饰方法.
//public abstract void walk();   一般的,我们在接口中定义方法,不喜欢使用修饰符.

    void walk();
//     4):接口中定义的内部类都是公共的静态内部类,默认使用public  static来修饰内部类.
    //              public static interface ABC{}


    interface ABC {

    }
}
public class _01InterfaceDemo {
    public static void main(String[] args) {
        System.out.println("hello");
        //①　没有构造方法，也不能显示定义构造器，不能实例化。
        //new IWalkable();
    }
}

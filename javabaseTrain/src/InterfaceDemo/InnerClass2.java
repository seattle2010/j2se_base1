package InterfaceDemo;

/**
 * Created by shi on 2017/7/25.
 */
//内部类
    //实例内部类
//    实例内部类:
//    没有使用static修饰内部类,说明内部类属于外部类的对象,不属于外部类本身.
//            特点:
// 1:创建实例内部类前,必须存在外部类对象,通过外部类对象创建内部类对象(当存在内部类对象时,一定存在外部类对象).
//    Outter.Inner in = new Outter().new Inner();
//2:实例内部类的实例自动持有外部类的实例的引用,内部类可以直接访问外部类成员.
//3:外部类中不能直接访问内部类的成员,必须通过内部类的实例去访问.
//4:实例内部类中不能定义静态成员,只能定义实例成员.
//5:如果实例内部类和外部类存在同名的字段或方法abc,那么在内部类中:
//            this.abc:表示访问内部类成员.
//            外部类.this.abc:表示访问外部类成员.
class Outter {
    String name = "Outter.name";//字段
    class Inner {   //内部类
        String name = "Inner.name";//内部类的字段
        void test() {//内部类的方法
            String name = "method name";
            System.out.println("-----");
            
            System.out.println(name);
            System.out.println(this.name);
            System.out.println(Outter.this.name);

        }
    }
}


//    静态内部类:
//    使用static修饰的内部类.
//            特点:
//            1):静态内部类的实例不会自动持有外部类的特定实例的引用,在创建内部类的实例时,不必创建外部类的实例.
//            Outter.Inner in = new Outter.Inner();
//2):静态内部类可以直接访问外部类的静态成员,如果访问外部类的实例成员,必须通过外部类的实例去访问.
//3):在静态内部类中可以定义静态成员和实例成员.
//4):测试类可以通过完整的类名直接访问静态内部类的静态成员.

//    匿名内部类(Anonymous),是一个没有名称的局部内部类,适合只使用一次的类。
//    在开发中经常有这样的类,只需要定义一次,使用一次就可以丢弃了,此时:不应该白白定义在一个文件中.
//            在JavaSE/Android的事件处理中:不同的按钮点击之后,应该有不同的响应操作,首先使用匿名内部类.
//            特点:
//            1):匿名内部类本身没有构造器,但是会调用父类构造器.
//2):匿名类尽管没有构造器,但是可以在匿名类中提供一段实例初始化代码块,JVM在调用父类构造器后,会执行该段代码.
//3):内部类处理可以继承类之外,还可以实现接口.
//            格式：
//            new 父类构造器([实参列表]) 或 接口()
//    {
//        //匿名内部类的类体部分
//    }
//
//    注意：匿名内部类必须继承一个父类或者实现一个接口，但最多只能一个父类或实现一个接口。
public class InnerClass2 {
    public static void main(String[] args) {
        Outter.Inner in = new Outter().new Inner();
        in.test();
        System.out.println(in.name);
        System.out.println(new Outter().name);



        }

    }


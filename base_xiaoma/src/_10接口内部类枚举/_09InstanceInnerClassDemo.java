package _10接口内部类枚举;

/**
 * Created by E430 on 2017/7/10.
 */
//外部类
class Outter {
    String name = "Outter.name";

    public void ooxx() {
        //外部内可以通过创建内部类对象 来访问内部类成员
        System.out.println(this.new Inner().name);//这里相当于有个this   this.new Inner().age
    }
    //实例内部类
    class Inner {
        String name = "inner.name";

        public void test() {
            String name = "local.name";
            //内部类可以访问外部类的成员
            System.out.println(name);
            System.out.println(this.name);
            System.out.println(Outter.this.name);
        }
    }
}
//演示实例内部类
//

public class _09InstanceInnerClassDemo {
    public static void main(String[] args) {
        //必须通过创建外部类对象 再创建内部类
        Outter outter = new Outter();
        //outter.new Inner();
        //Outter.Inner in = outter.new Inner();
        Outter.Inner in = new Outter().new Inner();
        System.out.println(in);

        in.test();

    }
}

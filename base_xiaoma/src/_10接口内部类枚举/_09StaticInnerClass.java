package _10接口内部类枚举;

/**
 * Created by E430 on 2017/7/23.
 */
class Outters {
    String name = "Outter.name";
    static String name2 = "name2";

    //静态内部类
    static class Inner {
        static int age = 17;

        public void test() {
            System.out.println(name2);//可以直接调用外部类的静态成员
            System.out.println(new Outters().name);
        }
    }

}
public class _09StaticInnerClass {
    public static void main(String[] args) {
        Outters.Inner in = new Outters.Inner();
        in.test();
    }
}

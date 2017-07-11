package _9fa很多合集;

/**
 * Created by E430 on 2017/7/8.
 */
//final修饰类的时候   不能被继承
//final修饰方法的时候   不能被覆盖 但是可以继承
////final 是唯一能修饰局部变量的修饰符 修饰变量的时候

/*final*/ class SuperClass {  //final修饰类的时候   不能被继承
    /*final*/ public void dowork() {  //final修饰方法的时候   不能被覆盖

    }
}

class SubClass extends SuperClass {

    public void dowork() {
        super.dowork();
    }
}
public class _03FinalDemo {

    //final 是唯一能修饰局部变量的修饰符
    final static String name = "tom";  //static是为了下面访问调用它
    final static int MAX_VALUE = 1;

    public static void main(String[] args) {
        SubClass subClass = new SubClass();

        //final 修饰变量
        System.out.println(name);
        //name = "jack";  //不能够给她重新fuzhi
    }

}

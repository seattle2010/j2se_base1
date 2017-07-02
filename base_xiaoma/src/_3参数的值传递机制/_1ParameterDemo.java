package _3参数的值传递机制;

/**
 * Created by E430 on 2017/7/3.
 */
public class _1ParameterDemo {
    //基本数据类型 只传递值的副本 并不影响值本身
    public static void main(String[] args) {
        int x = 10;
        System.out.println("x = " + x);  //10
        //soutv=System.out.println("变量名 = " + 变量);
change(x);
        System.out.println("x = " + x);  //10
//soutv=System.out.println("变量名 = " + 变量);
    }

    //static void change(int xx){
    //    System.out.println(xx);  //10
    //    xx=50;
    //    System.out.println(xx);  //50
    //}
    static void change(int x){
        System.out.println(x);  //10
        x=50;
        System.out.println(x);  //50
    }

}

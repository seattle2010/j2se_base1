package _1方法;

/**
 * Created by E430 on 2017/7/16.
 */
public class _3Overload {

    static int getSum(int a,int b) {
        return a + b;
    }

    static int getSum(int a,int b,int c) {
        return a + b +c;
    }

    static double getSum(double a,double b) {
        return a + b;
    }

    public static void main(String[] args) {
    System.out.println(getSum(1,2));
System.out.println(getSum(1.1,2.1));
System.out.println(getSum(1,2,3));
    }
}

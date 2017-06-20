/**
 * Created by tn on 2017/6/20.
 */
public class _7dowhile {
    public static void main(String[] args) {
        //循环打印出1~10的值
        int a = 0;
        int sum = 0;
        do {
        a++;
        System.out.println(a);
        } while (a < 10);

        System.out.println("******");
        //另外方法
        int b = 10;
        int sum2 = 0;
        do {

        System.out.println(b);
            b--;
        } while (b > 0);

        //求1 + 2 + 3... + 10的和
        int c = 1;
        int sum3 = 0;
        do {
        sum3 = sum3 + c;
        c++;
        } while (c <= 10);
        System.out.println(sum3);

        //求1 * 3 * 5 * 7 * 9的乘积
        int d = 1;
        int sum4 = 1;
        do {
            sum4 = sum4*d;
        d = d + 2;

        } while ( d< 10);
        System.out.println(sum4);


    }
}

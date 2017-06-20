/**
 * Created by tn on 2017/6/20.
 */
public class _6while {
    public static void main(String[] args) {
        //循环打印10以内的数
        int a = 10;
        while(a>0){
            System.out.println(a);
            a--;
        }

        //求1-10的数的和
        int b = 1;
        int sum = 0;
        while(b<=10){
            sum += b;
            b++;
        }
        System.out.println(sum); 
        //求1 * 3 * 5 * 7 * 9的乘积
        int c = 1;
        int sum2 = 1;
        while(c<=9){
            sum2 = sum2*c;
            c = c + 2;
        }
        System.out.println(sum2);

        //求1 + 2 + 3... + 10的和,除了5和8
        int d = 1;
        int sum3 = 0;
        while(d<=10){
            if(5 == d || d == 8){
            d++;
            continue;
            }
            sum3 = sum3 + d;
            d++;
        }
        System.out.println(sum3);
        
        
    }
}

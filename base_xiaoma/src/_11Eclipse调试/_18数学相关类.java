package _11Eclipse调试;

/**
 * Created by E430 on 2017/7/9.
 */
public class _18数学相关类 {
    public static void main(String[] args) {
        System.out.println(Math.PI); 
        System.out.println(Math.max(99,100));
        // 前闭后开  [0,1)
        System.out.println(Math.random());
        double ran = Math.random();
        System.out.println(ran*100); //0---100的数
        System.out.println((int) (ran*100)); //0---100的整数
    }
}

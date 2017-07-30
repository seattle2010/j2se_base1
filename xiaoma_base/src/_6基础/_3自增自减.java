package _6基础;

/**
 * Created by shi on 2017/6/23.
 */
public class _3自增自减 {
    public static void main(String[] args) {
        //++前缀时候 表示x1先递增1 再进行运算
        int x1 = 10;
        int y1 = ++x1;
        System.out.println(x1);
        System.out.println(y1);

        //++后缀时候 表示x2 先递增 但是取出x2的原始值 再去做运算
        int x2 = 10;
        int y2 = x2++;
        System.out.println(x2);
        System.out.println(y2);
    }
}

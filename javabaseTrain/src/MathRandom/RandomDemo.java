package MathRandom;

import java.util.Random;

/**
 * Created by shi on 2017/7/26.
 */
public class RandomDemo {
    public static void main(String[] args) {
              //java自带工具类
        //Math 数学类
        //返回带正号的 double 值，该值大于等于 0.0 且小于 1.0。
        System.out.println(Math.random());

        //Random  随机数类
        Random random = new Random();
//        Random(long seed)
//        使用单个 long 种子创建一个新的随机数生成器
        Random random1 = new Random(10);
        System.out.println(random1);
//        nextInt(int n)
//        返回一个伪随机数，它是取自此随机数生成器序列的、在 0（包括）和指定值（不包括）之间均匀分布的 int 值。
        System.out.println(random1.nextInt());
        Random random2 = new Random(10);
        System.out.println(random2.nextInt());
        Random random3 = new Random(100);
        System.out.println(random3.nextInt());

        Random random4 = new Random();
            //在 0（包括）和指定值（不包括）之间均匀分布的 int 值。
        int a = random4.nextInt(100);
        System.out.println(a);
        //34---179     [0,145)+34
        System.out.println(new Random().nextInt(145)+34);
        
        
        



    }
}

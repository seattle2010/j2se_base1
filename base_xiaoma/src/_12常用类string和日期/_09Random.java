package _12常用类string和日期;

import java.util.Random;

/**
 * Created by E430 on 2017/7/11.
 */
public class _09Random {
    public static void main(String[] args) {
        //Random类用来生成一个伪随机数  由Math.Random()方法而来 底层
        Random random = new Random(10);  //10是种子  任意  种子相同就会生成一样的随机数
        System.out.println(random.nextBoolean()); //Boolean随机数
        System.out.println(random.nextDouble()); //Double随机数
        System.out.println(random.nextDouble()); //Double随机数

        Random random1 = new Random(100);           //种子相同 生成的一样
        System.out.println(random1.nextInt()); //int随机数
        Random random2 = new Random(100);
        System.out.println(random2.nextInt()); //int随机数

        //生成34到179之间的随机数
           //   34+[0,145)
        int num = new Random().nextInt(145)+34;
        System.out.println(num);

    }
}

package _18集合框架2;

import java.util.Arrays;
import java.util.List;

/**
 * Created by E430 on 2017/7/30.
 */
//Arrays 用来把数组转换成集合
public class _16ArraysDemo {
    public static void main(String[] args) {
        //把数组转换为list对象
        List<String> list = Arrays.asList("A", "B", "C", "D");
        //List<Date> list2 Arrays.asList(new Date(), new Date());
        System.out.println(list);//[A, B, C, D]

        //可以自动装箱
        List<Integer> list2 = Arrays.asList(1, 2, 3, 4);
        System.out.println(list2);//[1, 2, 3, 4]

        //直接把数组当成对象
        int[] arr = {1, 2, 3, 4};
        List<int[]> ints = Arrays.asList(arr);
        System.out.println(ints); //[[I@74a14482]

    }
}

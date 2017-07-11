package _7面向对象2;

import java.util.Arrays;

/**
 * Created by E430 on 2017/7/4.
 */
public class _06staticImport {
    public static void main(String[] args) {
        int[] arr = new int[]{8,10,3,7,5};
        //打印数组 返回字符串数组
        String ret = Arrays.toString(arr);
        System.out.println(ret);

        //排序
        Arrays.sort(arr);

        ret = Arrays.toString(arr);
        System.out.println(ret);

        //binarySearch 二分法查找 10为要查找的元素 返回位置索引数
        int ret2 = Arrays.binarySearch(arr, 10);
        System.out.println(ret2);
    }
}

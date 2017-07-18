package _2数组;

import java.util.Arrays;

/**
 * Created by E430 on 2017/7/18.
 */
public class _7ArraysDemo {
    public static void main(String[] args) {
        int[] arr = {14, 15, 16, 7, 11, 12};
        String ret = Arrays.toString(arr); //打印成字符串
        System.out.println(ret);

        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

        Arrays.sort(arr,2,6);//对索引为2到6的进行排序  其他不排序
        System.out.println(Arrays.toString(arr));
        
        int index = Arrays.binarySearch(arr,16);
        System.out.println(index);
    }
}

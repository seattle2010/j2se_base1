package _2数组;

/**
 * Created by E430 on 2017/7/18.
 */
public class binarySearch {
    public static void main(String[] args) {
        int[] arr = {4, 5, 6, 7, 11, 12};
        int index = binarySearch1(arr, 12);
        System.out.println(index);

    }

    static int binarySearch1(int[] arr, int key) {
        //定义三个指针变量
        int min = 0 ;
        int max = arr.length -1;
        int mid = 0;
        //循环zhe半 条件min<max
        while (min<=max){
            mid = (min + max)/2;
            if(key>arr[mid]){
               min = mid +1;
            } else if (key < arr[mid]) {
                max = mid - 1;
            }else {
                //找到元素 返回索引
                return mid;
            }
        }
        //都没有找到 返回-1
        return -1;

    }
}

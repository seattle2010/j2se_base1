package _2数组;

/**
 * Created by E430 on 2017/7/2.
 */
//数组逆序排序  hm
public class _3ArrayDemo {
    public static void main(String[] args) {
        //int[] arr = new int[]{3, 5, 7, 1, 0, 9};
        int[] arr = {3, 5, 7, 1, 0, 9};
        //调用数组逆序方法
        reverse(arr);
        printArray(arr);
    }
//hm方法
    static void reverse(int[] arr) {
        for(int min = 0,max =arr.length-1;min<max;min++,max--){
            int temp = arr[min];
            arr[min] = arr[max];
            arr[max] = temp;

        }
    }

    //bianli数组元素打印的方法
    static void printArray(int[] arr) {
        System.out.print("[");
        for(int i = 0;i<arr.length;i++){
            if(i == arr.length-1){
                System.out.print(arr[i]+"]");
            }else{
                System.out.print(arr[i]+",");
            }
        }
    }
}

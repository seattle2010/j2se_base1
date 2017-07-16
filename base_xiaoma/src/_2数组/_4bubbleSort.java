package _2数组;

/**
 * Created by E430 on 2017/7/17.
 */
public class _4bubbleSort {
    public static void main(String[] args) {
        int[] arr = {3, 1, 5, 8, -7, 9, 0, 2};

        selectSort(arr);
        _3ArrayDemo.printArray(arr);
        
        System.out.println(); 
        bubbleSort(arr);
        _3ArrayDemo.printArray(arr);

    }
    public static void selectSort(int[] arr){
        //外循环 控制一共比较了多少次
        //内循环控制了每次比较了多少个元素
        for(int i = 0;i<arr.length-1;i++){
            for (int j = i+1; j <arr.length ; j++) {
                if(arr[i]>arr[j]){
                //数组换位
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }

    public static void bubbleSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
                          //  !!!!!!!!!注意为了不让数组越界,这里有一个  -1  在最小为数组数2的时候可以验证需要
            for (int j = 0; j <arr.length-i-1 ; j++) {
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;

                }
            }
        }
    }
}

package _11Eclipse调试;

import java.util.Arrays;

/**
 * Created by E430 on 2017/7/24.
 */
public class ArrayEclipseTest {
    public static void main(String[] args) {
        System.out.println("begin"); 
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int index = Arrays.binarySearch(arr, 4);
        System.out.println(index); 
    }
}

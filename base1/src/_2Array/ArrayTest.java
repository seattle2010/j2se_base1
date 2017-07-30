package _2Array;

/**
 * Created by shi on 2017/6/29.
 */
public class ArrayTest {
    public static void main(String[] args) {
        String[] arr1 = new String[3];
        arr1[0] = "hello";
        arr1[1] = "java";
        arr1[2] = "world";
        for (String ele : arr1) {
            System.out.println(ele);
        }
//
//        System.out.println(arr1);
//        for(int i=0;i<arr1.length;i++){
//            System.out.println(arr1[i]);
//        }

        int[] b = {1, 2, 3, 4, 5};
        int x = b[1];
        b[1] = b[3];
        b[3] = x;
        for (int ele : b) {
            System.out.println(ele);
        }

        int[] arr={4,3,5,9,8};

        int index_3 = -1;
        int index_5 = -1;
        for(int i=0;i<arr.length;i++){
            if(arr[i] == 5){
                index_5 = i;
            }
            if(arr[i] == 3){
                index_3 = i;
            }
        }
        System.out.println("****");
        
        System.out.println(index_3);
        System.out.println(index_5);


        int[] arr2 = {1,2,3,4,5,6};
        int[] brr2 = {4,5,6,7,8,9};

for(int i=0;i<arr2.length;i++){
    boolean boo = true;
    for(int j=0;j<brr2.length;j++){

        if(arr2[i]==brr2[j]){
            boo = false;
            break;
        }

    }

    if(boo){
        System.out.println(arr2[i]);

    }
}

//练习题 求出现次数最多的元素？
      int[] arr3 = {1,2,2,3,3,3,4,4,4,4,2,2,2};
int count ;
int max_count = 0;
int max = 0;
for(int i=0;i<arr3.length;i++) {
count = 0;
    for (int j = 0; j < arr3.length; j++) {

        if (arr3[i] == arr3[j]) {
            count++;

        }
    }
    if (count > max_count) {
        max_count = count;
        max = arr3[i];
    }
}
        System.out.println("###");

        System.out.println(max_count);
        System.out.println(max);


    }
}

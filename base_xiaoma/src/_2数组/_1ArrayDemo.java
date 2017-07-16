package _2数组;

/**
 * Created by E430 on 2017/7/2.
 */
public class _1ArrayDemo {
    
    static int getMax (int[] nums2) {
        int max = nums2[0];
        for (int i = 1; i < nums2.length; i++) {
            if (max < nums2[i]) {
                max = nums2[i];
            }
        }
        return  max;
    }
    
    
    
    public static void main(String[] args) {
        //数组的定义方法
        int[] nums = new int[]{1,2,3,4,5};
        for(int i = 0;i<nums.length;i++){
            System.out.println(nums[i]); 
        }
        
        //打印数组最大值
        int[] nums2 = new int[]{1,2,3,4,7};
        System.out.println(getMax(nums2)); 
    }
}

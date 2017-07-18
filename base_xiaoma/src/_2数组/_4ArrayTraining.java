/*
package _2数组;

*/
/**
 * Created by E430 on 2017/7/17.
 *//*

public class _4ArrayTraining {

    public static void main(String[] args) {

    }

    // 2，设计并实现func（）方法，打印数组中的最大值的下标
    int[] arr3={9,3,12,4,6,2};
		System.out.println("数组中的最大值"+func(arr3));
    //设计并实现func（）方法，打印数组中的最大值及对应的下标
    public static int func(int[] arr){
        int max=0;
        int max_xiabiao=0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>max){
                max=arr[i];
                max_xiabiao=i;
            }
        }
        System.out.println("方法中打印数组中最大的值是："+max);
        System.out.println("方法中打印数组中最大值的下标是："+max_xiabiao);
        return max;
    }

    //3，写一个函数实现判断一个数是否是质数。主函数调用这个方法，打印出10到30之间的质数之和。
    int sum=0;
		for(int i=10;i<31;i++){
        boolean boo=zhishu_sum(i);
        if(boo){
            sum+=i;
            System.out.println(i);
        };
    }
		System.out.println("10到30之间的质数之和是"+sum);

    public static boolean zhishu_sum(int  a){
        boolean boo=true;
        for(int i=2;i<a;i++){
            if(a%i==0){
                boo=false;
                break;
            }
        }
        return boo;
    }
    //4，定义一个一维数组，写函数实现返回数组中的最大值
    int[] arr3={9,3,12,4,6,2};
		System.out.println("数组中的最大值"+func(arr3));
// 5，设计并实现m1()方法：打印两个数组的差集
    从这道题可以看出，用变量接是接的值，用数组接是地址，所以不用返回值也可以。

    int[] arr={1,3,2,4,6,7,8};
    int[] brr={4,11,21,2,12};
    int[] crr=new int[arr.length+brr.length];
    chaji1(arr,brr,crr); //方法调用
		for(int cc:crr){
        if(cc!=0){
            System.out.print(cc+" ");
        }
    }
    public static void chaji1(int[] arr,int[] brr,int[] crr){
        int crr_index=0;
        boolean boo=true;
        //先循环A数组,把A有B没有的元素加到C数组中去
        for (int i = 0; i < arr.length; i++) {
            boo=true;//开关状态重置
            for (int j = 0; j < brr.length; j++) {
                if(arr[i]==brr[j]){
                    boo=false;
                    break;
                }
            }
            if(boo){
                crr[crr_index++]=arr[i];
            }
        }
        //先循环B数组,把B有A没有的元素加到C数组中去
        for (int i = 0; i < brr.length; i++) {
            boo=true;//开关状态重置
            for (int j = 0; j < arr.length; j++) {
                if(brr[i]==arr[j]){
                    boo=false;
                    break;
                }
            }
            if(boo){
                crr[crr_index++]=brr[i];
            }
        }	}
    //基本类型传递的是数据值本身。
    //引用类型传递的是对象的引用，而不是对象本身。
    int[] arr={1,2,3,4};
    mm(arr);
		for(int a:arr){
        System.out.print(a+" ");
    }
		System.out.println();

    public static void mm(int[] a){
        a[0]=99;
    }


    int a=32;
		System.out.println("方法调用前的a="+a);
    m(a);
		System.out.println("方法调用后的a="+a);

    public static void m(int aa){
        aa=99;
    }

    //数组{1,2,3,4,4,5,5,6,7，4,7,8,} 统计5出现的次数
    int[] arr={1,2,3,4,4,5,5,6,7,4,7,8} ;
    int a=5;
    int count=0;
    count=cishu(arr,a);
		if(count>0){
        System.out.println(a+"出现的次数是："+count);
    }else
    {
        System.out.println("数组里没有"+a);
    }
}
    public static int cishu(int[] arr,int a){
        int b=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==a){
                b++;
            }
        }
        return b;
    }

//打印50-100之间各个数的素数因子？
//素数=质数
		for (int ii = 50; ii<=100; ii++) {
                //依次求每个数的因子
                System.out.print(ii+"的素数因子有:");
                for (int j = 1; j <=ii; j++) {
                if(ii%j==0){//得到因子j
                if(zhishu(j)){
                System.out.print(j+" ");
                }
                }
                }
                //每个数后打印一个换行
                System.out.println();
                }
                }






public static boolean zhishu(int c){
        boolean boo=true;
        for(int i=2;i<c;i++){
        if(c%i==0){
        boo=false;
        break;
        }
        }
        return boo;
        }

}
*/

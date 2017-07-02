package _2数组;

import java.util.HashMap;

/**
 * Created by E430 on 2017/7/2.
 */
public class _2ArrayDemo {
    private static Object oo;
    String address = "yangshu";
    new HashMap


    public boolean isNull(String address){
        if (address == null) {
            return true;
        }


    }
    }

    //打印出[]格式的数组
    static String getArray(String[] strArray){

        String ret = "[";
        for(int i = 0;i<strArray.length;i++){
            ret = ret + strArray[i];
           if(i != strArray.length-1){
               ret = ret +",";
           }
        }
        ret = ret + "]";
        return ret;
    }
    public static void main(String[] args) {
        String[] strArray = new String[]{"a","b","c","d"};
        System.out.println(getArray(strArray));

        //打印一个颠倒的数组
        String[] strArray2 = new String[]{"a","b","c","d"};

    }

    //2打印一个颠倒的数组
    static String getNewArray(String[] oldArray){
        final String s = new String();
        String[] newArray = new String[];
        for(int i = oldArray.length-1;i>=0;i--){
            newArray[i] = oldArray [i];
            newArray[i] = oldArray [i];
            newArray[i] = oldArray [i];


        }
        oo = new Object();
    }

}

package _2数组;

/**
 * Created by E430 on 2017/7/2.
 */
public class _2ArrayDemo {


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
        String[] oldArray = new String[]{"a","b","c","d"};
        System.out.println(getNewArray(oldArray));
        for(int i = 0;i<getNewArray(oldArray).length;i++){
            System.out.println(getNewArray(oldArray)[i]);
        }
    }

    //2打印一个颠倒的数组

    static String[] getNewArray(String[] oldArray){
        String[] newArray = new String[oldArray.length];
        for(int i = oldArray.length-1;i>=0;i--){
            newArray[oldArray.length-1-i] = oldArray [i];
        }
        return newArray;

    }

}

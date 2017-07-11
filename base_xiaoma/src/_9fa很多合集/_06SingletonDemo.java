package _9fa很多合集;

/**
 * Created by E430 on 2017/7/8.
 */
//不用单例的情况
class ArrayUtil {
    public void sort(int[] arr) {
        System.out.println("排序操作");
    }
}
public class _06SingletonDemo {
    public static void main(String[] args) {
        //如果不用单例 就得每次进行引用
        ArrayUtil util = new ArrayUtil();

        //排序操作
util.sort(null);
        //排序操作
util.sort(null);
        //排序操作
util.sort(null);
        //排序操作
util.sort(null);
    }

}

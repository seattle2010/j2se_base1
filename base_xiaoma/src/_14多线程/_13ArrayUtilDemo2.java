package _14多线程;

/**
 * Created by E430 on 2017/7/28.
 */
//懒汉式单例模式
class ArrayUtil2 {
    private ArrayUtil2() {
    }

    private static ArrayUtil2 instance = null;

    synchronized public static ArrayUtil2 getInstance() {
        if(instance == null){
            instance = new ArrayUtil2();

        }
        return instance;
    }

    public void sort(int[] arr) {

    }
}
public class _13ArrayUtilDemo2 {
    public static void main(String[] args) {

    }
}

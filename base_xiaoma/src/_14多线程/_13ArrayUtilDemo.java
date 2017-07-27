package _14多线程;

/**
 * Created by E430 on 2017/7/27.
 */
//饿汉单例模式
class ArrayUtil {
    private ArrayUtil() {
    }

    private static ArrayUtil instance = new ArrayUtil();

    public static ArrayUtil getInstance() {
        return instance;
    }

    public void sort(int[] arr) {

    }
}
public class _13ArrayUtilDemo {
    public static void main(String[] args) {

    }
}

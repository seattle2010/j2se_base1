package _9fa很多合集;

/**
 * Created by E430 on 2017/7/8.
 */
//写单例模式的步骤：单讲饿汉式.
//        1):必须在该类中,自己先创建出一个对象.
//        2):私有化自身的构造器,防止外界通过构造器创建新的对象.
//        3):想外暴露一个公共的静态方法用于获取自身的对象.
class ArrayUtil2 {

    //        1):必须在该类中,自己先创建出一个对象.
    private static /*final*/ ArrayUtil2 instance = new ArrayUtil2();//final可加可不加 习惯都加上 不可变
    //        2):私有化自身的构造器,防止外界通过构造器创建新的对象.
    private ArrayUtil2() {

    }

    //        3):想外暴露一个公共的静态方法用于获取自身的对象.
    public static ArrayUtil2 getInstance() {
        return instance;
    }

    //排序的方法
    public void sort(int[] arr) {
        System.out.println("对数组进行排序");
    }
}
public class _06SingletonDemo2 {
    public static void main(String[] args) {
        ArrayUtil2.getInstance().sort(null);

    }


}

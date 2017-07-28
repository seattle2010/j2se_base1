package DesignPattern;

import java.util.Arrays;

//设计模式 Design Pattern
//单例设计模式(1.饿汉单例模式   2.懒汉单例模式)
//饿汉单例模式
//1 在类中就创建一个私有对象
//2 创建一个私有的构造器,用来在内部创建对象
//3 创建一个公共的静态方法,用来调用对象

class ArrayUtil {  //数组工具类
    //1 在类中就创建一个私有对象
    private static ArrayUtil instance = new ArrayUtil();
    //2 创建一个私有的构造器,用来在内部创建对象
    private ArrayUtil() {
    }

    //3 创建一个公共的静态方法,用来调用对象
    public static ArrayUtil getInstance() {
        return instance;
    }
    void swap() {
        System.out.println("交换位置");

    }
}
public class SingletonDemo1 {
    public static void main(String[] args) {

        ArrayUtil arrayUtil = ArrayUtil.getInstance();
        ArrayUtil arrayUtil2 = ArrayUtil.getInstance();
        ArrayUtil arrayUtil3 = ArrayUtil.getInstance();


        arrayUtil.swap();
    }

}

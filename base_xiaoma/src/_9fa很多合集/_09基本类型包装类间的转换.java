package _9fa很多合集;

/**
 * Created by E430 on 2017/7/23.
 */
//在以后的集合框架中 只能存储对象 不能存储基本数据类型
public class _09基本类型包装类间的转换 {
    public static void main(String[] args) {
        //装箱  基本-->包装   两种方法
        Integer num1 = new Integer(17);
        Integer num2 = Integer.valueOf(17);
        //拆箱  包装-->基本
        int num3 = num1.intValue();
        int num4 = num2.intValue();
        System.out.println(num1);
        System.out.println(num2);  //自动提供了toString方法重写  所以打印出来是数据类型 不是打印出地址
        System.out.println(num3);
        System.out.println(num4);

        //自动装箱
        Integer num5 = 17;
        //自动拆箱
        int num6 = num5;

        Object obj = 17;  //Object 可以接受一切数据类型
                //Integer i = 17; 自动装箱
                //Object obj = i; 引用数据类型自动转换
        Object[] obj1 = {"ABC", 1, true};//Object数组可以装一切类型

        Integer i = new Integer("123"); //用string类型的那个构造器fuzhi
        Long num = 123L;
        //包装类的常用操作
        //1 包装类中常量
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.SIZE);
        System.out.println(Integer.TYPE);
        //2包装类的构造器
        Integer integer = new Integer(13);
        Integer integer2 = new Integer("123");

        //3 包装类型之间的数据类型转换
        Long L = 123L;
        int i1 = L.intValue(); //不能用强制转换  要用共同父类的Number的类型转换方法  一共八个相互转换方法

        //4 String 类型和基本类型之间的转换


    }

}

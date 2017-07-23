package _9fa很多合集;

/**
 * Created by E430 on 2017/7/8.
 */
//八大包装类都是用final修饰的
public class _11享元模式 {
    public static void  main(String[] args) {
        Object o = new Object();
        Object o1 = new Object();
        System.out.println(o == o1); 
        System.out.println(o.equals(o1));

        String str = new String();
        String str1 = new String();
        System.out.println(str == str1); 
        System.out.println(str.equals(str1));


        Integer i1 = new Integer(123);
        Integer i2 = new Integer(123);
        System.out.println(i1 == i2); //false 比较内存地址

        Integer i3 = Integer.valueOf(123);
        Integer i4 = Integer.valueOf(123);
        System.out.println(i3 == i4);//ture 获取-128-127之间的数据,并没有开辟新的对象


        Integer i5 =123 ;//自动装箱底层就是Integer.valueOf 所以效果肯定和Integer.valueOf相同
        Integer i6 =123;
        System.out.println(i5 == i6);//ture
        System.out.println("--------------");

        Integer i11 = new Integer(250);
        Integer i21 = new Integer(250);
        System.out.println(i11 == i21); //false

        Integer i31 = Integer.valueOf(250);
        Integer i41 = Integer.valueOf(250);//IntegerCache缓存中是[-128 127) 超过了缓存 新建对象了就
        System.out.println(i31 == i41);//false 缓存 超过-128-127之间的数据 .new Integer


        Integer i51 =250 ;
        Integer i61 =250;
        System.out.println(i51 == i61);//false
        System.out.println(i51.equals(i61)); //true






        //integer与int的区别
        //1 可以有null
        Integer num = null;
        num = 0;
        //2 可以提供很多方法                         //十进制的数
        System.out.println(Integer.toBinaryString(22222));//   十进制--->二进制
        System.out.println(Integer.toOctalString(22222));//              八进制
        System.out.println(Integer.toHexString(22222));//              十六进制
        //3 方法中的基本类型变量存在于栈中 包装类存放于堆中 基本类型性能更高
    }

    //证明Integer和int不是一种数据类型
    public void ooxx(int val) {   //可以方法共存 说明是重载  否则是重复

    }
    public void ooxx(Integer val) {  //开发中建议使用包装类型

    }

}

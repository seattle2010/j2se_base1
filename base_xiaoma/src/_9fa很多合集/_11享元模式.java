package _9fa很多合集;

/**
 * Created by E430 on 2017/7/8.
 */
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


        Integer i5 =123 ;
        Integer i6 =123;
        System.out.println(i5 == i6);//ture
        System.out.println("--------------");

        Integer i11 = new Integer(250);
        Integer i21 = new Integer(250);
        System.out.println(i11 == i21); //false

        Integer i31 = Integer.valueOf(250);
        Integer i41 = Integer.valueOf(250);
        System.out.println(i31 == i41);//false 缓存 超过-128-127之间的数据 .new Integer


        Integer i51 =250 ;
        Integer i61 =250;
        System.out.println(i51 == i61);//false

        Integer num = null;
        num = 0;

        System.out.println(Integer.toBinaryString(22222));//二进制
        System.out.println(Integer.toOctalString(22222));//八进制
        System.out.println(Integer.toHexString(22222));//十六进制


        //integer与int的区别
    }
}

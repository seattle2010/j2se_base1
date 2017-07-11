package _9fa很多合集;

/**
 * Created by E430 on 2017/7/8.
 */
//包装类的基本操作
public class _10WapperDemo {
    public static void main(String[] args) {
        //基本(属性)?使用
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.TYPE);
        System.out.println(Integer.SIZE);

        //转换操作
        //!!!因为每个数据对象类型都继承了父类Number的六个转换类型的方法 例如intValue() doubleValue
           //所以个个数据类型直接的转换 直接使用自己类型中 继承父类的转换方法就行  见API

        //1基本类型和包装类的转换
        Long num = 123L;
        int i = num.intValue();  //Long --> int
        System.out.println(i);

        byte b = num.byteValue();//Long --> byte

        //String和基本/包装数据类型之间的转换
              //String必须是数类型
        //方式1
        Integer integer = new Integer("123");
        //方式2
        Integer integer1 = Integer.valueOf("456");

        //包装类对象转换为String
        String str = integer.toString();

       // 把基本数据类型 转换成String类型
        String str2 = 17+"";

        //把String转换为基本数据类型
        String str3 = "678";
        int i1 =  Integer.parseInt(str3);
        System.out.println(i1);

//补充 布尔型包装类里面放 "true"为true 其他都被识别为 false
        System.out.println(new Boolean("SB")); //false


    }
}

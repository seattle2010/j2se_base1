package _9fa很多合集;

/**
 * Created by E430 on 2017/7/8.
 */

public class _03IntegerDemo {
    public static void main(String[] args) {

        //装箱操作
        //方式1
        int num = 17;
        Integer integer = new Integer(num);
        //Integer integer = new Integer(17);

        //方式2
        Integer integer1 = Integer.valueOf(num);

        //拆箱操作
        int i = integer.intValue();
        int i1 = integer1.intValue();
        System.out.println(i);
        System.out.println(i1);

        //!!!!!从java5开始 提供了自动装箱和自动拆箱
            //直接把一个基本数据类型付给对应的包装类对象
        Integer integer2 = 17;
           //自动拆箱
        int num2 = integer2;
        System.out.println(num2);

        //!!!  解释
        Object obj = 17;
        //2步操作 1 自动装箱  integer i = 17;
                 // 2 引用类型的自动转换 子类对象付给父类变量 Object obj = i;


    }
}

package SwapperDemo;


public class SwapperTrain {
    public static void main(String[] args) {
        System.out.println("hello");

        Integer num1 = new Integer(123);
        Integer num2 = new Integer(123);
        System.out.println(num1 == num2);       //false
        Integer num3 = Integer.valueOf(123);
        Integer num4 = Integer.valueOf(123);
        System.out.println(num3 == num4);       //true
        Integer num5 = 123;
        Integer num6 = 123;
        System.out.println(num5 == num6);      //true

        Integer num7 = new Integer(127);
        Integer num8 = new Integer(127);
        System.out.println(num7 == num8);       //false
        Integer num9 = Integer.valueOf(127);
        Integer num10 = Integer.valueOf(127);
        System.out.println(num9 == num10);       //false
        Integer num11 = 127;
        Integer num12 = 127;
        System.out.println(num11 == num12);      //false
//Integer 和int 有什么区别
        //包装类  基本数据类型
        //包装类有可以调用的方法(java提供的) 基本数据类型没有
        //存放在内存的区域不同  包装类在堆里  基本数据类型在栈里




    }
}

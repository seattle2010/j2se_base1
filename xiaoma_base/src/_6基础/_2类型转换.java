package _6基础;

/**
 * Created by shi on 2017/6/23.
 */
public class _2类型转换 {
    public static void main(String[] args) {
        //自动类型转换
        byte b = 7;
        short s = b;
        int i = s;
        float f = i;
        double d = f;
        System.out.println(d);

        //大变小 需要强制类型转换
        int num = (int)d;
        System.out.println(num);

        int num2 = (int)3.1415926;  //损失精度
        System.out.println(num2);

        byte b2 = 5; //内部 隐式转换
        double ret = 123 + 1.1F + 99L + 3.14;
        int n = 'A'+1;
        System.out.println(n);

        //面试题
        short s1 = 123;
        //s1 = s1 + 10;

        //!!任何数据类型和string连接  都是变成string类型最后
        System.out.println("AK"+4 + 7);
        String ret2 = 123 + 1.1F + 99L + 3.14 + "str";
        
//        System.out.println(1/0);

        System.out.println(1.0/0); //等价于1除以0.0:Infinity

    System.out.println(0.0/0.0);//NaN :not a number
        double x = 0.0/0.0;
        System.out.println(x==x);// nan的意思是自己不等于自己

    }
}

package _6基础;

/**
 * Created by shi on 2017/6/23.
 */
public class _4赋值运算符 {
    public static void main(String[] args) {
        int age;
        age = 17; //赋值运算符从右往左算

        //+= -=
        int x = 10;
        x += 5; //等于 x = x + 5;
        System.out.println(x);

        //+=有自动转换功能
        short s = 123;
        //s = s+ 10; //报错
        //s = (short) (s + 10);

        s += 10;



    }
}

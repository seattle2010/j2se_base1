package _9fa很多合集;

/**
 * Created by E430 on 2017/7/8.
 */
//开发中 经常把所有changliang定义到一个changliang类中

    //changliang类
class Consts {
    public static final int X_SIZE = 100;
    public static final int Y_SIZE = 200;
}

public class _03FinalDemo3 {
    public static void dowork() {   //这个不是main方法
        System.out.println(Consts.X_SIZE); 
        System.out.println(Consts.Y_SIZE); 
    }

    public static void main(String[] args) {
        System.out.println(Consts.X_SIZE); 
        System.out.println(Consts.Y_SIZE);

        _03FinalDemo3.dowork();
    }

}

package _9fa很多合集;

/**
 * Created by E430 on 2017/7/9.
 */
class IntOperate {
    public long doWork() {
        long begin = System.currentTimeMillis(); //开始时间
        int sum  = 0;
        for(int i = 0;i<=100000000;i++){
            sum += i;
        }
        long end = System.currentTimeMillis(); //结束时间
        long time = end - begin; //时间差

        return time;
    }
}
class StringOperate {
    public long doWork() {
        long begin = System.currentTimeMillis(); //开始时间
        String str = "";
        for(int i = 0;i<=1000;i++){
            str += i;
        }
        long end = System.currentTimeMillis(); //结束时间
        long time = end - begin; //时间差

        return time;
    }
}
//模板设计模式
public class _15模板设计模式 {
    public static void main(String[] args) {
        System.out.println(new IntOperate().doWork());
        System.out.println(new StringOperate().doWork());
    }
}

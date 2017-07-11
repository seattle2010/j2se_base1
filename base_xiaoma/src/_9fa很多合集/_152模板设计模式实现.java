package _9fa很多合集;

/**
 * Created by E430 on 2017/7/9.
 */
abstract class AllTemplate {
    final public long getTotalTime() {
        long begin = System.currentTimeMillis(); //开始时间
        //通用部分 具体操作留给子完成
        this.doWork();
        long end = System.currentTimeMillis(); //结束时间
        long time = end - begin; //时间差

        return time;
    }
        //具体操作 子必须覆盖
        protected abstract void doWork ();

}
class IntOperate2 extends AllTemplate{
    protected void doWork() {
        int sum  = 0;
        for(int i = 0;i<=100000000;i++){
            sum += i;
        }

    }
}

class StringOperate2 extends AllTemplate{
    public void doWork() {
        String str = "";
        for (int i = 0; i <= 1000; i++) {
            str += i;
        }
    }
}


    //模板设计模式
    public class _152模板设计模式实现 {
        public static void main(String[] args) {
            System.out.println(new IntOperate2().getTotalTime());
            System.out.println(new StringOperate2().getTotalTime());
        }
    }
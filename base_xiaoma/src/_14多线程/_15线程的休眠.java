package _14多线程;

/**
 * Created by E430 on 2017/7/28.
 */
//线程的休眠  sleep  不释放同步锁
public class _15线程的休眠 {
    public static void main(String[] args) throws Exception {
        for(int i = 0;i<10;i++){
            System.out.println("还剩"+i + "秒"); 
            Thread.sleep(1000);
        }
        System.out.println("爆炸");
    }
}

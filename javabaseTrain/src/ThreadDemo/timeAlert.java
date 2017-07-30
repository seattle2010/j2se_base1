package ThreadDemo;

/**
 * Created by shi on 2017/7/28.
 */
//sleep(100)
public class timeAlert {
public static void main(String[] args) throws InterruptedException {
    for(int i=10;i>0;i--){
        System.out.println("还有"+i+"秒启动爆炸");
            Thread.sleep(1000);
    }
    System.out.println("生日快乐!");
}

}

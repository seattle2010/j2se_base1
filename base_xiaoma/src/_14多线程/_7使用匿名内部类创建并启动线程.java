package _14多线程;

/**
 * Created by E430 on 2017/7/22.
 */

public class _7使用匿名内部类创建并启动线程 {
    public static void main(String[] args) {
       for(int i = 0;i<50;i++){
           System.out.println("打游戏"+i);
           if(i == 10){
            //创建线程对象,并启动线程
               new Thread(new Runnable() { //接口形式的匿名内部类
                   @Override
                   public void run() {
                        for(int i = 0;i<50;i++){
                            System.out.println("播放音乐"+i); 
                        }
                   }
               }).start();
           }
       }

    }
}

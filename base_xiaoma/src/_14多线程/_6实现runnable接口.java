package _14多线程;

/**
 * Created by E430 on 2017/7/22.
 */
class MusicRunnableImpl implements java.lang.Runnable {

    @Override
    public void run() {
        for(int i = 0;i<500;i++){
            System.out.println("播放音樂"+i); 
        }
    }
}
public class _6实现runnable接口 {
    //步骤
    //1定义一个类A实现于java.lang.Runnable接口  !!注意A类不是线程类
    //2在A类中覆盖runnable接口中的run方法
    //3在run方法中编写需要执行的操作  -->run方法里的 线程执行体
    //4 在main方法(线程中),创建线程对象,并启动线程
      //创建线程类对象:    Thread t = new Thread();
           //      调用线程对象的start方法
    public static void main(String[] args) {  //主線程程序大體不變  從thread例子中拷貝改
        for(int i = 0;i<500;i++){
            System.out.println("打游戏"+i);
            if(i == 10){
                //创建线程对象,并启动线程
                Runnable target = new MusicRunnableImpl();
                Thread t = new Thread(target);
                t.start();
            }
        }
    }
}

package _14多线程;

/**
 * Created by E430 on 2017/7/22.
 */
class MusicThread extends java.lang.Thread {
    public void run() {
        for(int i = 0;i<50;i++){
            System.out.println("播放音乐"+i);
        }
    }
}
public class _5使用继承方式创建并启动线程thread {
    //创建和启动线程的方式有两种
       //继承thread   java.lang.thread   thread类和thread子类才能称之为线程类
        //实现runnable接口
    public static void main(String[] args) {   //main方法表示主线程
        //步骤
        //1定义一个类A继承于thread类
        //2 在A类中覆盖thread类中的run方法
        //3 在run方法中编写需要执行的操作  run方法里执行线程执行体
        //4 在main线程中 创建线程对象 并启动线程
           //创建线程类   A类 a = new A类();
           //调用线程对象的start方法  a.start()  启动一个线程
        for(int i = 0;i<50;i++){
            System.out.println("打游戏"+i);
            if(i == 10){
            //创建线程对象,并启动线程
                MusicThread t = new MusicThread();
               // t.run();  //这个可以运行  但是不是真正的多线程  只是main主线程
                t.start();  //用start调用run方法
            }
        }

    }
}

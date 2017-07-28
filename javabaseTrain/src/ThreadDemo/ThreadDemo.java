package ThreadDemo;

/**
 * Created by shi on 2017/7/28.
 */
//class MusicThread extends Thread {
//    @Override
//    public void run() {
//        for(int i=0;i<50;i++){
//            System.out.println("播放音乐i="+i);
//        }
//    }
//}
public class ThreadDemo {
    public static void main(String[] args) {
        for(int i=0;i<50;i++){ //模拟打游戏
          if(i == 10){
//                MusicThread mt = new MusicThread();//创建一个线程类
//                mt.start();//启动线程
              new Thread(){ // Thread innerClass = new Thread();底层代码
                  public void run() {
                  for(int i=0;i<50;i++){
                      System.out.println("播放音乐i="+i);
                  }
              }
              }.start();

           }
            System.out.println("打游戏i="+i);


            }
        }

    }


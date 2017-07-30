package ThreadDemo;

/**
 * Created by shi on 2017/7/28.
 */
//class MusicRunnalbe implements Runnable {
//    public void run() {
//for(int i=0;i<200;i++){
//    System.out.println("播放音乐i="+i);
//}
//    }
//}
public class RunnableThreadDemo {
    public static void main(String[] args) {
        for(int i=0;i<200;i++){
            System.out.println("打游戏i="+i);
//            Thread(Runnable target)
//            分配新的 Thread 对象。
//            MusicRunnalbe mr = new MusicRunnalbe();
//            new Thread(mr).start();
if(i==10){
    new Thread(new Runnable() {//new Thread(Runnalbe mr = new innerRunnalbe())

        public void run() {
            for(int i=0;i<200;i++){
                System.out.println("播放音乐i="+i);
            }
        }

    }).start();
}

        }
    }
}

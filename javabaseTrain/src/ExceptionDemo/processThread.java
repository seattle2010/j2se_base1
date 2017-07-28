package ExceptionDemo;

import java.io.IOException;

/**
 * Created by shi on 2017/7/27.
 */
//进程和多线程
    //并行和并发
public class processThread {
public static void main(String[] args) throws IOException {
//java 启动进程
    Runtime runtime = Runtime.getRuntime();
    runtime.exec("notepad");
    runtime.exec("notepad");
    runtime.exec("notepad");
    runtime.exec("notepad");
    runtime.exec("notepad");


    playGame();
    playMusic();
}
    private static void playGame() {
     for(int i=0;i<50;i++){
         System.out.println("打游戏i="+i);
     }
    }
    private static void playMusic() {
    for(int i=0;i<50;i++){
        System.out.println("播放音乐i="+i);
    }
    }
}

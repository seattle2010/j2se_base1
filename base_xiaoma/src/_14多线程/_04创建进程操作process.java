package _14多线程;

import java.io.IOException;

/**
 * Created by E430 on 2017/7/22.
 */
public class _04创建进程操作process {
    public static void main(String[] args) throws IOException {
        //创建进程
        Runtime runtime = Runtime.getRuntime();
        runtime.exec("notepad");//打开了notepad记事本

        //java5开始有
        ProcessBuilder pb = new ProcessBuilder("notepad");
        pb.start();
    }
}

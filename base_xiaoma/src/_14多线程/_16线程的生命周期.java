package _14多线程;

import java.io.IOException;

/**
 * Created by E430 on 2017/7/31.
 */
class Other extends Thread {
    public void run(){
        
    }
}
public class _16线程的生命周期 {
    public static void main(String[] args) throws IOException {
        Other other = new Other();//此时线程处于新建状态
        other.start();//调用start方法之后,other对象属于可运行状态
        System.out.println("begin"); 
        System.in.read();//表示接受键盘输入数据,等待阻塞状态
        System.out.println("end");
        System.out.println(other.isAlive()); //判断线程是否死亡 线程只能启动一次
                                       //如果再想启动线程 重新new一个线程
                                    //线程结束后 创建的对象等待垃圾回收
    }

}


package _14多线程;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Created by E430 on 2017/7/28.
 */
class Apple4 implements Runnable {
private int num = 100;
private final Lock lock = new ReentrantLock();


    public void run() {
        for(int i = 0;i<200;i++){
            eat();
        }
    }

    private void eat() {
        lock.lock();//获取锁
        if(num>0){
            try {
            System.out.println(Thread.currentThread().getName()+num);
            Thread.sleep(10);
            num--;
            } catch (InterruptedException e) {
                e.printStackTrace();
            }finally {
                lock.unlock();//释放锁
            }
        }
    }

}
public class _14LockDemo {
    public static void main(String[] args) {
        Apple4 apple4 = new Apple4();
        new Thread(apple4,"A").start();
        new Thread(apple4,"B").start();
        new Thread(apple4,"C").start();
    }
}

package ThreadDemo;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

//Lock()
//unlock()
//synchronized eat(){}
class Apple2 implements Runnable {
    private int num = 50;
    Lock lock = new ReentrantLock();
    void eat(){
        lock.lock();
        if(num>0) {
            try {
                System.out.println(Thread.currentThread().getName() + "吃了第" + num + "个苹果");
                Thread.sleep(10);//
                num--;
            } catch (InterruptedException e) {
                e.printStackTrace();
            }finally {
                lock.unlock();
            }

        }}
            public void run() {
                for(int i=0;i<50;i++){
                   eat();
            }}
}
public class AppleRunnableDemo {
    public static void main(String[] args) {
        Apple2 a2 = new Apple2();
        new Thread(a2,"A").start();
        new Thread(a2,"B").start();
        new Thread(a2,"C").start();


    }
}

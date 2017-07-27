package _14多线程;

/**
 * Created by E430 on 2017/7/27.
 */

//用方法的形式写synchronized
class Apple3 implements Runnable {
    private int num = 50;

    @Override
    public void run() {
        for (int i = 0; i < 50; i++) {
eat();
        }
    }

   synchronized private void eat() {
        if (num > 0) {
            System.out.println(Thread.currentThread().getName() + "吃了编号" + num + "的苹果");
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            num--;
        }
    }
}
public class _12SynchronizedMethodDemo {
    public static void main(String[] args) {
        Apple3 apple3 = new Apple3();
        new Thread(apple3,"A").start();
        new Thread(apple3,"B").start();
        new Thread(apple3,"C").start();

    }
}

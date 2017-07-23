package _14多线程;

/**
 * Created by E430 on 2017/7/23.
 */
class Apple implements Runnable {
    private int num = 50;

    @Override
    public void run() {
        for(int i = 0;i<50;i++){
            if(num>0){
                System.out.println(Thread.currentThread().getName()+"吃了编号为"+ num-- +"的苹果");
            }
        }
    }
}
public class _10ApplebyRunnable {
    public static void main(String[] args) {
        Apple a = new Apple();
        new Thread(a,"A").start();   //如果换成new Thread(new Apple()).start()  就是每个人50
        new Thread(a,"B").start();
        new Thread(a,"C").start();  //发现是三个线程公用一个对象的50个

    }
}

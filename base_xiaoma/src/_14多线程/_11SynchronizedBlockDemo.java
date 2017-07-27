package _14多线程;

/**
 * Created by E430 on 2017/7/27.
 */
class Apple1 implements Runnable {
    private int num = 50;

    @Override
    public void run() {
        for(int i = 0;i<50;i++){
            synchronized (this) {
            if(num>0){
                    try{
                        System.out.println(Thread.currentThread().getName()+"吃了编号为"+ num +"的苹果");
                        Thread.sleep(10);
                    }catch(Exception e){
                        e.printStackTrace();
                    }

                    num--;
                }

            }
        }
    }
}
public class _11SynchronizedBlockDemo {
    public static void main(String[] args) {
        Apple1 a = new Apple1();
        new Thread(a,"A").start();   //如果换成new Thread(new Apple()).start()  就是每个人50
        new Thread(a,"B").start();
        new Thread(a,"C").start();  //发现是三个线程公用一个对象的50个
    }
}

package ThreadDemo;
class Apple extends Thread {
    private int num = 50;

    public Apple(String name) {//父类构造器
        super(name);
    }
    public void run() {
    for(int i=0;i<50;i++){
        if(num>0) {
            System.out.println(super.getName() + "吃了第" + num-- + "个苹果");
        }}
    }}
public class AppleThreadDemo {
    //小朋友分苹果的多线程实现
//    3个小朋友 每个人给50个苹果 同时吃  看谁吃的快
    public static void main(String[] args) {
        new Apple("tom").start();
        new Apple("jack").start();
        new Apple("rose").start();
    }
}

package _14多线程;

/**
 * Created by E430 on 2017/7/23.
 */
class Person extends Thread {
    private int num = 50;//苹果总数     成员变量属于每个对象
               //创建构造器  并且引入父类构造器
    public Person(String name) {  //int num可以不写
        super(name);

    }

    public void run() {
for(int i = 0;i<50;i++){
    if(num>0){
    System.out.println(super.getName()+"吃了编号"+num-- +"的苹果");
    }
}
    }
}
public class _09ApplebyThread {
    public static void main(String[] args) {
        //创建三个线程(同学)吃苹果
        new Person("A").start();
        new Person("B").start();
        new Person("C").start();//结果发现每个人都要分别吃50个苹果
    }
}

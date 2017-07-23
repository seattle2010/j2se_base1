package _14多线程;

/**
 * Created by E430 on 2017/7/23.
 */
public class _7使用匿名内部类创建并启动线程2thread类方式 {
    public static void main(String[] args) {
        for(int i = 0;i<50;i++){
            System.out.println("打游戏"+i); 
            if(i == 10){       //!!!! new Thread()相当于new一个类 继承于thread类   两步骤的集合体
                new Thread(){   //下面内容相当于单独写一个thread类 里面的内容代码
                    public void run(){
                        for(int i = 0;i<50;i++){
                            System.out.println("听音乐"+i);
                        }
                    }
                }.start();
            
            }
        }
    }
}

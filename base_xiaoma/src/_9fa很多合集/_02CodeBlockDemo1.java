package _9fa很多合集;

/**
 * Created by E430 on 2017/7/20.
 */
//这种情况不怎么用  不用初始化代码块进行初始化  一般在构造器中初始化
public class _02CodeBlockDemo1 {
    //初始化代码块
    {
        System.out.println("初始化代码块");
    }
    _02CodeBlockDemo1(){
        System.out.println("构造器");
    }
    public static void main(String[] args) {
        System.out.println("执行main方法"); 
        new _02CodeBlockDemo1();
        new _02CodeBlockDemo1();
        new _02CodeBlockDemo1();
    }
}

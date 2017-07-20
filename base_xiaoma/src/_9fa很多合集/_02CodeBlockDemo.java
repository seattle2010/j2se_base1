package _9fa很多合集;

/**
 * Created by E430 on 2017/7/8.
 */
//代码块  用{}括起来的一段代码 代码块里变量属于局部变量
      //局部代码块  直接定义在方法内部的代码块,一般配合if while使用
    //2 初始化代码块(构造代码块) 直接定义在类中
    //3 静态代码块 使用static修饰的初始化代码块
public class _02CodeBlockDemo {
//初始化代码块
    {
        System.out.println("初始化代码块");
    }

    //构造器
    _02CodeBlockDemo(){
        //System.out.println("初始化代码块");//反编译之后看到是这样的效果 说明初始化代码块也叫构造代码块
        System.out.println("构造器");
    }

    //静态代码块 先加载 随着类加载而加载 用来配置资源 和位置无关
    static {
        System.out.println("静态代码块");
    }
    public static void main(String[] args) {
        {
            //局部代码块
            int age = 17;
            System.out.println(age);
        }
        //System.out.println(age);
        //初始化执行顺序
            //初始化代码块
            //构造器
            //初始化代码块
            //构造器
            //初始化代码块
            //构造器

        new _02CodeBlockDemo();
        new _02CodeBlockDemo();
        new _02CodeBlockDemo();


    }
}

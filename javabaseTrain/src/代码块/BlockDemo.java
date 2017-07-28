package 代码块;
//局部代码块  在类中 用{} 表示  一般与if while等配合使用
//初始化代码块 用来初始化用的
//构造器代码块  用构造器方式写入的代码块
//静态代码块   用static修饰的代码块
public class BlockDemo {
    {
        System.out.println("初始化代码块");
    }
    BlockDemo(){
        System.out.println("构造器代码块");
        
    }
    static {
        System.out.println("静态代码块");  //一般用来加载初始化文件
    }
    
    public static void main(String[] args) {
        {  //局部代码块
            int age = 17;
            System.out.println(age);
        }
        new BlockDemo();
        System.out.println("-----");

        new BlockDemo();
        System.out.println("-----");
        new BlockDemo();


        
    }
}

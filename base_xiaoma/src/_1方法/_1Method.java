package _1方法;

/**
 * Created by E430 on 2017/7/1.
 */
public class _1Method {


   //方法名要遵循标识符规范 使用动词 首字母小写
    static void dowork(){
        System.out.println("dowork");
    }
    //1无参数 无返回值
    static void p(){
        System.out.println("--------");
    }

    //2有参数无返回值
    static  void pValue(String val){
        System.out.println(val);
    }

    //3 无参数有返回值   返回年龄
    static int getAge(){
        //int a = 17;
        return 17;//a
    }
    
    //4 有参数有返回值
    static int getSum(int a,int b){  //换成x,y
        System.out.print(a + "+"+b +"=");
        return a+b;
    }

    public static void main(String[] args) {

        _1Method.dowork(); //调用方法
        dowork();  //一样的效果 这个不用

        //1
        p();

        //2
       pValue("hello");
       pValue("world");
       pValue("对的");

       //3     !!!有返回的方法,需要定义变量来接受返回值
        System.out.println(getAge());
         int age = getAge();  //或者定义变量
        System.out.println(age); 
        
        //4
        int sum = getSum(1, 2);
        System.out.println(sum);


        //以下的方法都在同一个类值,且方法名都为doWork.
        //void doWork(int a,char b,boolean c){}
        //三个参数:分别是int类型,char类型,boolean类型.
        //        下列方法哪些是上述doWork方法的重载方法。
        //a. void doWork(char b, int a, boolean c){}             //YES
        //b. int doWork(boolean a,char c ,int b){}	//YES
        //c. void doWork(int a,char b,double c){}	//YES
        //d. void doWork(int x,char y,boolean z){}	//编译报错
        //e. int doWork(int x,double y){}	            	//YES
        //f. int doWork(int x, char y,boolean z){}  	//编译报错


        //斐波那契
    }

}

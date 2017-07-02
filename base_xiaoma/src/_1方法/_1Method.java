package _1方法;

/**
 * Created by E430 on 2017/7/1.
 */
public class _1Method {

   //方法名要遵循标识符规范 使用动词 首字母小写
    static void dowork(){
        System.out.println("dowork");
    }

    //2有参数无返回值
    static  void pValue(String val){
        System.out.println(val);
    }

    //3 无参数有返回值   返回年龄
    static int getAge(){
        return 17;
    }
    
    //4 有参数有返回值
    static int getSum(int a,int b){
        return a+b;
    }

    public static void main(String[] args) {

        _1Method.dowork(); //调用方法
        dowork();  //一样的效果 这个不用

        //2
       pValue("hello");
       //3  需要定义变量来接受返回值
        System.out.println(getAge());
         int age = getAge();  //或者定义变量
        System.out.println(age); 
        
        //4
        int sum = getSum(1, 2);
        System.out.println(sum);


        //斐波那契
    }

}

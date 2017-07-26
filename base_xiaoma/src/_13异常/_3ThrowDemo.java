package _13异常;

/**
 * Created by E430 on 2017/7/26.
 */
//throw 相当于return  相当于返回一个错误结果
public class _3ThrowDemo {
    public static void main(String[] args) {
        //当出现异常,不知道返回一个什么的时候  用throw  运用于方法中
        try{
            int ret = divide(10, 0);
        }catch(Exception e){
            e.printStackTrace();
        }
    }

    private static int divide(int num1, int num2) {
        System.out.println("begin"); 
        if(num2 == 0){
        throw new ArithmeticException("除数不能为0");// throw抛出一个对象 可以带有信息 给调用者 调用者根据信息捕捉
        }
        int ret = num1/num2;
        System.out.println(ret);
        return ret;
    }
}

package _13异常;

/**
 * Created by E430 on 2017/7/26.
 */
//throws 用于方法声明之上,用于表示当前方法不处理异常,而是提醒该方法调用者来处理异常(抛出异常)
    //声明跑出异常 就是告诉放弃对哪些异常的处理
public class _4ThrowsDemo {
    public static void main(String[] args) throws Exception {
            divide(10,0);
    }

    private static int divide(int num1,int num2) throws Exception {//可以声明抛出多个异常
        System.out.println("begin");
        if(num2 == 0){
            throw new Exception("除数不能为0");
        }
        int ret = num1/num2;
        return ret;
    }
}

package ExceptionDemo;

/**
 * Created by shi on 2017/7/27.
 */
public class ThrowDemo {
    public static void main(String[] args) {
        int ret = 0;
        try {
            ret = divide(10, 2);
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println(ret);
    }
//throw 定义在方法内部,用来抛出一个异常对象,一般用来主动找出可能出现异常的问题位置
    //throws 定义在方法声明处,用来表示要忽略这个异常,让异常继续向上传递,最后由调用者解决,提示调用者这里有一个异常需要解决的意思
    private static int divide(int num1, int num2)throws Exception{
            if (num2 == 0){
                //throw 约等于 return的作用,返回一个异常对象
              throw new ArithmeticException("除数不能为0");
            }
        try{
            int ret = num1/num2;
            return ret;
        }catch (Exception e){
            e.printStackTrace();
        }
        return 0;
    }
}

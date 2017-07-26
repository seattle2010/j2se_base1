package _13异常;

/**
 * Created by E430 on 2017/7/26.
 */
public class SingleCatchDemo {
    public static void main(String[] args) {
        //处理单个异常
        System.out.println("begin"); 
        try{
            int ret = 10/1;//0
            System.out.println(ret); 
        }catch(ArithmeticException e){
            System.out.println("出异常了"); 
            e.printStackTrace();
        }
        System.out.println("end");

//处理多个异常   不可能同时出现多个异常
        System.out.println("begin");
        String snum1 = "10";
        String snum2 = "10";//0   //2B

        try{
            int num1 = Integer.getInteger(snum1);
            int num2 = Integer.getInteger(snum2);
            System.out.println("-----");

            int ret = num1 / num2;
            System.out.println(ret);
        }catch(ArithmeticException e){
            e.printStackTrace();
        }catch (NumberFormatException e){
            e.printStackTrace();
        }catch (Exception e){   //用父类兜底
            e.printStackTrace();
        }
        System.out.println("end");
    }
}

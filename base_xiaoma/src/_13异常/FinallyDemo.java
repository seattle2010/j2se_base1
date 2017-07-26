package _13异常;

/**
 * Created by E430 on 2017/7/26.
 */
public class FinallyDemo {
    public static void main(String[] args) {
        //如果finally有return语句,永远返回finally中的结果
            //finally和return谁先执行  finally先执行
          //可以debug跟踪
        int ret = test();
        System.out.println(ret); 
    }

    private static int test() {
       
        try{
            return
                    1;
        }catch(Exception e){
            e.printStackTrace();
        }finally {
            return
                    100;
        }
    }
}

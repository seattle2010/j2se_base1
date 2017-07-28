package ExceptionDemo;

/**
 * Created by shi on 2017/7/27.
 */
public class LoginDemo {
    private static String[] usernames = {"tom", "jack", "rose"};
    public static void main(String[] args) {
        try{
            Boolean boo = checkUser("tom");
            System.out.println("注册成功");
        }catch (LogicException e){
            System.out.println(e.getMessage());
        }  }
    private static Boolean checkUser(String name) throws LogicException{
        for (String names: usernames) {
           if(name.equals(names)){
               throw new LogicException("亲" + name + "已经注册了");
           }
        }
        return true;
    }
}

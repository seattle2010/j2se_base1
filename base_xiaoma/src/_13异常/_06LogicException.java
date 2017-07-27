package _13异常;

/**
 * Created by E430 on 2017/7/26.
 */

public class _06LogicException{
    private static String[] names = {"tom", "jack", "june"};

    public static void main(String[] args) {
        try {
            checkUsername("tom");
            System.out.println("注册成功");
        } catch (LogicException e) {
            System.out.println(e.getMessage());
        }

    }

    private static Boolean checkUsername(String username) throws LogicException {
        for(String name:names){
            if(name.equals(username)){
                throw new LogicException("亲" + name + "已经被注册了");
            }
        }
        return true;
    }


}


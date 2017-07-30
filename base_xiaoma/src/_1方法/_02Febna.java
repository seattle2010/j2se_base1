package _1方法;

/**
 * Created by E430 on 2017/7/12.
 */
public class _02Febna {
    public static void main(String[] args) {
        int ret = fn(9);
        System.out.println(ret);
    }

    static int fn(int n) {
        if(n == 0){
            return 0;
        }else if(n==1){
            return 1;

        }else{
            return fn(n - 1) + fn(n - 2);
        }
    }
}

package _1方法;

/**
 * Created by E430 on 2017/7/13.
 */
//cmd
    //javac JavaMainArgs.java
    //java JavaMainArgs  hello world yes
public class JavaMainArgs {
    public static void main(String[] args) {
        System.out.println(args.length); 
        for(int i = 0;i<args.length;i++){
            System.out.println(i); 
        }
    }
}

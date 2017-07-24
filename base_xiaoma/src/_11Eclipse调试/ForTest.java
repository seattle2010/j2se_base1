package _11Eclipse调试;

/**
 * Created by E430 on 2017/7/24.
 */
//F5 进入 F6 跳过 F7 返回 F8继续
public class ForTest {
    public static void main(String[] args) {
        System.out.println("begin"); 
        for(int i = 0;
            i<10;
            i++){
            System.out.println("i="+i); 
            if(i== 5){
                System.out.println("要退出了"); 
                break;
            }
        }
        System.out.println("ending");
    }
}

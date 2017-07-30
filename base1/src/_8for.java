/**
 * Created by tn on 2017/6/20.
 */
public class _8for {
    public static void main(String[] args) {
/*        for (int i = 0; i < 4; i++) {
            System.out.println("*");

        }
        System.out.println();
        for (int i = 0; i < 4; i++) {
            System.out.println("*");
        }
        System.out.println();
        for (int i = 0; i < 4; i++) {
            System.out.println("*");
        }
            System.out.println();*/

        //求 100以内前5个3的倍数
        int count = 0;
        for(int i = 1;i<100;i++){
            if(i%3 == 0){
                System.out.println(i);
                count++;
            }
            if(count == 5){
                break;
            }

        }

        //输出100到200之间不能被3整除的数
        for(int i = 100;i<=200;i++){
            if(i % 3 == 0){
                continue;
            }
            System.out.println(i);
        }

        int count2 =1;     //竟然也可以这样
        for(;count2<10;){
            System.out.println(count2);
            count2++;
        }


    }
}

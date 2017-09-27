public class _03流程控制 {
    public static void main(String[] args) {
        int a = 5;
        if(a>=5){
        a++;
        }
        System.out.println(a);


        int b = 16;
        if (b % 2 == 0) {
            System.out.println(b + "是偶数");
        } else {
            System.out.println(b+"是奇数"); 
        }

        int grade = 75;
        if(grade>=90){
            System.out.println("成绩是优异"); 
        }else if(grade >= 80){
            System.out.println("成绩是良好"); 
        }else if(grade >= 70){
            System.out.println("成绩是中");
        } else if (grade >= 60) {
            System.out.println("及格");
        } else {
            System.out.println("不及格");
        }

        int c = 1;
        while (c <= 5) {
            System.out.println(c);
            c++;
        }
        
        for(int i = 0;i<11;i++){
            System.out.println(i); 
        }

        //练习1 用for 求1到4的和
        int sum = 0;
        for (int i = 0; i < 5; i++) {
            sum = sum + i;
        }
        System.out.println(sum);

        int j = 1;
        do {
            System.out.println(j);
            j++;
        } while (j <= 5);

        //死循环
//        while (true) {
//
//        }
//
//        for(;;){
//
//        }

    //循环嵌套
        for (int i = 1; i <=3 ; i++) {
            for (int k = 1; k <= 5; k++) {
                System.out.println(k); 
            }
        }

        for (int i = 0; i < 3; i++) {
            for (int k = 0; k < 5; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }


        for (int i = 0; i <=10; i++) {
            for (int k = 0; k < i; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
        //和上面一样
//        for (int i = 0; i <10; i++) {
//            for (int k = 0; k < i+1; k++) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }


//        break  continue
        int i = 1;
        while (true) {   //i <1000  一样效果
            if (i == 3) {
                break;
            } else {
                System.out.println(i);
            }
            i++;
        }

        for (int k = 0; k < 3; k++) {
            for (int l = 0; l < 5; l++) {
                System.out.println("l="+l);
                break; //break结束所在的循环
            }
            System.out.println("k="+k);
        }

        //求10 以内 除了2的数的和
        int sum2 = 0;
        for (int k = 1; k<=10 ; k++) {
            if(k==2){
            continue; //跳出当次
            }
            sum2 = sum2 + k;
        }
        System.out.println(sum2);
    }
}

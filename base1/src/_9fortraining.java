/**
 * Created by shi on 2017/6/21.
 */
public class _9fortraining {
    public static void main(String[] args) {

        //输出100到200之间的所有质数


        for(int i=100;i<200;i++){

            for(int j=0;j<200;j++){

                System.out
                .println("");

            }
        }

        //使用do while循环求1,3,5,9,11的乘积？
        int num = 1;
        int sum = 1;
        do {
            num += 2;
           if(num == 7){
               continue;
           }
           sum *= num;
        } while ( num<= 9);

        System.out.println("sum=" + sum);

        /**
         *
         */
        //打印三角形
        //三角形
        int n1=9;
        for (int i = 1; i <=n1 ; i++) {
            for (int j = 1; j <=i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        //打印菱形
        //菱形
        int n2=4;
        for (int i = 1; i <=n2; i++) {
//打印空格
            for (int j = n2-i; j >=1; j--) {
                System.out.print(" ");
            }
//打印图形
            for (int j = 1; j <=2*i-1; j++) {
                System.out.print("*");
            }
//打印换行
            System.out.println();
        }

        for (int i = n2-1; i >=1; i--) {
//打印空格
            for (int j = n2-i; j >=1; j--) {
                System.out.print(" ");
            }
//打印图形
            for (int j = 1; j <=2*i-1; j++) {
                System.out.print("*");
            }
//打印换行
            System.out.println();
        }

        //在同一行打印0,1,2,3,4,5,6,7,8,9,8,7,6,5,4,3,2,1,0
        for (int i = 0; i <=8; i++) {
            System.out.print(i);
        }
        for (int i = 9; i >=0; i--) {
            System.out.print(i);
        }
        System.out.println();

        //打印如下三角形
//        1
//        1 2 1
//        1 2 3 2 1
//        1 2 3 4 3 2 1
//        1 2 3 4 5 4 3 2 1
//        1 2 3 4 5 6 5 4 3 2 1
//        1 2 3 4 5 6 7 6 5 4 3 2 1
//        1 2 3 4 5 6 7 8 7 6 5 4 3 2 1
//        1 2 3 4 5 6 7 8 9 8 7 6 5 4 3 2 1

        //输出如下数字三角阵
        int a=8;
        for (int i = 1; i <=a; i++) {
//打印前半部分
            for (int j = 1; j <=i; j++) {
                System.out.print(j);
            }

//打印后半部分
            for (int j = i-1; j >=1; j--) {
                System.out.print(j);
            }

            System.out.println();
        }


        //质数：只能被1和自己本身整除的数
//6,判断123是不是质数
        int aa=123;
        boolean boo=true; //开关，先假定这个数就是质数
        int count=0;   //计数器
        for (int j = 2; j < a; j++) {
            count++;
            if(aa%j==0){
                boo=false;
                break;
            }
        }
        System.out.println("循环了"+count+"次。");
        if(boo==true){
            System.out.println("练习题6的答案："+aa+"是质数。");//123是质数 j=3
        }
        else{
            System.out.println("练习题6的答案："+aa+"不是质数。");
        }


        //输出100到200之间的所有质数
        int primeNumber = 0;
        for (int i = 100; i <= 200; i++) {
            boolean isPrime = true;// 是否是质数的标志

            for (int j = i - 1; j > 1; j--) {   // n除以每个比n小比1大的自然数
                if (i % j == 0) {// 如果有能被整除的，则不是质数
                    isPrime = false;
                }
            }
            if (isPrime) {// 如果是质数，则打印出来
                System.out.print(i + " ");
                primeNumber++;// 记录质数的个数
                if (primeNumber % 10 == 0) {
// 输出10个质数后换行
                    System.out.println();
                }
            }
        }


//8,求100到200中所有质数,求100到200中所有质数的和
        int sum5=0;
        for(a=100;a<=200;a++){
//依次求每个数是不是质数
            boolean boo5=true; //开关，先假定这个数就是质数
            for (int j = 2; j < a; j++) {
                if(a%j==0){
//如果能被1和它本身以外的任何一个数整除，这个数就不是质数
                    boo5=false;
                    break;
                }
            }
//通过开关判断是不是质数
            if(boo5==true){
                System.out.println(a+"是质数。");
                sum5+=a;
            }
        }
        System.out.println("练习题8的答案："+ sum5);//3167


//        请观察下面的九九乘法表，归纳其规律再将其打印出来。
//        1*1=1
//        2*1=2 2*2=4
//        3*1=3 3*2=6 3*3=9
//        4*1=4 4*2=8 4*3=12  4*4=16
//        5*1=5 5*2=10  5*3=15  5*4=20  5*5=25
//        6*1=6 6*2=12  6*3=18  6*4=24  6*5=30  6*6=36
//        7*1=7 7*2=14  7*3=21  7*4=28  7*5=35  7*6=42  7*7=49
//        8*1=8 8*2=16  8*3=24  8*4=32  8*5=40  8*6=48  8*7=56  8*8=64
//        9*1=9 9*2=18  9*3=27  9*4=36  9*5=45  9*6=54  9*7=63  9*8=72  9*9=81

        int n=9;
        for (int i = 1; i <=n; i++) {
            for (int j = 1; j <=i; j++) {
                System.out.print(i+"*"+j+"="+(i*j)+"\t");
            }

            System.out.println();
        }


    }
}


/**
 * Created by tn on 2017/6/20.
 */
public class _4liuchengkongzhi {
    public static void main(String[] args) {
        int score = 101;
    if(score>=0&&score<=100){
        if(score>=90){
            System.out.println("优秀");
        }else if(score>=80){
                System.out.println("优良");
        }else if(score>=70){
                    System.out.println("合格");
        }else{
                        System.out.println("不及格");
        }

    }else{
        System.out.println("你的分数不在输出范围");

    }

    //用if判断三个数的最大值
        int a = 1;
        int b = 2;
        int c = 3;
    if(a>b && a>c){
        System.out.println("最大值"+ a);
    }else if(b>a && b>c) {
        System.out.println("最大值" + b);
    }else{
    System.out.println("最大值"+ c);
    }

        //判断一个数是否是偶数

        int x = 13;
        if(x%2 == 0){
            System.out.println("偶数");

        }else{
            System.out.println("非偶数");
        }
//判断某个月份是第几季度
        int month =12;
        if(month>=0 && month<=12){
            if(month>=10){
                System.out.println(month+"是第四季度");
            }else if(month>=7){
                System.out.println(month+"是第三季度");
            }else if(month>=4){
                    
            }else{
            
            }
            
            
            
            
            
        }else{
            System.out.println("out"); 
        }

    }
}

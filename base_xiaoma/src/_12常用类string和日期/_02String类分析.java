package _12常用类string和日期;

/**
 * Created by E430 on 2017/7/10.
 */
public class _02String类分析 {
    public static void main(String[] args) {
        //创建string的方式
             //直接字面量方式
        String str1 = "ABCD";
            //通过构造器方式
        String str2 = new String("ABCD");

        //引用为空 null
        String str3 = null;  //没有初始化  没有分配内存空间
        //内容为空字符串    //已经初始化  分配内容空间 只是没有内容
        String str4 = "";

        //字符串比较
        //1 使用"=="  比较引用内存地址是否相同

        //2 使用equals string重写了equals方法 比较的是字符内容


        //String和StringBuffer Builder都是继承于char sequence  本质是char[] char = new char{'A','B','C'}调用

        //String str5 = "ABCD";和String str6 = new String("ABCD");区别
          //详细见图分析
        String str5 = "ABCD";
        String str6 = new String("ABCD");
        
        System.out.println(str5 == str6);   //false
        System.out.println(str5.equals(str6));  //true

        //各种string类型类似字符串比较==
    }
}

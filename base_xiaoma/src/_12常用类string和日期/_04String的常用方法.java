package _12常用类string和日期;

/**
 * Created by E430 on 2017/7/10.
 */
public class _04String的常用方法 {
    public static void main(String[] args) {
        //1字符串和其他类型转换
        buildString();
        //2获取字符串信息
        getStringInfo();
        //3字符串比较
        stringEquals();
        
        //4 字符串大小写 比较
        System.out.println("abcd".toUpperCase());  //ABCD
        System.out.println("ABCD".toLowerCase());  //abcd

    }



    private static void getStringInfo() {
        System.out.println("A BCDE ".length());//7
        System.out.println("Iam".charAt(0));//I
        System.out.println("LOVEU".charAt(4));//U
        System.out.println("ABCABC".indexOf("AB")); //AB子字符串出现的位置
        System.out.println("ABCABC".lastIndexOf("ABC")); //从后往前第一次出现的位置
    }

    /**
     * 1):String的创建和转换:
     byte[] getBytes():把字符串转换为byte数组
     char[] toCharArray():把字符串转换为char数组
     String(byte[] bytes):把byte数组转换为字符串
     String(char[] value):把char数组转换为字符串

     */
    private static void buildString() {
        char[] cs = new char[]{'A', 'B', 'C'};
        //把char数组转换成为string 相互转换
        String str1 = new String(cs);
        System.out.println(str1);
        System.out.println(str1.toCharArray());
    }

    private static void stringEquals() {
        String str1 = new String("ABCD");
        String str2 = new String("ABCD");
        String str3 = new String("abcd");

        System.out.println(str1 == str2);  //false
        System.out.println(str1.equals(str2)); //true
        System.out.println(str1.equalsIgnoreCase(str3)); //true

    }
}

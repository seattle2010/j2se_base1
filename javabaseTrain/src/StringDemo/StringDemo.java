package StringDemo;

/**
 * Created by shi on 2017/7/26.
 */
public class StringDemo {

    public static void main(String[] args) {
        //String  字符串
//        char[] chars = new char[]{'A','B','C','D'};//String底层其实就是一个char数组
//        //如何定义一个String
//
//        //方式2
//        String str2 = new String("ABCD");
//
//        System.out.println(str2);
//int a =1;
//
//        String str3 = "ABCD";//是否和这个相同
//        String str4 = "AB"+"CD";
//        String str5 = "A"+"B"+"C"+"D";
//        String str6 = new String("ABCD");
//        String str7 = a + "ABCD";
//        System.out.println(str3 == str4);
//        System.out.println(str3 == str5);
//
//        //空字符串
//        String str8 = null;//已经创建对象 但是没有引用  算空字符串
//        String str9 = "";//已经创建对象 有引用 内容为空
//        String str10 = " ";//已经创建对象 有引用 内容为空格
System.out.println("-------------");
//        String str = "IamSB";
//        String str2 = "alllove";
//        String str3 = "USB";
//        System.out.println(str.charAt(0));
//        System.out.print(str2.charAt(3));
//        System.out.print(str2.charAt(4));
//        System.out.print(str2.charAt(5));
//        System.out.println(str2.charAt(6));
//        System.out.println(str3.charAt(0));

//        equalsIgnoreCase(String anotherString)
//        将此 String 与另一个 String 比较，不考虑大小写。
        String str = "ABCD";
        String str2 = "abcd";
        System.out.println(str.equalsIgnoreCase(str2));
        
        //Indexof
        //返回指定子字符串在此字符串中第一次出现处的索引。
        System.out.println(str.indexOf("A"));
        System.out.println(str.indexOf("E"));
        String str3 = "ABCDABCD";
        //返回指定子字符串在此字符串中第一次出现处的索引，从指定的索引开始。
        System.out.println(str3.indexOf("A",3));
        System.out.println(str2.toUpperCase());//变成大写
        System.out.println(str.toLowerCase());
        //lastIndexOf(int ch, int fromIndex)
        //返回指定字符在此字符串中最后一次出现处的索引，从指定的索引处开始进行反向搜索。

//        split(String regex)
//        根据给定正则表达式的匹配拆分此字符串。
        String str4 = "hello.java!!hello.class!!hello.world";
        String[] arr = str4.split("!!");
        for (String ele: arr) {
            System.out.println(ele);
        }


        



        














    }




    //length()
    //charAt(0)
    //indexOf("AB") //AB子字符串出现的位置
    //lastIndexOf("ABC") //从后往前第一次出现的位置
    //str1.equalsIgnoreCase(str3)

//         String的创建和转换:
//    byte[] getBytes():把字符串转换为byte数组
//    char[] toCharArray():把字符串转换为char数组
//    String(byte[] bytes):把byte数组转换为字符串
//    String(char[] value):把char数组转换为字符串

    //把char数组转换成为string 相互转换

//    String fileNames = "java.class;java.text;java.hello"; //split    foreach
}

package _12常用类string和日期;

/**
 * Created by E430 on 2017/7/11.
 */
public class _08StringBuilder {
    public static void main(String[] args) {
        StringBuilder s1 = new StringBuilder(16);
        // append
        s1.append("A");
        s1.append("B");
        System.out.println(s1);
        //链式编程  当返回为一个自身对象时候 就可以用链式编程
        s1.append("C").append("D");
        System.out.println(s1);

        //deleteCharAt方法 API
        String str = "ABCDEF";
        //删除最后一个元素
        //new StringBuilder(str).deleteCharAt(str.length() - 1);
       //StringBuilder newStr = new StringBuilder(str).deleteCharAt(str.length() - 1);
        String newStr = new StringBuilder(str).deleteCharAt(str.length() - 1).toString();
        System.out.println(new StringBuilder(str).deleteCharAt(str.length() - 1));
        System.out.println(newStr);
        
        System.out.println(new StringBuffer("ABCDEFG").reverse());

        //不能把字符串直接定义一个字符串为StringBuilder
        //StringBuffer st = "ABCD";

    }
}

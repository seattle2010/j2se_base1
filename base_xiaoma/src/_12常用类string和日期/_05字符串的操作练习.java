package _12常用类string和日期;

/**
 * Created by E430 on 2017/7/11.
 */
public class _05字符串的操作练习 {
    public static void main(String[] args) {
        test();
        hasLength1();
        Boolean boo = hasLength2();
        System.out.println(boo);
        String str = "";
        Boolean boo2 = hasLength3(str);
        System.out.println(boo2);
    }


    private static void test() {
        String fileNames = "java.class;java.text;java.hello";
        String[] names = fileNames.split(";");
        System.out.println(names);
        for (String ele : names) {
            System.out.println(ele);
        }
    }

    private static void hasLength1() {
        //判断一个字符串是否为空  空分为  ""  和 null
        String str = "";
        if (str != null && !"".equals(str.trim())) {
            System.out.println("非空");
        } else {
            System.out.println("空");
        }
    }

    //判断一个字符串是否为空  方法的形式  可以调用
    private static boolean hasLength2() {
        String str = " ";
        if (str != null && !"".equals(str.trim())) {
            return true;
        }
        return false;
    }

    //判断一个字符串是否为空   三目的形式
    private static boolean hasLength3(String str) {

        return str != null && !"".equals(str.trim());
    }

    //!!!判断一个字符串为空
    private static boolean isBlank(String str) {

        return str == null || "".equals(str.trim());
    }
}

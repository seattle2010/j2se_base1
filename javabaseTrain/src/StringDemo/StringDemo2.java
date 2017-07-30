//package StringDemo;
//
///**
// * Created by shi on 2017/7/26.
// */
//public class StringDemo2 {
//    public static void main(String[] args) {
//
//        String string = "ABCD";
//        System.out.println(string.length());
//
//        String string1 = " ABCD ";
//        System.out.println(string.equals(string1));
//        //trim() 返回字符串的副本，忽略前导空白和尾部空白。
//        System.out.println(string.equals(string1.trim()));
//        String string3 = "ABCD";
//        String string4 = "ABCD";
//        string5 string5 = new String("ABCD");
//        System.out.println(string3 == string4);
////toCharArray() 将此字符串转换为一个新的字符数组。
//        String str = "ABCD";
//        char[] chars = str.toCharArray();
//        for (char ele : chars) {
//            System.out.println(ele);
//        }
//        //判断一个字符串是否为空  空分为  ""  和 null
//        //(^(str != null && !"".equals(str.trim())))
//        //(str == null || "".equals(str.trim()))
//        String str10 = "";
//        if (str != null && !"".equals(str.trim())) {
//            System.out.println("非空");
//        } else {
//            System.out.println("空");
//        }
//        String str11 = "";
//        isEmpty(str11);
//
//    }
//
//
//
//
//    }
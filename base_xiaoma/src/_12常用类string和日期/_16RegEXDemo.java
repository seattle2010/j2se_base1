package _12常用类string和日期;

/**
 * Created by E430 on 2017/7/26.
 */
public class _16RegEXDemo {
    public static void main(String[] args) {
        //举例：校验qq号码.
        //1: 要求必须是5-15位数字
        //2: 0不能开头
        String qq = "604154942";
        String regex = "[1-9][0-9]{4,14}";
        boolean flag1 = qq.matches(regex);
        System.out.println(flag1);


        //举例：校验手机号码
        //1：要求为11位数字
        //2：第1位为1，第2位为3、4、5、7、8中的一个，后面9位为0到9之间的任意数字。
        String phone = "18800022116";
        String regex2 = "1[34578][0-9]{9}";
        boolean flag2 = phone.matches(regex2);
        System.out.println(flag2);

     //public String[] split(String regex)	 //根据给定正则表达式的匹配规则，拆分此字符串
     //   举例：分割出字符串中的的数字
        String s = "18-22-40-65";
        String regex3 = "-";
        String[] result3 = s.split(regex);

        String str4 = "18 22 40 65";
        String regex4 = " ";
        String[] result4 = str4.split(regex);

       //public String replaceAll(String regex,String replacement)	//将符合规则的字符串内容，全部替换为新字符串
       // 举例：把文字中的数字替换成*
        String str5 = "Hello12345World6789012";
        String regex5 = "[0-9]";
        String result5 = str5.replaceAll(regex5, "*");






        //规则："[0-9]{6,12}"
        //该规则需要匹配的内容是：长度为6位到12位的数字。
        //如：使用数据"123456789"进行匹配结果为true；
        //使用数据"12345"进行匹配结果为false。
        //
        //规则："1[34578][0-9]{9}"
        //该规则需要匹配的内容是：11位的手机号码，第1位为1，第2位为3、4、5、7、8中的一个，后面9位为0到9之间的任意数字。
        //如：使用数据"12345678901"进行匹配结果为false；
        //使用数据"13312345678"进行匹配结果为true。
        //
        //规则："a*b"
        //该规则需要匹配的内容是：在多个a或零个a后面有个b；b必须为最后一个字符。
        //如：使用数据"aaaaab"进行匹配结果为true；
        //使用数据"abc"进行匹配结果为false。

    }
}

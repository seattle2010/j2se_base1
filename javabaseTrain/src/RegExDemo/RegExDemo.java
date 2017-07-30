package RegExDemo;

/**
 * Created by shi on 2017/7/26.
 */
public class RegExDemo {
    public static void main(String[] args) {
        //正则表达式  Regular Expression 规则表达检查
        //举例：校验qq号码.
        //1: 要求必须是5-15位数字
        //2: 0不能开头
//   [0-9] 所有数字
//        [a-z]表示所有小写字母
//                [A-Z]表示所有大写字母
//                [0-9a-zA-Z] 表示所有的英文字母和数字
//        [0-9|a-z|A-Z] 表示所有的英文字母和数字
        String QQ = "12345";
        String RegEx = "[1-9][0-9]{4,14}";
         Boolean ok = QQ.matches(RegEx); 
         System.out.println(ok);

        //举例：校验手机号码
        //1：要求为11位数字
        //2：第1位为1，第2位为3、4、5、7、8中的一个，后面9位为0到9之间的任意数字。
        String Moble = "12345";
        String RegEx1 = "1[34578][0-9]{9}";
        Boolean ok1 = Moble.matches(RegEx1);
        System.out.println(ok1);

        // 举例：把文字中的数字替换成*
//        replaceAll(String regex, String replacement)
//        使用给定的 replacement 替换此字符串所有匹配给定的正则表达式的子字符串。
        String str = "hello123java456";
        String RegEx2 ="[0-9]";
        String ok2 = str.replaceAll(RegEx2,"*");
        System.out.println(ok2);

















    }
}

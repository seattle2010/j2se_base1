package _12常用类string和日期;

/**
 * Created by E430 on 2017/7/26.
 */
public class _16RegularExpression {
    public static void main(String[] args) {
        String input = "123sb456";
        boolean ok = isNumber(input);
        System.out.println(ok);
    }

    private static boolean isNumber(String input) {
        char[] chars = input.toCharArray();
for(char ele:chars){
    if(ele < '0' || ele > '9'){
        return false;
    }
}
        return true;
    }
}

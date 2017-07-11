package _12常用类string和日期;

/**
 * Created by E430 on 2017/7/11.
 */
public class _05字符串的操作练习 {
    public static void main(String[] args) {
        test();
    }

    private static void test() {
        String fileNames = "java.class;java.text;java.hello";
        String[] names = fileNames.split(";");
        System.out.println(names);
        for(String ele:names){
            System.out.println(ele);
        }
    }
}

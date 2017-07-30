package StringDemo;

/**
 * Created by shi on 2017/7/26.
 */
public class StringDemo3 {
    private static Boolean isEmpty(String str) {
        if (str != null && !"".equals(str.trim())) {
            return true;
        }
        return false;
    }
//三目
    private static Boolean isEmpty2(String str) {
        return str != null && !"".equals(str.trim());
    }

    public static void main(String[] args) {
    String string = "";
        Boolean boo = isEmpty(string);
        System.out.println(boo);

        Boolean boo2 = isEmpty2(string);
        System.out.println(boo2);

        
    }


}

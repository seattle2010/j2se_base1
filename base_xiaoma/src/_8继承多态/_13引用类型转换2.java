package _8继承多态;

/**
 * Created by E430 on 2017/7/20.
 */
public class _13引用类型转换2 {
    public static void main(String[] args) {
        Object obj = "ABC";
        System.out.println(obj instanceof  Object);//true
        System.out.println(obj instanceof  String);//true
        System.out.println(obj.getClass());//String  获取对象的真实类型
        System.out.println(obj.getClass() == String.class); //true
        System.out.println(obj.getClass() == Object.class); //false
    }
}

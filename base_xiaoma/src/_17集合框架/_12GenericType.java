package _17集合框架;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by E430 on 2017/7/30.
 */
public class _12GenericType {
    public static void main(String[] args) {
        //泛型类  直接在类/接口上定义泛型
        List list = new ArrayList();
        List<String> list2 = new ArrayList<String>();
        list2.add("12");// 直接输入12 就错  不能是整数包装类
        String str = list2.get(0);
        System.out.println(str);

        List<Integer> list3 = new ArrayList<Integer>();
        list3.add(12);
        System.out.println(list3);     //底层的原理是  还是强转了的代码 语法糖

        //泛型方法   在方法上声明泛型

        
    }
}

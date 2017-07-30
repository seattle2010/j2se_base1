package _18集合框架2;

import java.util.LinkedHashSet;
import java.util.Set;

/**
 * Created by E430 on 2017/7/30.
 */
public class _03LinkedHashSetDemo {
    public static void main(String[] args) {
        //Set<String> set = new HashSet<>();  //按照hash表的顺序显示结果
        Set<String> set = new LinkedHashSet<>();//按照添加的先后顺序显示结果
        set.add("X");
        set.add("C");
        set.add("B");
        set.add("1");
        set.add("2");
        System.out.println(set);
    }
}

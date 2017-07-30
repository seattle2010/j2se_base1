package _18集合框架2;

import java.util.TreeSet;

/**
 * Created by E430 on 2017/7/30.
 */
// 有序 无序 是说 有没有按照添加的顺序
public class _04TreeSetDemo {
    public static void main(String[] args) {
        TreeSet<String> set = new TreeSet<>();
        set.add("Y");
        set.add("D");
        set.add("A");
        set.add("1");
        set.add("6");
        set.add("c");
        set.add("b");
        //set.add("b");//不能重复
        System.out.println(set); //[1, 6, A, D, Y, b, c]  按照码表的顺序排列

        System.out.println(set.first()); //1
        System.out.println(set.last());  //c
    }
}

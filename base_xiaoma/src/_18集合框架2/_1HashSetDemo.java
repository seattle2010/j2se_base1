package _18集合框架2;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * Created by E430 on 2017/7/30.
 */
//演示hashset用法
public class _1HashSetDemo {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();
        set.add("A");
        set.add("B");
        set.add("C");
        //set.add("C");// 自动覆盖  不能重复

        Set<String> set2 = new HashSet<>();
        set2.add("1");
        set2.add("2");

        set.addAll(set2);
        System.out.println(set); 
        //set.clear();
        //System.out.println(set); //   [ ]
        
        System.out.println(set.contains("2")); //true
//for
        for(String ele:set){
            System.out.println(ele);
        }

        //iterator
        Iterator<String> it = set.iterator();
        while (it.hasNext()) {
            System.out.println(it.next()); 
        }
System.out.println("^^^^");
        set.removeAll(set2);
        System.out.println(set); 
    }
}

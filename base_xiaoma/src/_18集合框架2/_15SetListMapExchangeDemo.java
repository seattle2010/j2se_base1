package _18集合框架2;

import java.util.*;

/**
 * Created by E430 on 2017/7/30.
 */
public class _15SetListMapExchangeDemo {
    public static void main(String[] args) {
        //使用set集合存储一个班级学生的名称
        Set<String> names1 = new HashSet<>();
        names1.add("tom");
        names1.add("jack");
        names1.add("rose");
//班级2
        Set<String> names2 = new HashSet<>();
        names2.add("tom2");
        names2.add("jack2");
        names2.add("rose2");

        //使用map存储多个班级的学生
        //学院A
        Map<String, Set<String>> classMap1 = new HashMap<>();
        classMap1.put("Chinese", names1);
        classMap1.put("France", names2);
        //学院B
        Map<String, Set<String>> classMap2 = new HashMap<>();
        classMap2.put("Japanese", names1);
        classMap2.put("USA", names2);

        //使用list来存储所有学院的学生名字
          //拷贝上面的map的Map<String, Set<String>>
        List<Map<String, Set<String>>> school = new ArrayList<>();
        school.add(classMap1);
        school.add(classMap2);
        
        System.out.println(school);

        //以后这个情况用的比较多
        List<Map<String,Object>> list = new ArrayList<>();

    }
}

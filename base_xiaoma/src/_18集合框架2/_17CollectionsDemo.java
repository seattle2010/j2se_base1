package _18集合框架2;

import java.util.*;

/**
 * Created by E430 on 2017/7/30.
 */
//Collections类封装了set list map的操作工具方法
public class _17CollectionsDemo {
    public static void main(String[] args) {
        //获取空集合对象  集合不为null
        List<Object> list1 = Collections.EMPTY_LIST; //常量 老了
        List<Object> list2 = Collections.emptyList();//方法  老了
        List<Object> list3 = new ArrayList<>(); //java7 开始

        //常用的集合类 ArrayList/HashSet/HashMap 都是线程不安全的
        List<Object> list = Collections.synchronizedList(new ArrayList<>());
        Set<Object> set = Collections.synchronizedSet(new HashSet<>());
        Map<Object, Object> map = Collections.synchronizedMap(new HashMap<>());
    }
}

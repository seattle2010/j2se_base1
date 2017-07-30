package _17集合框架;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by E430 on 2017/7/30.
 */
public class _15泛型通配符 {
    public static void main(String[] args) {
        List<Integer> list1 = new ArrayList<>();
        List<String> list2 = new ArrayList<>();
        List<Number> list3 = new ArrayList<>();
        List<Object> list4 = new ArrayList<>();
        //上限
        doWork1(list1);
        //doWork1(list2);
        doWork1(list3);
        //doWork1(list4);
//下限
//        doWork2(list1);
        //doWork2(list2);
        doWork2(list3);
        doWork2(list4);
    }


    //private static void doWork(List<?> list) { //当不能确定应该放入什么类型的时候 用?
    private static void doWork1(List<? extends Number>  list) { //上限 必须是这个类型的子类或者相同
        System.out.println("a");
    }
    private static void doWork2(List<? super Number> list2) {//下限 必须是number类型或者number类型的父类
    }
}

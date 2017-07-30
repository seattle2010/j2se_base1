package _17集合框架;

import java.util.ArrayList;
import java.util.Vector;

/**
 * Created by E430 on 2017/7/29.
 */
//Verctor和ArrayList底层就是一个Object数组
public class _6ArrayList {
    public static void main(String[] args) {
        Vector vector = new Vector();
        vector.add("A");
        vector.add("B");
        vector.add("C");
        System.out.println(vector); 
        vector.add(0,"x");
        System.out.println(vector);
        vector.remove(0);
        System.out.println(vector);

        Vector vector1 = new Vector();
        vector1.add("A");
        vector1.add("B");

        vector.addAll(vector1);
        System.out.println(vector);

        vector.remove(0);
        System.out.println(vector);
        vector.remove("B");
        System.out.println(vector); //删除第一个遇见的B

        System.out.println("__________"); 
        ArrayListAdd();//增加
         ArrayListSet();  //修改

    }

    private static void ArrayListSet() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("A");
        arrayList.add("B");
        arrayList.add("C");
        arrayList.add("D");
        
        arrayList.set(3,"tom");//在索引3的位置用tom替换c
        System.out.println("@@@@");
        System.out.println(arrayList);

    }


    private static void ArrayListAdd() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("A");
        arrayList.add("B");
        arrayList.add("C");
        arrayList.add("D");
        System.out.println(arrayList);
        
        ArrayList arrayList1 = new ArrayList();
        arrayList1.add("A");
        arrayList1.add("B");

        System.out.println("***"); 
        arrayList.remove("D"); //删除第一个找到的
        System.out.println(arrayList); 
        arrayList.add(arrayList1);       //把arraylist1看成一个整体放入 当做一个对象
        //arrayList.addAll(arrayList1);//吧arraylist1中的所有元素当成arraylist集合中的每一个元素
        System.out.println(arrayList);

        arrayList.retainAll(arrayList1);   //在此集合中仅仅保留包含指定集合中的元素      交集 最后出来的是两个集合的交集
        //arrayList.removeAll(arrayList1);//     在此集合中移除指定集合中的元素
        System.out.println(arrayList);
        
      
        
    }
}

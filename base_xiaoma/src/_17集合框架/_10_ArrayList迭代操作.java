package _17集合框架;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Created by E430 on 2017/7/30.
 */
public class _10_ArrayList迭代操作 {
    public static void main(String[] args) {
        //集合的迭代操作
        ArrayList arrayList = new ArrayList();
        arrayList.add("A");
        arrayList.add("B");
        arrayList.add("C");
        arrayList.add("D");
        
        System.out.println(arrayList); 
        
        //方式1  for循环    arrayList.size()
        for(int i = 0;i<arrayList.size();i++){
            Object ele = arrayList.get(i); //取出指定索引位置的元素
            System.out.println(ele);
System.out.println("--------");
            //方式2 foreach
            //  for(类型 变量:数组名/iterable的实例)
            //for(Object ele: 数组名/Iterable实现类对象)
            for(Object ele1:arrayList){
                System.out.println(ele1);
            }
        }
        System.out.println("----方式3");
//方式3  用祖先迭代器Iterator()
//        Iterator it =集合对象.iterator()
        Iterator iterator = arrayList.iterator();
        System.out.println(iterator.hasNext()); 
        System.out.println(iterator.next()); //如果继续next寻找到第五个位置 就会报nosuchNumber异常

        while (iterator.hasNext()) {
            System.out.println(iterator.next()); 
        }
        ArrayList arrayList3 = new ArrayList();
        arrayList3.add("A");
        arrayList3.add("B");
        arrayList3.add("C");
        arrayList3.add("D");
        for(Iterator iterator3 = arrayList3.iterator();iterator3.hasNext();){
            System.out.println(iterator3.next());
        }
System.out.println("+++++");
        ArrayList arrayList4 = new ArrayList();
        arrayList4.add("A");
        arrayList4.add("B");
        arrayList4.add("C");
        arrayList4.add("D");
        System.out.println(arrayList4);
        //删除集合中指定的元素           !!!!!!!!!  用iterator删除 能保证主线程和迭代器循环线程的同步 多线程删除
                                      //只是单纯迭代 就可以用集合里面的迭代
        Iterator it = arrayList4.iterator();
        while (it.hasNext()) {
            Object ele = it.next();
            if("B".equals(ele)){
                it.remove();  //不能使用集合的remove方法 要使用iterator的remove方法
            }
        }
        System.out.println(arrayList4);

    }
}

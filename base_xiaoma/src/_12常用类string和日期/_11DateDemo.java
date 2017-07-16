package _12常用类string和日期;

import java.util.Date;

/**
 * Created by E430 on 2017/7/11.
 */
public class _11DateDemo {
    public static void main(String[] args) {
        //创建Date对象  是在Util包下
        Date date = new Date();
        System.out.println(date);

        //API中 构造器Date(long) 传入一个long类型毫秒数
        Date date1 = new Date(System.currentTimeMillis());//距离1970年的毫秒数
        System.out.println(date1); //Tue Jul 11 21:53:23 CST 2017  和上面一模一样

        System.out.println(date.getTime());//距离1970年毫秒数
        System.out.println(date.toLocaleString());//本地化模式时间表示


    }
}

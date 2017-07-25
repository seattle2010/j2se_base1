package _12常用类string和日期;

import java.util.Calendar;
import java.util.Date;

/**
 * Created by E430 on 2017/7/26.
 */
//Calendar在Util包下 是抽象类
public class _13CalendarDemo {
    public static void main(String[] args) {
        //创建日历对象
        Calendar c = Calendar.getInstance();
        System.out.println(c); //得到大量详细信息
        System.out.println(Calendar.YEAR); //这是java中用final常量表示年  月份是2

        System.out.println(c.get(Calendar.YEAR));
        System.out.println(c.get(Calendar.MONTH)+1); //月份是从0开始的
        System.out.println(c.get(Calendar.DAY_OF_MONTH));
        System.out.println(c.get(Calendar.HOUR_OF_DAY));
        System.out.println(c.get(Calendar.MINUTE));
        System.out.println(c.get(Calendar.SECOND));

        //Calendar对象转换成为Date类型
        Date d = c.getTime();
        
        //void add(int field,int amount)  根据日历的规则,为给定的日历字段添加或者减去制定的时间量
        System.out.println(c.get(Calendar.MONTH)); 
        
        c.add(Calendar.DAY_OF_MONTH,120);//120天后的日子  也可以用负数 -100  表示之前的多少天日子
        System.out.println(c.getTime().toLocaleString());
        c.add(Calendar.YEAR,2);//如果前面是年 对应数字就是年数 的变换
        System.out.println(c.getTime().toLocaleString());
    }
}

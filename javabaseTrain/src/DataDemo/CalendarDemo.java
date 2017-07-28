package DataDemo;

import java.util.Calendar;
import java.util.Date;

/**
 * Created by shi on 2017/7/27.
 */
public class CalendarDemo {
    public static void main(String[] args) {
        Calendar c = Calendar.getInstance();//获得日期类的一个实例
        System.out.println(c);
        
//        get(int field)
//        返回给定日历字段的值。
        System.out.println(c.get(Calendar.YEAR));//获取年份
        System.out.println(c.get(Calendar.MONTH)+1);//获取月份 +1  欧美习惯0为月份起始
        System.out.println(c.get(Calendar.DAY_OF_MONTH));
        System.out.println(c.get(Calendar.HOUR_OF_DAY));
        System.out.println(c.get(Calendar.MINUTE));
        System.out.println(c.get(Calendar.SECOND));
        System.out.println(c.getTime());  //获得并且打印之前设置取得的时间

        Date d = c.getTime();  //把Calandar的日期转换成为Date类型的
        System.out.println(d); //打印Date类型时间
//        add(int field, int amount)
//        根据日历的规则，为给定的日历字段添加或减去指定的时间量。例如，要从当前日历时间减去 5 天，可以通过调用以下方法做到这一点：
        c.add(Calendar.MONTH,4);//第一位 设定取得的月份类型 第二位表示4个月后的参数
        System.out.println(c.getTime()); //打印出4个月后的日期
        c.add(Calendar.YEAR,-2); //两年前的日期
        System.out.println(c.getTime());
        System.out.println(System.currentTimeMillis());//取得距离1970零时的毫秒数
        
        long start = System.currentTimeMillis();
        for(int i=0;i<100000;i++){
            System.out.println("i="+i);
        }
        long end = System.currentTimeMillis();
        System.out.println(end - start);//374毫秒
        
        
        
        
        

        
        
    }
}

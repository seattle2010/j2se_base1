package _12常用类string和日期;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by E430 on 2017/7/11.
 */
public class _12DateFormatDemo {
    public static void main(String[] args) throws ParseException{
        Date d = new Date();
        System.out.println(d); //Tue Jul 11 22:45:39 CST 2017
        //格式化操作
        //DateFormat是抽象类 不能new对象 通过引用getInstance方法 返回一个对象
        DateFormat df = DateFormat.getInstance();
        //.format()返回一个string类型日期
        String time = df.format(d);
        System.out.println(time); //17-7-11 下午10:30

        df = DateFormat.getDateInstance(DateFormat.LONG);  //Long长风格  short短风格
        System.out.println(df.format(d)); //2017年7月11日
        
        df = DateFormat.getDateTimeInstance(DateFormat.LONG,DateFormat.SHORT);
        System.out.println(df.format(d)); //2017年7月11日 下午10:39

        System.out.println("----------");
        //解析  把string类型转换成为Date类型
        time = df.format(d);
        Date d2 = df.parse(time);
        System.out.println(d2); //又恢复成原来的格式 Tue Jul 11 22:45:00 CST 2017
        
        //SimpleDateFormat  是DateFormat的子类 可以自定义日期格式
        SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//也可以扔到构造器中 yyyy/MM/dd
        SimpleDateFormat sdf = new SimpleDateFormat();
        String pattern = "yyyy-MM-dd HH:mm:ss";//    /斜线也可以  不要时分秒也可以
        sdf.applyPattern(pattern);//申请使用哪种时间格式

        //String time1 = sdf.format(new Date());
        String time1 = sdf2.format(new Date());
        System.out.println(time1);
        // 解析   使用什么风格格式化的 就必须使用同样风格解析回去
        java.util.Date date = sdf.parse(time1);
        System.out.println(date);
    }
    
    
}

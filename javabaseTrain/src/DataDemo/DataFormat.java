package DataDemo;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by shi on 2017/7/26.
 */
public class DataFormat {
    public static void main(String[] args) throws ParseException {
        //Date
        Date d = new Date();
        System.out.println(d);
//                          //距离1970年 零时零秒的 毫秒数
//        System.out.println(System.currentTimeMillis());
//        System.out.println(d.getTime());
//        System.out.println(d.toLocaleString());
        //DateFormat
//        getInstance()
//        获取为日期和时间使用 SHORT 风格的默认日期/时间格式器。
        //     格式化   format(Date date)  Date类型==>String类型
//        将一个 Date 格式化为日期/时间字符串。

//    解析    parse(String source)  String类型==>Date类型
//        从给定字符串的开始解析文本，以生成一个日期。
        DateFormat df = DateFormat.getInstance();//创建对象
        String format = df.format(d);
        System.out.println(format);
//        getDateInstance(int style)
// 获取日期格式器，该格式器具有默认语言环境的给定格式化风格。
//        LONG   用于 LONG 模式的常量。
DateFormat df2 = DateFormat.getDateInstance(DateFormat.LONG);
        String format2 = df2.format(d);
        System.out.println(format2);
DateFormat df3 = DateFormat.getDateInstance(DateFormat.SHORT);
        String format3 = df3.format(d);
        System.out.println(format3);
        //    //解析  把string类型转换成为Date类型
        String time = df.format(d);
    Date d2 = df.parse(time);
    System.out.println(d2);

//SimpleDateFormat  是DateFormat的子类 可以自定义日期格式
        //"yyyy/MM/dd HH:mm"
        //   y/M/d
   SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
//    SimpleDateFormat sdf = new SimpleDateFormat();
//    String pattern = "yyyy-MM-dd HH:mm:ss";
//        sdf.applyPattern(pattern);
    String time1 = sdf2.format(new Date());
    System.out.println("-------");
    
        System.out.println(time1);

//     解析   使用什么风格格式化的 就必须使用同样风格解析回去
//    java.util.Date date = sdf.parse(time1);
//        System.out.println(date);


    }


















//    Date d = new Date();
//        System.out.println(d);
//    //格式化操作
//    //DateFormat是抽象类 不能new对象 通过引用getInstance方法 返回一个对象
//    DateFormat df = DateFormat.getInstance();
//    //.format()返回一个string类型日期
//    String time = df.format(d);
//        System.out.println(time);
//
//    df = DateFormat.getDateInstance(DateFormat.LONG);
//        System.out.println(df.format(d));
//
//    df = DateFormat.getDateTimeInstance(DateFormat.LONG,DateFormat.SHORT);
//        System.out.println(df.format(d));
//
//        System.out.println("----------");
//    //解析  把string类型转换成为Date类型
//    time = df.format(d);
//    Date d2 = df.parse(time);
//        System.out.println(d2);
//
//    //SimpleDateFormat  是DateFormat的子类 可以自定义日期格式
//    SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");/
//    SimpleDateFormat sdf = new SimpleDateFormat();
//    String pattern = "yyyy-MM-dd HH:mm:ss";
//        sdf.applyPattern(pattern);
//
//    //String time1 = sdf.format(new Date());
//    String time1 = sdf2.format(new Date());
//        System.out.println(time1);
//    // 解析   使用什么风格格式化的 就必须使用同样风格解析回去
//    java.util.Date date = sdf.parse(time1);
//        System.out.println(date);
}

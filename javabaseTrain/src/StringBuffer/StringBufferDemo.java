package StringBuffer;

/**
 * Created by shi on 2017/7/26.
 */
public class StringBufferDemo {
public static void main(String[] args) {
/*        //String
        //StringBuffer  每次字符串拼接,不创建新的对象,一直使用原有的对象,
        // 同样是字符串,适合于字符串拼接,每次不创建新的对象,线程安全,效率相对较低,StringBuffer使用了synchronized同步进行修饰,能够保证线程安全
        //StringBuilder
        //是字符串,也适合于字符串拼接,没有使用synchronized同步修饰,线程相对不安全,效率较高*/
        
        StringBuffer sb = new StringBuffer();
        sb.append("A");
        sb.append("B");
        System.out.println(sb);
        //链式编程  返回的对象为自己的时候 适合于链式编程
        sb.append("C").append("D").append("E");
        System.out.println(sb);
        
//    deleteCharAt(int index)
//    移除此序列指定位置的 char。
        //deleteCharAt
        //删除字符串中最后一个字母
    String str = "ABCDE";
    System.out.println(new StringBuilder(str).deleteCharAt(str.length()-1));
    
    System.out.println(new StringBuilder(str).reverse());//颠倒








    }

    }




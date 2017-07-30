package _19文件IO流;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/**
 * Created by E430 on 2017/7/30.
 */
//演示文件字节输出流
public class _12FileOutputStreamDemo {
    public static void main(String[] args) throws IOException {
        //1.创建目标对象,(把数据保存到那个文件)
//        String file = "file/stream.txt"; //一样效果
        File target = new File("file/stream.txt");//在整个最外围项目下建立文件夹先!!!!

        //2.创建文件字节输出流对象(水管 )                                       //true为在前一次后面追加
        OutputStream outputStream = new FileOutputStream(target,true);//多态 false为默认每次覆盖成新的

        //3.具体的输出操作(往外写操作)
//        write(int b)
//        将指定字节写入此文件输出流。
outputStream.write(65); //文件中出现一个A 自动覆盖之前的 如果刷新从新运行
        //        write(byte[] b)
//        将 b.length 个字节从指定 byte 数组写入此文件输出流中。
        outputStream.write("ABCDE".getBytes());//转换成一个byte数组后 写入文件

//        write(byte[] b, int off, int len)
//        将指定 byte 数组中从偏移量 off 开始的 len 个字节写入此文件输出流。
outputStream.write("ABCDE".getBytes(),1,3);  //数组从index 1 开始 3个字符为止 写入进去

        //4.关闭资源
        outputStream.close();

    }
}

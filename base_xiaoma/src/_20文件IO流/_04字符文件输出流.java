package _20文件IO流;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 * Created by E430 on 2017/8/1.
 */
public class _04字符文件输出流 {
    public static void main(String[] args) throws IOException {
        //1 创建目标对象
        File target = new File("file/chout.txt");
        //2 创建字符输出流对象
        FileWriter out = new FileWriter(target);
        //3 写出操作
        out.write("我");
//        out.flush(); //如果有close 就不用写这个
        //一次写出多个  写出一个char数组
        out.write("是个好人".toCharArray());
        //指定哪个位置写出
        out.write("我很善良".toCharArray(),2,2);//!!!!注意 第一个2是从2开始 第二个2是写出两个字符 不是范围

        //write(String str)  直接写出一个字符串
        out.write("我很受伤");
        //4 关闭流
        out.close();
    }
}

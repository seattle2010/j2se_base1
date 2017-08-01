package _20文件IO流;

import java.io.*;

/**
 * Created by E430 on 2017/8/1.
 */
//文件字符输入流
public class _03字符输入流FileReader {
    public static void main(String[] args) throws IOException {
        //1 创建源
        File srcFile = new File("file/ch.txt");
        //2 创建文件字符输入流对象 (管道)
        FileReader in = new FileReader(srcFile);
        //3 具体的读取操作
//        int ch= in.read(); // 每次只读取一个字符.读取到末尾返回-1
//        System.out.println((char)in.read());//A
//        System.out.println((char)in.read());//B
//        System.out.println((char)in.read());//C
   //用read (char[] buffer)
        char[] buffer = new char[5];
        int len = -1;//表示当前读取字符的数量
       len = in.read(buffer);
        while (len != -1) {
            System.out.println(buffer);
            len = in.read(buffer);
        }
        //4 关闭资源
        in.close();
    }
}

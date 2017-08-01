package _20文件IO流;

import java.io.*;

/**
 * Created by E430 on 2017/8/1.
 */
public class _05FileCopyDemo {
    public static void main(String[] args) throws IOException {
        //1 创建源和目标对象
        File srcFile = new File("file/ch.txt");
        File targetFile = new File("file/ch_copy1.txt");
        //2 创建输入和输出流对象
        Reader in = new FileReader(srcFile);
        Writer out = new FileWriter(targetFile);
        //3 读和写操作
        char[] buffer = new char[100];
        int len = -1;
//        len = in.read(buffer);
        while ((len = in.read(buffer)) != -1) {
//            System.out.println(buffer);
//            len = in.read(buffer);
            out.write(buffer,0,len);
        }
        //4 关闭流
        out.close();
        in.close();
    }
}

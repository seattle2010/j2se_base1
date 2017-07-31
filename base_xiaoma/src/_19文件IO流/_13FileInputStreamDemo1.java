package _19文件IO流;

import java.io.*;

/**
 * Created by E430 on 2017/7/31.
 */
//读取整个文件的字节 拷贝到另一个文件中
public class _13FileInputStreamDemo1 {
    public static void main(String[] args) throws IOException {
        //1. 创建源 (挖井)和 目标
        File srcFile = new File("file/stream.txt");
        File targetFile = new File("file/stream_copy.txt");
        //2.创建文件字节输入流对象,并接在源上/创建输出对象
        InputStream inputStream = new FileInputStream(srcFile);
        OutputStream outputStream = new FileOutputStream(targetFile);
        //3.具体读取操作/写入操作
        byte[] buffer = new byte[10]; //先定义个小水桶 最多能存5个字节

        int len = -1;
        while ((len =inputStream.read(buffer)) != -1) {
            System.out.println( new String(buffer, 0, len));
outputStream.write(buffer,0,len);
        }
        //4关闭资源
        inputStream.close();
        outputStream.close();
    }
}

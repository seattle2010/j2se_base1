package _19文件IO流;

import java.io.*;
import java.util.Arrays;

/**
 * Created by E430 on 2017/7/31.
 */
//演示文件字节输入流
public class _13FileInputStreamDemo {
    public static void main(String[] args) throws IOException {
        //1. 创建源 (挖井)
        File file = new File("file/stream.txt");
        //2.创建文件字节输入流对象,并接在源上
        InputStream inputStream = new FileInputStream(file);
        //3.具体读取操作

//        read()
//        从此输入流中读取一个数据字节。
        int read = inputStream.read();//int比byte大 所以用了int
        System.out.println(read); //65

//        read(byte[] b)
//        从此输入流中将最多 b.length 个字节的数据读入一个 byte 数组中。

        byte[] buffer = new byte[10]; //先定义个小水桶 最多能存5个字节
        System.out.println(Arrays.toString(buffer));//先打印一下 看看  [0, 0, 0, 0, 0]
        //!!!返回缓冲区总字节数  如果设定小桶的容量小于总字节数 则显示小桶的容量
        int ret = inputStream.read(buffer);//相当于小水桶 先接到水桶里 缓冲区
        System.out.println(ret);
        System.out.println(Arrays.toString(buffer)); //[65, 65, 65, 66, 67]

        //4.关闭资源
        inputStream.close();
    }
}

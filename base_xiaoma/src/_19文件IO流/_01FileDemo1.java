package _19文件IO流;

import java.io.File;

/**
 * Created by E430 on 2017/7/30.
 */
public class _01FileDemo1 {
    public static void main(String[] args) {
        //表示一个文件的路径
        String path1 = "c:\\java\\123.txt";
        String path2 = "c:/java/123.txt";
        String path3 = "c:"+ File.separator+"java"+File.separator+"123.txt";
        System.out.println(path3);

        //创建File对象
        File f1 = new File("C:/abc/123.txt");//既使路径不存在 也不会报错
        File f2 = new File("C:/abc/","123.txt");

        //File dir = new File("C:/abc");
        //File f3 = new File(dir,"123.txt");


    }
}

package _19文件IO流;

import java.io.File;
import java.io.IOException;

/**
 * Created by E430 on 2017/7/30.
 */
//看api   file
public class _01FileDemo1 {
    public static void main(String[] args) throws IOException {
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

        //操作文件的路径和名称
        test1();
//  检测file状态的方法
        test2();
        //操作文件的相关方法
        test3();
//File类中方法-目录操作
test4();




    }



    private static void test1() {
        //操作文件的路径和名称
//        getAbsolutePath()  :获取绝对路径 返回string
//        getAbsoluteFile()  :获取绝对路径  返回file类型 file也是string类型
//        getName() :获取文件名称
//        getPath() :获取文件路径
//        getParent() :获取上级目录文件
//        getParentFile() :获取上级目录路径

        File f1 = new File("C:/abc/123.txt");
        System.out.println(f1.getAbsolutePath());
        System.out.println(f1.getAbsoluteFile());

        System.out.println(f1.getName());
        System.out.println(f1.getPath());

        System.out.println(f1.getParent());
        System.out.println(f1.getParentFile());
    }

    private static void test2() {
        //  检测file状态的方法
//        canExecute() //判断是否是可执行文件
//        canRead()
//        canWrite()
//        isHidden()
//        lastModified()
//        length()
        File f1 = new File("C:/abc/123.txt");
        System.out.println(f1.canExecute()); //false  or true
        System.out.println(f1.canRead());
        System.out.println(f1.canWrite());
        System.out.println(f1.isHidden());
        System.out.println(f1.lastModified());
//        System.out.println(new java.util.Date(f1.lastModified()).toLocaleString());
        System.out.println(f1.length());

    }
    private static void test3() throws IOException {
        //操作文件的相关方法
//        isFile() :是否是文件
//        exists() :判断文件是否存在
//        createNewFile() :创建新的文件
//        delete() :删除文件
//        renameTo() :重新修改路径和名称

        File f1 = new File("C:/abc/123.txt");
        System.out.println(f1.isFile());
//如果这个文件不存在 创建新的文件
        if(!f1.exists()){
            f1.createNewFile();
        }else {
//            f1.renameTo(new File("C:/abc/","234.txt"));//如果存在,把123改成234.txt 放到C:/abc/
            f1.delete(); //删除文件
        }

    }

    private static void test4() {
//        File类中方法-目录操作

//        boolean isDirectory() :判断是否是目录
//        boolean mkdir()  :创建当前目录
//        boolean mkdirs() :创建当前目录和上级目录
//        String[] list() :列出所有的文件名
//        File[] listFiles() :列出所有文件对象
//        static File[] listRoots() :列出系统盘符 静态方法
        File dir = new File("C:/cde/");
        File f1 = new File(dir,"123.txt");

        System.out.println(dir.isDirectory());//true
        System.out.println(f1.isDirectory());//false

        System.out.println(dir.mkdir());//true 如果没有重复的路径文件夹存在 只能创建一级目录
        System.out.println(dir.mkdirs());//创建多级目录  C:/cde/def/efg

//        String[] names = dir.list();  //只获得文件名称 没有路径 要操作还得装进file
        File[] fs = dir.listFiles();//带路径 file就是带路径的意思
        for(File ele:fs){
            System.out.println(ele);
        }

        File[] roots = File.listRoots();
        for(File ele:roots){
            System.out.println(ele); //C:\ D:\
        }
    }
}

package _19文件IO流;

import java.io.File;
import java.io.IOException;
import java.util.Date;

/**
 * Created by E430 on 2017/8/2.
 */
public class _01FileTest {
    public static void main(String[] args) throws IOException {
        File f1 = new File("C:/abc/123.txt");
        //路径操作
        System.out.println(f1.getAbsoluteFile()); 
        System.out.println(f1.getAbsolutePath()); 
        
        System.out.println(f1.getName()); 
        System.out.println(f1.getPath()); 
        
        System.out.println(f1.getParent()); 
        System.out.println(f1.getParentFile()); 
        //状态操作
        System.out.println(f1.canExecute()); 
        System.out.println(f1.canWrite()); 
        System.out.println(f1.canRead());
        System.out.println(f1.isHidden()); 
        System.out.println(f1.length()); 
        System.out.println(f1.lastModified()); 
        System.out.println(new Date(f1.lastModified()).toLocaleString()); 
        
        //文件的相关操作
        System.out.println(f1.isFile()); 
        System.out.println(f1.exists());
        if (!f1.exists()) {
            f1.createNewFile();

        } else {
            f1.renameTo(new File("C:/abc/123.java"));
//            f1.delete();
        }

        //对目录的操作  基本都和文件一样 只是创建文件夹mkdir不同
        File dir = new File("C:/123/456/789");
        System.out.println(dir.mkdirs());//返回一个布尔值

        String[] list = dir.list();
        for(String ele:list){
            System.out.println(ele);
        }


    }
}

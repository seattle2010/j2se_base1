package _6面向对象;

/**
 * Created by E430 on 2017/7/3.
 */
class Student {
    String name;
    boolean isFee = false;

    void fees(){
        isFee = true; //设置已经缴纳学费
    }
}

public class _2StudentDemo {
    public static void main(String[] args) {
        final Student s1 = new Student();
        s1.name = "tom";
        s1.isFee = true;

        final Student s2 = new Student();
        s2.name = "jack";
        s2.isFee = true;

        final Student s3 = new Student();
        s3.name = "june";
        s3.isFee = true;

        final Student s4 = new Student();
        s4.name = "july";
        s4.isFee = false;

        //创建数组 用于存储所有的学生对象
        final Student[] arr = new Student[]{s1,s2,s3,s4};
        for(Student ele:arr){
            System.out.println(ele.name);
            System.out.println(ele.isFee);
        }

        //!!!!! 数组里存放的是s1 s4对象的地址  和创建对象的地址是一样的
        System.out.println(s1 == arr[0]);

    }
}

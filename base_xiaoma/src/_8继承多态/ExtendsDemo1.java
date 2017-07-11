package _8继承多态;

/**
 * Created by E430 on 2017/7/5.
 */
//老师
    class Teacher{
        String name;
        int age;
        String level; //级别

    public void walk(){

    }
}
//学生
class Student{
        String name;
        int age;
        String sn; //学号
    public void walk(){

    }
}
//员工
class Employee{
        String name;
        int age;
        String hireDate;
    public void walk(){

    }

}
//多个类共同的信息提出到一个类中
//父类存放共性的特征(状态 行为)
//子类存放自己特有的特性 (状态  行为)
    //解决代码重复问题
class Person{
    String name;
    int age;
    public void walk(){

    }
}
public class ExtendsDemo1 {
    public static void main(String[] args) {

    }
}

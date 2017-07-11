package _8继承多态;

/**
 * Created by E430 on 2017/7/5.
 */
class Person1{
    Person1() {  //父类构造器不能够被子类继承

    }
    //private String name;//public protected 都能够被子类访问到
    //private int age;  //public protected
    //private void walk(){} //public protected

    public String name;//public protected 都能够被子类访问到
    public int age;  //public protected
    public void walk(){
        System.out.println("walk"); 
    } //public protected
}
//子类获取父类的成员
class Student1 extends Person1{
    String sn; //学号
}
public class ExtendDemo2 {
    public static void main(String[] args) {
        Student1 s1 = new Student1();
        System.out.println(s1.sn);
        System.out.println(s1.name);
        System.out.println(s1.age);
        s1.walk();
    }



}

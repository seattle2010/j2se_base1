package Extends;
class Animal{}
class Person extends Object{   //父类
    String name;
    int age;
    void walk(){
        System.out.println("walk");
        
    }
}
class Teacher extends Person{  //子类

    int salary = 1500;
}
class Student extends Person{   //子类
    int id;
    void study(){}
}
//继承
public class ExtendPersonDemo {
    public static void main(String[] args) {
        Teacher t1 = new Teacher();
        System.out.println(t1.salary);
        System.out.println(t1.name);
        t1.walk();

    }
}

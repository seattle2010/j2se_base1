package finalDemo;
class Person{ //不能够有子类继承
   void doWork(){
      System.out.println("父类");

    }
}
class Student extends Person{

}
public class FinalDemo {
            // final 最终的 不可改变的 不可继承的
//    final 修饰变量
//    final 修饰方法  子类可以访问父类的final修饰的方法 但是不能够覆盖父类的final方法
//    final 修饰类  不能够有子类继承
public static void main(String[] args) {
    int a = 1;
    a = 2;
    final int MAX_VALUE = 2;

    Student s1 = new Student();
    s1.doWork();

}

}

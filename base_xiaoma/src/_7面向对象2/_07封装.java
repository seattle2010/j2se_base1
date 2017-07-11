package _7面向对象2;

/**
 * Created by E430 on 2017/7/4.
 */
class Person{
    //总的原则 私有化字段 公开方法
    String name;
    //int age; //这样容易让人输入错误信息
    private int age;

    void setAge(int a){
        if(a<0){
            System.out.println("数值小鱼0");
            return; //用来结束语句
        }else {
            age = a; //把参数a的值付给age字段
        }
    }
        }
public class _07封装 {
    public static void main(String[] args) {
        Person p1 = new Person();
        p1.name = "tom";
        //p1.age = -17; //不能够控制输入是否正确
        p1.setAge(17);
    }
}

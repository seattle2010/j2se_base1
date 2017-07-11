package _8继承多态;

/**
 * Created by E430 on 2017/7/6.
 */
//toString
class User {
    private String name;
    private  int age;

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String toString(){
        return this.name +","+this.age;
    }
}

public class _09ObjectDemo {

    public static void main(String[] args) {
        //1 finalize() 由垃圾回收器调用此方法 做扫尾工作

        //2Class getClass() 返回当前对象的真实值

        //3==和equals都是比较内存地址
        Object o1 = new Object();
        Object o2 = new Object();
        System.out.println(o1.getClass());
        System.out.println(o1 == o2); //false
        System.out.println(o1.equals(o2)); //false

        //String因为从写了父类object父类的equal方法 所以只比较值
        String str1 = new String("AA");
        String str2 = new String("AA");

        System.out.println(str1 == str2); //false
        System.out.println(str1.equals(str2)); //true

        //4. toString() 表示把一个对象转换成字符串
        //!!!!打印对象时 其实就是打印对象的toString方法
        //System.out.println(obj对象);等价于  System.out.println(obj对象.toString());


    }
}

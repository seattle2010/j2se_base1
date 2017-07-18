package _7面向对象2;

/**
 * Created by E430 on 2017/7/19.
 */
//构造器调用一般少功能调用多功能 用0补全   可以先从多调用少的例子开始
class User2{
    private String name;
    private int age;
    User2() {

    }

    User2(String name){
    this(name,0);
    }

    public User2(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
public class _10this2 {
    //构造器重载  构造器之间的调用
    public static void main(String[] args) {

    }

}

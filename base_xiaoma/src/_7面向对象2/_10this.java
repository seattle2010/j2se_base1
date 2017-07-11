package _7面向对象2;

/**
 * Created by E430 on 2017/7/5.
 */
class User{

    private String name;
    private int age;

    User(){
        System.out.println(this); 
    }

    public void show(){
        System.out.println("name = " + name);
        System.out.println("name = " + this.name); //效果一样
        System.out.println("name = " + age);
        System.out.println("name = " + this.age);
        //soutv=System.out.println("变量名 = " + 变量);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }


}
public class _10this {
    public static void main(String[] args) {
        User u1 = new User();
        u1.setName("tom");
        String name = u1.getName();
        System.out.println(name);

        u1.setAge(17);
        int age = u1.getAge();
        System.out.println(age);

        User u2 = new User();
        System.out.println(u2); //u2和构造器里面的this打印的地址相同  说明this是只带当前对象
        
        u2.setName("jack");
        u2.setAge(18);

        u1.show();
        u2.show();

    }
}

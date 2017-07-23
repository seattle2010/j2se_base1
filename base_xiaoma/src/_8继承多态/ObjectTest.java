package _8继承多态;

/**
 * Created by E430 on 2017/7/21.
 */
class UserX{
    private String name;
    private  int age;

    public UserX(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "UserX{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
public class ObjectTest {
    public static void main(String[] args) {
        UserX u1 = new UserX("tom",18);
        System.out.println(u1); 
        System.out.println(u1.toString());
    }
}

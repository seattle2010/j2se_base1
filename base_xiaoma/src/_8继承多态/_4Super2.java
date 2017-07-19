package _8继承多态;

/**
 * Created by E430 on 2017/7/20.
 */
class Animaly{
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }


    public Animaly() {
    }

    public Animaly(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
class Fishy extends Animaly{
    private String color;

    public String getColor() {
        return color;
    }

    public Fishy(String name, int age, String color) {
        super(name,age);
        this.color = color;
    }

    public void say(){
        System.out.println(super.getName()+super.getAge()+this.color);//super可以省略
    }
        }
public class _4Super2 {
    public static void main(String[] args) {
        Fishy f1 = new Fishy("尼莫",17,"red");
        System.out.println(f1.getName());
        System.out.println(f1.getAge());
        System.out.println(f1.getColor());

        f1.say();

    }
}

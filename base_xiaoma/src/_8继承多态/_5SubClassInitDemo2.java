package _8继承多态;

/**
 * Created by E430 on 2017/7/6.
 */
class Animal2 {
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

    private String name;
    private int age;
    
}

class Fish2 extends Animal2 {
    private String color;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
public class _5SubClassInitDemo2 {
    public static void main(String[] args) {
        Fish2 fish2 = new Fish2();
        fish2.setName("tom");
        fish2.setAge(18);
        fish2.setColor("red");
        System.out.println(fish2.getName()); 
        System.out.println(fish2.getAge()); 
        System.out.println(fish2.getColor());
        
    }
}

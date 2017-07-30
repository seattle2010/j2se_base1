package Extends;
@SuppressWarnings(value = "all")
class Animal3{
    String name;
    int age;

    public Animal3(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
class Fox extends Animal3{
    String color;

    public Fox(String name,int age,String color) {
        super(name,age);
        this.color = color;
        System.out.println("name = [" + name + "], age = [" + age + "], color = [" + color + "]");
    }
}
public class SuperConstructorDemo {
    public static void main(String[] args) {
        Fox f1 = new Fox("tom",18,"red");
    }
}

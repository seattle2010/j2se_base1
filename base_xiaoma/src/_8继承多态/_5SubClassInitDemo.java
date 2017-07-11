package _8继承多态;


/**
* 
* @param:  
* @return  
* @author nan 
* @date 2017/7/5 23:26 
*/ 
class Animal {

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    private String name;
    private int age;

    public Animal() {
        System.out.println("Animal构造器"); 
    }

    public Animal(String name,int age) {
        this.name = name;
        this.age = age;

    }
}

//子类: 子类初始化过程 创建子类对象的过程
class Fish extends Animal{
    private String color;

    public String getColor() {
        return color;
    }

    Fish(String name, int age, String color) {
        //super();   //super()是子类自带的 隐藏的 与生俱来的
        super(name,age);
        this.color = color;

        System.out.println("fish构造器"); 
    }


    public Fish() {

    }
}
public class _5SubClassInitDemo {
    public static void main(String[] args) {
        //fish fish = new fish();

        Fish fish2 = new Fish("tom",17, "red");
        System.out.println(fish2.getName());
        System.out.println(fish2.getAge()); 
        System.out.println(fish2.getColor());

    }

}

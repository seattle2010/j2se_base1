package duotai;
class Animals{
    void eat(){
        System.out.println("吃食物");
    }
    void watch(){
        System.out.println("狗看门");
    }
}
class Dog extends Animals{
    void eat(){
        System.out.println("吃狗粮吃狗粮");
    }
    void watch(){
        System.out.println("狗看门");

    }
}
class Cat extends Animals{
    void eat(){
        System.out.println("吃猫粮");
    }
    void miao(){
        System.out.println("喵喵");

    }
}
class Feeder{

    void feed(Animals a){
        System.out.println("饲养员开始喂食");
        a.eat();

        if(a instanceof Dog){
            Dog d = (Dog)a;
            d.watch();
        }else if(a instanceof Cat){
            Cat c = (Cat)a;
            c.miao();
        }
    }
}
public class 多态 {
    public static void main(String[] args) {
        Feeder f = new Feeder();//创建饲养员对象
        Animals a = new Dog();
        f.feed(a);
        a = new Cat();
        f.feed(a);
        Animals a2 = new Animals();

//         多态中  类的类型强制转换
        Dog d2 = new Dog();
        Animals a5 = (Animals)d2;
        Cat c =new Cat();

//instanceof  判断一个类型 是否属于另一个类型,是否有继承关系
        System.out.println(d2 instanceof Animals);//
        System.out.println(d2 instanceof Object);
        System.out.println(c instanceof Animals);
        System.out.println(c.getClass());  //获取一个类的类型  class duotai.Cat
        String str = new String();
        System.out.println(str.getClass());//class java.lang.String
        System.out.println(str instanceof Object);
        System.out.println(str instanceof String);

        


//        Animals a = new Dog();
//        多态就是屏蔽了子类之间的差异 让它们共同有父类的特征
//        编译阶段 运行左边 父类  表现为父类特征
//        运行阶段 运行右边 子类 表现为子类特征

//        多态的前提条件是 必须有子父类之间继承,才能实现多态
//                多态可以 在父类与子类间 更多的是运用于接口之间

    }
}

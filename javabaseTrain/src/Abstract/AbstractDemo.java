//package Abstract;
//
//class Circle implements All{
//    private int r;
//
//    public Circle(int r) {
//        this.r = r;
//    }
//
//}
//
//class JuXing implements All{
//    private double a;
//    private double b;
//
//    public JuXing(double a, double b) {
//        this.a = a;
//        this.b = b;
//    }
//
//    public Double getArea(){
//        return a*b;
//    }
//}
//class San implements AbstractGraph{
//    private int a;
//    private int b;
//    private int c;
//
//    public San(int a, int b, int c) {
//        this.a = a;
//        this.b = b;
//        this.c = c;
//    }
//    public Double getArea(){
//        Double p =(a+b+c)/2.0;  //海伦公式
//        return Math.sqrt(p*(p-a)*(p-b)*(p-c));
//    }
//
//
//    @Override
//    public Double getSize() {
//        return null;
//    }
//}
//
//    interface AbstractGraph{
//        abstract Double getSize();
//
//    }
//
//
//}
////abstract修饰的类  为抽象类
////abstract修饰的方法  为抽象方法
//
//
//public class AbstractDemo {
//    public static void main(String[] args) {
//        Circle c1 = new Circle(8);
//        System.out.println(c1.getArea());
//
//        System.out.println(new San(3, 4, 5).getArea());
//    }
//}
////
////
////
////
////
////
////
//////        特点：
//////①使用抽象abstract修饰，方法没有方法体，留给子类去实现/覆盖。
//////②　抽象方法修饰符不能是private 和 final以及static，为什么？
//////③抽象方法必须定义在抽象类或接口中。
//////        一般的：习惯性把abstract写在方法修饰符最前面，一看就知道是抽象方法。
//////                使用abstract关键字修饰的类。
//////        特点：
//////①不能创建实例即不能new一个抽象类,即使创建出抽象类对象,调用抽象方法,根本没有方法体。
//////②　可以不包含抽象方法，若一旦包含，该类必须作为抽象类,抽象类可以包含普通方法(留给子类调用的),抽象类是有构造器的,子类构造器必须先调用父类构造器。
//////③　若子类没有实现/覆盖父类所有的抽象方法，那么子类也得作为抽象类(抽象派生类)。
//////④构造方法不能都定义成私有的，否则不能有子类(创建子类对象前先调用父类构造方法)。
//////⑤　抽象类不能使用final修饰，因为必须有子类，抽象方法才能得以实现。
//////⑥　是不完整的类，需作为父类(必须要有子类)，功能才能得以实现。
//////        抽象类:一般的,我们起名,习惯使用Abstract作为前缀,让调用者一看就知道是抽象类.
//////                抽象类中可以不存在抽象方法,如此这样没有太大的意义,但是可以防止外界创建对象,所以我们会发现有些工具类没有抽象方法,但是也使用abstract来修饰..
//////                抽象类不能实例化：
//////
//////                抽象类和普通类的区别:
//////
//////        普通类有的成员(方法,字段,构造器),抽象类都有.
//////                抽象类不能创建对象,抽象类中可以包含抽象方法.
////
////
////
////
////    }
////}

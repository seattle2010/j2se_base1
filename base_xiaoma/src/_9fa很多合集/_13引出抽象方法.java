package _9fa很多合集;

/**
 * Created by E430 on 2017/7/9.
 */
//求圆面积          可以先创建一个求圆面积的方法  再把方法放在类中  再创建构造器模式传值 三种模式层层推进
class Circle {
    private Integer r;

    public Circle(Integer r) {
        this.r = r;
    }

    public Double getArea() {
        return 3.14*r*r;
    }
}

//class Circlex {
//
//
//    public Double getArea(Integer r) {
//        return 3.14*r*r;
//    }
//}

//求矩形面积
class Mark {
    
    private Integer x;
    private Integer y;

    public Mark(Integer x, Integer y) {
        this.x = x;
        this.y = y;
    }

    public int getArea() {
        return x*y;
    }
    //public Double getArea2() {       //若果定义返回类型为浮点型包装类,则用这个方法
    //
    //    return x.doubleValue()*y.doubleValue();
    //}
}

//求三角形面积
class SanJiao extends Graphx{
private  Integer a;
private  Integer b;
private  Integer c;

    public SanJiao(Integer a, Integer b, Integer c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public Double getArea() {
        Double p = (a + b + c)/2.0;
        return Math.sqrt(p*(p-a)*(p-b)*(p-c));
    }
}

//为了推导出抽象 而临时创建的父类
//class Graphx {
//    public Double getArea() {
//        return 0.0;
//    }
//}
abstract class Graphx {
    Graphx(){}//抽象类有构造器 但是不能使用
    abstract public Double getArea();

    void doWork() {
        //抽象类可以有普通方法
    }
}



public class _13引出抽象方法 {
    public static void main(String[] args) {
        // System.out.println(new Circlex().getArea(17));  用纯创建类里面有方法  在方法里传递参数的方式 于Circlex类对应

        //Circle circle = new Circle(10);
        //Double d = circle.getArea();
        //System.out.println(d);           //上面三句和下面一样效果

        //System.out.println(new Circle(10).getArea());
        //
        //System.out.println(new Mark(3,4).getArea());
        
        System.out.println(new SanJiao(3,4,5).getArea());     //返回值为0.0
    }
}

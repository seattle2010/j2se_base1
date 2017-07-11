package _9fa很多合集;

/**
 * Created by E430 on 2017/7/9.
 */
abstract class Graph {  //图形类
    abstract public Double getArea();
}
class Circle2 extends Graph{

       private Integer r;
       Circle2(int r) {
           this.r = r;
       }

       public Double getArea() {
           return Math.PI*r*r;
       }
}

class Mark2 extends Graph{
    private Integer x;
    private Integer y;

    Mark2(Integer x, Integer y) {
        this.x = x;
        this.y = y;
    }

    public Double getArea() {
        return x.doubleValue()*y.doubleValue();
    }

}

class San2 extends Graph {
    private Integer a;
    private Integer b;
    private Integer c;

    San2(Integer a, Integer b, Integer c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public Double getArea() {
        Double p =(a+b+c)/2.0;
        return Math.sqrt(p*(p-a)*(p-b)*(p-c));
    }
}
public class _132AbstractDemo {
    public static void main(String[] args) {
        System.out.println(new Circle2(10).getArea());
        System.out.println(new Mark2(10,20).getArea());
        System.out.println(new San2(3,4,5).getArea());

    }
}

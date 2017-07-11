package _9fa很多合集;

/**
 * Created by E430 on 2017/7/9.
 */
//求yuan面积
class Circle {
    private Integer r;

    public Circle(Integer r) {
        this.r = r;
    }

    public Double getArea() {
        return 3.14*r*r;
    }
}

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
}


public class _13引出抽象方法 {
    public static void main(String[] args) {
        //Circle circle = new Circle(10);
        //Double d = circle.getArea();
        //System.out.println(d);           //上面三句和下面一样效果
        System.out.println(new Circle(10).getArea());

        System.out.println(new Mark(3,4).getArea()); 
    }
}

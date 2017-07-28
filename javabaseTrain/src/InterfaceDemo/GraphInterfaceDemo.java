package InterfaceDemo;

import com.sun.corba.se.impl.orbutil.graph.Graph;

/**
 * Created by shi on 2017/7/25.
 */
class Circle implements Graph2 {//继承了接口Graph2的实现类Circle
    @Override
    public Integer getArea(int a, int b,int c) {//接口方法的实现
        return a*b;
    }
}
interface Graph2 { //定义一个图形接口
    Integer getArea(int a,int b,int c);//接口的抽象方法
}
public class GraphInterfaceDemo {
    public static void main(String[] args) {
        Graph2 circle = new Circle();//多态的接口
System.out.println(circle.getArea(3,4,0));//运行时期调用子类的方法
        
    }
}

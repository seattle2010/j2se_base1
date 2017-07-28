package Extends;
//一同 两小 一大
//方法签名相同 子类返回类型一定要相同或小于父类类型
//子类出现的异常一定要相同或者小于父类
// 子类的修饰符权限一定要大于或等于父类
class bird{
    Object fly(){
        System.out.println("鸟儿飞");
       return null;
    }
}

class penguin extends bird{

    String fly(){
        super.fly();
        System.out.println("会卖萌");
        return null;
    }

}
public class AnimalDemo {
    public static void main(String[] args) {
        penguin p1 = new penguin();
        //Override 方法覆盖
        p1.fly();

    }
}

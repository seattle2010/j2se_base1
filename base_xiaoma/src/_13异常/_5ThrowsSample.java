package _13异常;

/**
 * Created by E430 on 2017/7/26.
 */
//定义一个接口 子类不能抛出比父类更大的异常
interface IWalkable{
    void walk() throws Exception;
}

class Tiger implements IWalkable  {

    @Override
    public void walk() throws ArithmeticException,IllegalAccessException{//可以不超过父类 跑出多个 也可以不抛
        System.out.println("son");
    }
}

public class _5ThrowsSample {

    public static void main(String[] args) {

    }
}

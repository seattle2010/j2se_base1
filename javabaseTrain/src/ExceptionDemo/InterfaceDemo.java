package ExceptionDemo;

/**
 * Created by shi on 2017/7/27.
 */
//自定义异常
    //1 继承于受检查的异常 extends runtimeException以外的异常
    //2 继承于 runtime运行时期异常
interface Iwalkable {
    void doWork();
}

class Tiger implements Iwalkable {

    public void doWork(){
       System.out.println("子类方法");

    }
}
public class InterfaceDemo {
    public static void main(String[] args) {

    }

}

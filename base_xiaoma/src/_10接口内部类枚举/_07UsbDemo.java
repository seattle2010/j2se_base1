package _10接口内部类枚举;

/**
 * Created by E430 on 2017/7/9.
 */
//做这个之前  可以把抽象的三角形改成接口  很简单  就是extends换成implements

//面向接口编程的具体例子

//面向接口编程: 多态的好处:把实现类对象付给接口类型变量 屏蔽了不同实现类之间的实现差异,从而做到通用编程
//案例:使用USB设备来工作  鼠标和打印机 统一规范后插入到主板上
interface IUsb {
    void swapData();
}

//鼠标

class Mouse implements IUsb{
    public void swapData() {  //swapData交换数据
        System.out.println("鼠标在移动");
    }
}

//打印机
class Printer implements IUsb {

    @Override
    public void swapData() {
        System.out.println("打印机插入");
    }
}

//主板
class MatherBoard {
    public static void plugIn(IUsb usb) {
        usb.swapData();
    }
}

public class _07UsbDemo {

    public static void main(String[] args) {
Mouse mouse = new Mouse();
        MatherBoard.plugIn(mouse);

        //安装打印机
        MatherBoard.plugIn(new Printer());

        IUsb i = new Mouse();
        MatherBoard.plugIn(i);


    }
}

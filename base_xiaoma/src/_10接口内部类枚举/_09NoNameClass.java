package _10接口内部类枚举;

/**
 * Created by E430 on 2017/7/25.
 */
//和接口时候的例子相同  在那个基础上写
interface IUSB {
    void swapData();
}

//新创建一个键盘类        先写这个 是模板  匿名内部类和这个效果一样 根据这个改写
//class KeyBoard implements IUSB {
//    @Override
//    public void swapData() {
//        System.out.println("键盘打字");
//    }
//}

class MatherBoard2 {
    public static void plugIn(IUSB usb) {
        usb.swapData();
    }
}

public class _09NoNameClass {
    public static void main(String[] args) {
        //MatherBoard2.plugIn(new KeyBoard());
        //创建键盘 创建一个IUSB的匿名实现类对象
        MatherBoard2.plugIn(new IUSB() {
            @Override
            public void swapData() {
                System.out.println("匿名内部类键盘在打印"); 
            }
        });
    }
}

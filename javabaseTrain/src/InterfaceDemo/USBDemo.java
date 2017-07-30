package InterfaceDemo;

/**
 * Created by shi on 2017/7/25.
 */
interface IUSB {
    void swapData();
}
class Mouse implements IUSB{
    @Override
    public void swapData() {
        System.out.println("鼠标在移动");
    }
}

class KeyBoard implements IUSB{
    public void swapData() {
        System.out.println("键盘在打字");
    }
}

//class Printer implements IUSB{
//    public void swapData() {
//        System.out.println("Printer is printing");
//    }
//}
//主板
class MatherBoard {
    public static void plugIn(IUSB iusb) {
        iusb.swapData();
    }
}
public class USBDemo {


    public static void main(String[] args) {
        System.out.println("hello");
        MatherBoard.plugIn(new Mouse());
        KeyBoard keyBoard = new KeyBoard();
        MatherBoard.plugIn(keyBoard);
System.out.println("-----------");

        MatherBoard.plugIn(new IUSB() {
            @Override
            public void swapData() {
                System.out.println("鼠标在移动");
            }
        });
        MatherBoard.plugIn(new IUSB() {
            @Override
            public void swapData() {
                System.out.println("键盘在打字");
            }
        });
        MatherBoard.plugIn(new IUSB() {
            @Override
            public void swapData() {
                System.out.println("Printer is printing");
            }
        });
    }
}




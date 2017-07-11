package _9fa很多合集;

/**
 * Created by E430 on 2017/7/8.
 */
class IntWapper {
    private int value;

    public int getValue() {
        return value;
    }

    public IntWapper(int value) {
        this.value = value;
    }
}
public class _08包装类IntWapper {

    public static void main(String[] args) {
        IntWapper wapper = new IntWapper(17);
        System.out.println(wapper.getValue());
    }

}

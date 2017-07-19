package _8继承多态;

/**
 * Created by E430 on 2017/7/20.
 */
class SuperClassx{
    public String name = "superClass.name";

    public static void ooxx(){

    }
}
class SubClassx extends SuperClassx{
    public int name = 18; //隐藏了父类的name字段

    public void doWork(){
        boolean name = false; //隐藏了本类中的字段
        System.out.println(name); //false
        System.out.println(this.name); //18
        System.out.println(super.name); //superClass.name
    }

    public static void ooxx(){} //如果是static修饰 隐藏了父类的static覆盖方法 不叫覆盖 是隐藏
}
public class _4Super3 {
    public static void main(String[] args) {
        new SubClassx().doWork();
    }

}

package _8继承多态;

/**
 * Created by E430 on 2017/7/20.
 */
class SuperClassz{
    public String name ="supername";

    public void doWork(){
        System.out.println("Super");
    }
}
class SubClassz extends  SuperClassz{
    public String name ="subname";

    public void doWork() {
        System.out.println("sub");
    }
}
public class _12多态中属性的调用 {
    public static void main(String[] args) {
        SubClassz s1 = new SubClassz();
        s1.doWork(); //sub
        
        System.out.println(s1.name);//subname
    }
}

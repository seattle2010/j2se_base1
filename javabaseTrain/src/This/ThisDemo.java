package This;
//this的用法
// 谁调用这个方法,this就表示是谁的对象,this就是当前的对象
class Person2{
    void say(){
        System.out.println("说话");
    }
    void  doWork(){  //p2
       System.out.println("doWork方法");
       this.say();
    }
    }
public class ThisDemo {
   public static void main(String[] args) {
       Person2 p2 = new Person2();
//       System.out.println(p2);
       p2.doWork();

   }
}

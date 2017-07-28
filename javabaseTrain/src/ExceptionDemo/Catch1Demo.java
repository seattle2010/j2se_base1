package ExceptionDemo;

/**
 * Created by shi on 2017/7/27.
 */
//异常
    //五个关键字  try  catch  finally  throw  throws
    //Catch里常用的三个表示错误信息的方法
//            e.getMessage();
//            e.toString();
//            e.printStackTrace();
//        System.out.println("除数不能为0");//自定义输出
//System.out.println(e.getMessage());//错误出处信息
//System.out.println(e.toString());//具体异常信息,错误出处信息
//        e.printStackTrace();//具体异常信息,错误出处信息  具体代码错误处
// 这是给程序员看的

//如果finally有return语句,永远返回finally中的结果
//finally和return谁先执行  finally先执行
//    异常的分类
    //1 编译时期异常 checked受检查的 进行语法检查 如果有异常,则不能通过
    //2 运行时期异常  runtime运行中出现,在运行中才会出现的异常,
//          运行异常在编译时期 可处理也可以不处理
public class Catch1Demo {
public static void main(String[] args) {
System.out.println("stat");
    try {
        String snums1 = "10";
        String snums2 = "2B";

        int num1 = Integer.parseInt(snums1);
        int num2 = Integer.parseInt(snums2);
        int ret = num1/num2;
        System.out.println(ret);
    } catch (ArithmeticException e) {//catch相当于if(e instanceof ArithmeticException )
        System.out.println("除数不能为0");
        e.printStackTrace();
    }catch (NumberFormatException e){
        System.out.println("谁让你输入2B ma我的");
        
        e.printStackTrace();
    }catch (Exception e){
        System.out.println("你牛,我都没找出这个漏洞");
    }finally {//不管有没有异常 finally里的语句必须会执行
                //通常用来执行关闭资源的代码
       System.out.println("finally里的语句");

    }
 System.out.println("end");
}
}

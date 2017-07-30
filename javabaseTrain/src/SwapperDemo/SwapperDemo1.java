package SwapperDemo;

/**
 * Created by shi on 2017/7/24.
 */
//包装类
class IntSwapper {
    private int value;

    public IntSwapper(int value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "IntSwapper{" +
                "value=" + value +
                '}';
    }
}

public class SwapperDemo1 {
    
    public static void main(String[] args) {
        IntSwapper intSwapper = new IntSwapper(17);
        System.out.println(intSwapper.toString());
        
        //基本数据类型       //包装类
        //byte              Byte
        // short            Short
        //int               Integer     //
        //long              Long
        //float              Float
        //double            Double
        // char              Character   //
        //boolean           Boolean

//如何定义一个包装类   装箱操作
        // 方法1
        Integer num1 = new Integer(17); //基本数据类型 --> 包装类
        Integer num3 = new Integer("123"); //基本数据类型 --> 包装类
        //方法2
        Integer num2 = Integer.valueOf(17);//基本数据类型 --> 包装类

        System.out.println(num1.MAX_VALUE);

//     拆箱   包装类  --->   基本数据类型
        int i = num1.intValue();
        System.out.println(i);

        Boolean aBoolean = new Boolean("fdfd");
        System.out.println(aBoolean);//false

        //java 1.5开始 引入了 自动装箱和 自动拆箱
        //自动装箱
        Integer num4 = 17;   //Integer num2 = Integer.valueOf(17);
        //自动拆箱
        int num5 = num4;
        
        Object obj = 17;
                //        Integer i = 17;
                //        Object obj = i;
        Object[] obj2 = {"abc",true,12,'a'};//可以容纳一切类型
        
        //基本操作
        System.out.println(num4.MAX_VALUE);
        System.out.println(num4.MIN_VALUE);
        System.out.println(num4.SIZE);//32
        System.out.println(num4.TYPE);//int

//        String和int/Integer之间的转换操作:转换方法必须在String类中或Integer类中.
//  把String转换为包装类类型:
// 方式2: static Xxx  valueOf(String str)  :把String转换为包装类的对象
        double d1=Double.valueOf("123.00");
        System.out.println(d1);
//        方式1: new  Xxx(String str):
        Boolean aBoolean1 = new Boolean("true");
//        把包装类对象转换为String.
//        String  str =  任何对象.toString();
        String str = Integer.toString(123);
//        把基本数据类型转换为String:
         String str1 = "17"+ ""+"18"+"19";//17+18+19+""
         String s = str1.valueOf(17);
        System.out.println(str1);
//        把String转换为基本数据类型:
//        static xxx parseXxx(String s)      :xxx表示8大基本数据类型
        int aa = Integer.parseInt("123");





    }
}

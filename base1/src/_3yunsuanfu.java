/**
 * Created by tn on 2017/6/20.
 */
public class _3yunsuanfu {
    public static void main(String[] args) {
        /*

        加 +
        减 -
        乘 *
        除 /
        取余数 %
         */
        int a = 2;
        int c = 5;
        System.out.println(c%a);

        int x = 12345;
        int g,s,b,q,w;
        System.out.println(x%10);
        System.out.println(x/10%10);
        System.out.println(x/100%10);
        System.out.println(x/1000%10);
        System.out.println(x/10000%10);
/*
赋值运算符
=
+=
-+
*=
/=
%=
 */
int b2 = 1;
int a1 = 2;
a1+=b2;
System.out.println(a1);

/*
比较运算符
==
!=
>
<
>=
<=
 */
System.out.println(4>3);

/*
逻辑运算符
&&
||
!
|
&
 */
System.out.println(true&&false);
System.out.println(!true);

/*
自增自减运算符
++
--
 */
int i = 1;
int j = ++i;
int k = i++;
System.out.println(j);
System.out.println(k);
/*
三目运算符

 */
System.out.println(3>2?"正确":"错误");
a = 3;
b = 4;
System.out.println(a==b?"相当":"不等"); 

System.out.println((3>2&&4>2)?100:200);

//用三目求两个值中的最大值
       int x3 = 10;
       int y = 20;
      System.out.println(x3>y?x3:y);

      //求三个数中的最大值
      ;
      int a3 = 10;
      int b3 = 20;
      int c3 = 30;
System.out.println("*****"); 
      System.out.println((a3>b3?a3:b3)>c3?(a3>b3?a3:b3):c3);
    }

}

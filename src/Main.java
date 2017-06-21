public class Main {

    public static void main(String[] args) {
        
        System.out.println("Hello World!");
        System.out.println("hello"); 
        System.out.println(); 
        System.out.println("hello");

        //while 和 dowhile 的区别
        boolean boo = false;
        while(boo){

            System.out.println(boo);//词句不执行
        }

        do {
            System.out.println("hello do while");//执行了一次

        } while ( boo);



    }
}

package duotai;
class Person{
    public String name;
    public int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public static void main(String[] args) {
        //object
//        Object o1 = new Object();
//        Object o2 = new Object();
//        System.out.println(o1.equals(o2));//false
//        System.out.println(o1 == o2);//false
//
//        String str1 = new String("abc");
//        String str2 = new String("abc");
//        System.out.println(str1.equals(str2));//true
//        System.out.println(str1 == str2);//false
        Person p1 = new Person("will",17);
        System.out.println(p1);
        System.out.println(p1.name);
        System.out.println(p1.age);
        
        
        
        


    }
}

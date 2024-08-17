package OOP.lecture2;

public class Main2 {
    int age=15;
    String name;
    static int count=5;

    //we cant do this ,canot acces an no static from static
//    static void  display(){
//        System.out.println(this.age);
//    }
    static void aVoid(){
        Main2 m3=new Main2();
        System.out.println(m3.age);
    }

}

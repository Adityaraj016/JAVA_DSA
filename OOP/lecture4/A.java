package OOP.lecture4;
 abstract class A {
     public void Display(){
         System.out.println("Hi");
     }
     abstract void call();
}
class B extends A{
    @Override
    void call() {
        System.out.println("I am aditya");
    }

    @Override
    public void Display() {
        System.out.println("Hi aditya");
    }
}
class Main{
    public static void main(String[] args) {
        B b=new B();
        b.Display();
    }
}

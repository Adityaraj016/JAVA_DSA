package OOP.interfaces;

public interface Brake {
    void brake();
    default void st(){
        System.out.println("Hi ");
    }
}

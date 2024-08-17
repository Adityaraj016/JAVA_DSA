package OOP.interfaces;

public interface Engine {
    void start();
    void stop();
    void acc();

    default void st(){
        System.out.println("Hi Aditya");
    }
}

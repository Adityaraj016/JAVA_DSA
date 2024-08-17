package OOP.interfaces;

public interface Media {
    int a=700;
    void start();
    void stop();
    default void st(){
        System.out.println("Hi re");
    }
}

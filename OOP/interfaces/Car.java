package OOP.interfaces;

public class Car implements Brake,Engine,Media{

    @Override
    public void brake() {
        System.out.println("Applying Brake");
    }

    @Override
    public void start() {
        System.out.println("I am starting");
    }

    @Override
    public void stop() {
        System.out.println("Stopping");
    }

    @Override
    public void acc() {
        System.out.println("Speeding up");
    }

    @Override
    public void st() {
        System.out.println("Hi");
    }
}

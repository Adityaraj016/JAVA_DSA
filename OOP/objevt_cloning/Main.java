package OOP.objevt_cloning;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        Human kunal =new Human(34,"kunal");
//        Human twin=new Human(kunal);

        Human twin=(Human) kunal.clone();
        System.out.println(twin.age);
        System.out.println(twin.name);
    }
}

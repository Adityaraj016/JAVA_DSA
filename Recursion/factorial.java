package Recursion;

public class factorial {
    public static void main(String[] args) {
        System.out.println(factorial1(5));
    }
    static int factorial1(int n){
        if(n<=1){
            return 1;
        }

        return n*factorial1(n-1);
    }
}

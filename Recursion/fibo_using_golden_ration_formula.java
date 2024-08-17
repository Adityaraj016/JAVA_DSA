package Recursion;

public class fibo_using_golden_ration_formula {
    public static void main(String[] args) {
        System.out.println(fibo(6));
    }
    static int fibo(int n){
        //return (int) ((Math.pow((1+Math.sqrt(5))/2,n) - Math.pow((1-Math.sqrt(5))/2,n))/Math.sqrt(5));
        return (int) (Math.pow((1+Math.sqrt(5))/2,n)/Math.sqrt(5));
        //Golden ratio formula
    }
}

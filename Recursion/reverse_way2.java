package Recursion;
//way2
public class reverse_way2 {
    public static void main(String[] args) {
        System.out.println(reverse(1341));
    }
    static int reverse(int n){
        int digits=(int)(Math.log10(n)) + 1;  //kitna digit hai found kiye
        return helper(n,digits);
    }
    static int helper(int n,int digits){
        if(n%10==n){
            return n;
        }
        int rem=n%10;
        return rem*(int)Math.pow(10,digits-1)  + helper(n/10,digits-1);
    }
}

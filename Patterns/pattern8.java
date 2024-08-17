package Patterns;

public class pattern8 {
    public static void main(String[] args) {
        pattern(5);
    }
    static void pattern(int n){
        int count=1;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=count;j++){
                System.out.print("*");
            }
            count=count+2;
            System.out.println();
        }
    }
}

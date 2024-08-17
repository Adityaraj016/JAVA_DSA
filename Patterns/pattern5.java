package Patterns;

public class pattern5 {
    public static void main(String[] args) {
        pattern(10);
    }
    static void pattern(int n){
        int col;
        for(int i=1;i<2*n;i++){
            if(i<=n){
                col=i;
            }
            else{
                col=2*n-i;    //or n-(i%n);
            }
            for(int j=1;j<=col;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}

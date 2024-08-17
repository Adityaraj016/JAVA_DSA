package Patterns;

public class pattern28 {
    public static void main(String[] args) {
        pattern(5);
    }
    static void pattern(int n){
        int col1;
        for(int i=1;i<2*n;i++){
            if(i<=n){
                col1=i;
            }
            else{
                //or n-(i%n);
                col1=2*n-i;
            }
            for(int j=1;j<=n-col1;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=col1;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}


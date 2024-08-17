package Patterns;

public class pattern17 {
    public static void main(String[] args) {
        pattern(5);
    }
    static void pattern(int n){
        int i;
        for(int row=1;row<2*n;row++){
            if(row<=n){
                i=row;
            }
            else{
                i=2*n-row;
            }
            for(int col=1;col<=n-i;col++){
                System.out.print(" ");
            }
            for(int col=i;col>=1;col--){
                System.out.print(col);
            }
            for(int col=2;col<=i;col++){
                System.out.print(col);
            }
            System.out.println();
        }
    }
}

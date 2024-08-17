package Patterns;

public class pattern30 {
    public static void main(String[] args) {
        pattern(5);
    }
    static void pattern(int n){
        int count=1;
        for(int row=1;row<=n;row++){
            for(int col=1;col<=n-row;col++){
                System.out.print("  ");
            }
            for(int col=row;col>=1;col--){
                System.out.print(col+" ");
            }
            for(int col=2;col<=row;col++){
                System.out.print(col+" ");
            }
            System.out.println();
        }
    }
}

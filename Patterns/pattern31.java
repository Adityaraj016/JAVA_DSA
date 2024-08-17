package Patterns;

public class pattern31 {
    public static void main(String[] args) {
        pattern(4);
    }
    static void pattern(int n){
        n=n*2;
        for(int row=0;row<=n;row++){
            for(int col=0;col<=n;col++){
                //we have to figure out the values
                int ateveryindex=Math.min(Math.min(row,col),Math.min(n-row,n-col));
                System.out.print(ateveryindex+" ");
            }
            System.out.println();
        }
    }
}

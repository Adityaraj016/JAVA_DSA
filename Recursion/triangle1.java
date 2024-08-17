package Recursion;

public class triangle1 {
    public static void main(String[] args) {
//        print(5,0);
        print1(4,0);
    }
    //time n^2 ,space n
    public static void print(int row,int column){
        if(row==1){
            return;
        }
        if(row==column){
            System.out.println();
            row--;
            column=0;
        }
        System.out.print("*");
        print(row,column+1);
    }

    public static void print1(int row,int column){
        if(row==0){
            return;
        }
        if(row>column){
            System.out.print("*");
            print(row,column+1);
        }
        else{
            System.out.println();
            print(row-1,0);
        }

    }
}

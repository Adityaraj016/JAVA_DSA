package Recursion;

class Basic_first_program {
    public static void main(String[] args) {
        int n=5;
        Display(n);
    }
    static void Display(int n){
        if(n==0){   //base condition,to stop the execution at a point
            return;
        }
//        System.out.print(n+" ");
        //this is tailed recursion
        //this is the last function call
        Display(n-1);
        System.out.println(n);
//        System.out.println("Adiya");
    }
}
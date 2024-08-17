package Recursion;

public class sorted_array {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        System.out.println(checksorted(arr,0));
    }
    static boolean checksorted(int[] arr,int n){
        if(n==arr.length-1){
            return true;
        }
        return arr[n]<arr[n+1] && checksorted(arr,n+1);

        //jaise hi ek false mila aage check hi nahi karega
    }

}

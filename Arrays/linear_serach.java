package Arrays;

import java.util.Scanner;

public class linear_serach {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of elements in array");
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter elements");
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter the element you want to search in array");
        int m=sc.nextInt();
        int index=search(arr,m);
        if(index==-1){
            System.out.println("Element not found");
        }
        else{
            System.out.println("Element present at index:"+index);
        }
    }
    static int search(int[] arr,int m){
        if(arr.length==0){
            return -1;
        }
        for(int in = 0; in <arr.length; in++){
            if(arr[in]==m){
                return in;
            }
        }
        return -1;
    }
}

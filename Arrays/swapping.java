package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class swapping {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] arr={1,2,3,4,5};
        System.out.println("enter index to swap with each other");
        int i=sc.nextInt();
        int j=sc.nextInt();
        System.out.println("Before swapping:"+Arrays.toString(arr));
        swap(arr,i,j);
        System.out.println("After swapping:"+Arrays.toString(arr));
    }
    static void swap(int[] arr,int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
}

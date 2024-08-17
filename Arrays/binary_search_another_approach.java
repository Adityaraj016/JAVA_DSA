package Arrays;

import java.util.Scanner;

//valid for both ascending and descending sorted
public class binary_search_another_approach {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of elements in array");
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter sorted array elements");
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter the element you want to search in array");
        int m=sc.nextInt();
        int index=search(arr,m);
        System.out.println("Index at which element is present is:"+index);
    }
    static int search(int[] arr,int target){
        int start=0,mid;
        int end=arr.length-1;
        boolean check=arr[start]<arr[end];
        while(start<=end){
            mid=start+(end-start)/2;
            if(arr[mid]==target){
                return mid;
            }
            if(check){
                if(arr[mid]<target){
                    start=mid +1;
                }
                else{
                    end=mid-1;
                }
            }
            else{
                if(arr[mid]<target){
                    end=mid-1;
                }
                else{
                    start=mid +1;
                }
            }

        }
        return -1;
    }
}

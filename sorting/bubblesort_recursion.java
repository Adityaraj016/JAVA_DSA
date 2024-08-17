package sorting;

import java.util.Arrays;

public class bubblesort_recursion {
    public static void main(String[] args) {
        int[] arr={65,34,867589,231456,123456789,6574,3456};
        sort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
    public static void sort(int[] arr,int start,int end){
        if(end==0){
            System.out.println(Arrays.toString(arr));
            return;
        }
        if(start<end){
            if(arr[start]>arr[start+1]){
                int temp=arr[start];
                arr[start]=arr[start+1];
                arr[start+1]=temp;
            }
            sort(arr,start+1,end);
        }
        else{
            sort(arr,0,end-1);
        }
    }
}

package sorting;

import java.util.Arrays;

public class insertion_sort_recusrion {
    public static void main(String[] args) {
        int[] arr={65,34,867589,231456,123456789,6574,3456};
        sort(arr,1,1,arr.length-1);
    }
    //we can use helper function in interviews,no worry
    public static void sort(int[] arr,int start,int os,int end){  //os-original start
        if(start == arr.length){
            System.out.println(Arrays.toString(arr));
            return;
        }
        if(os==0){
            os=start+1;
        }
        if(start<=end){
            if(arr[os]<arr[os-1]){
                int temp=arr[os];
                arr[os]=arr[os-1];
                arr[os-1]=temp;
                sort(arr,start,os-1,end);
            }
            else{
                sort(arr,start+1,start+1,end);
            }
        }
    }
}

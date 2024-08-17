package sorting;

import java.util.Arrays;

public class selection_sort_recursion {
    public static void main(String[] args) {
        int[] arr={65,34,867589,231456,123456789,6574,3456};
        sort(arr);
    }
    public static void sort(int[] arr){
        helper(arr,0,arr.length-1,0);
        System.out.println(Arrays.toString(arr));
    }
    static void helper(int[] arr,int start,int end,int max){
        if(end==0){
            return;
        }
        //Finding max
        if(start<=end){
            if(arr[start]>arr[max]){
                helper(arr,start+1,end,start);
            }
            else{
                helper(arr,start+1,end,max);
            }
        }
        else{
            int temp=arr[max];
            arr[max]=arr[end];
            arr[end]=temp;
            helper(arr,0,end-1,0);
        }
    }
}
//static void helper(int[] arr,int start,int end){
//    if(end==0){
//        return;
//    }
//    int maxindex=0;
//    for(int i=start;i<=end;i++){
//        if(arr[i]>arr[maxindex]){
//            maxindex=i;
//        }
//    }
//    int temp=arr[maxindex];
//    arr[maxindex]=arr[end];
//    arr[end]=temp;
//
//    helper(arr,start,end-1);
//}

package Recursion;
import java.util.Arrays;
class Solution {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 6, 7};
        rotate(nums, 3);
    }

//    this is order of n^2 time limit will exceed in leet code
//    public static void rotate(int[] nums, int k) {
//        if(nums.length==1 || k==0){
//            System.out.println(Arrays.toString(nums));
//            return;
//        }
//        int n=k;
//        while(n>0){
//            int j=nums[nums.length-1];
//            for(int i=nums.length-1;i>=1;i--){
//                nums[i]=nums[i-1];
//
//            }
//            nums[0]=j;
//            n--;
//        }
//        System.out.println(Arrays.toString(nums));
//    }

    //will try to do in o(n)
//    public static void rotate(int[] nums, int k) {
//        if(nums.length==1 || k==0){
//            System.out.println(Arrays.toString(nums));
//            return;
//        }
//        int[] arr=new int[nums.length];
//        int j=0;
//        for(int i=nums.length-k;i<nums.length;i++){
//            arr[j]=nums[i];
//            j++;
//        }
//        System.out.println(j);
//        int m=0;
//        for(int i=j;i<arr.length;i++){
//            arr[i]=nums[m];
//            m++;
//        }
//        for(int i=0;i<nums.length;i++){
//            nums[i]=arr[i];
//        }
//        System.out.println(Arrays.toString(nums));
//    }

    //time-O(n) ans space-o(1)
    public static void rotate(int[] nums, int k) {
        if(nums.length==1 || k==0){
            System.out.println(Arrays.toString(nums));
            return;
        }
        //when k>nums.length then this will work
        k=(k % nums.length);
        reverse(nums,0,nums.length-1);
        reverse(nums,0,k-1);
        reverse(nums,k,nums.length-1);
        System.out.println(Arrays.toString(nums));
    }
    static void reverse(int[] nums,int start,int end){
        while(start<end){
            int temp=nums[start];
            nums[start]=nums[end];
            nums[end]=temp;
            start++;
            end--;
        }
    }

}
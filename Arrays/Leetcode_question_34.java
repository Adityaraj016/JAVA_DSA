package Arrays;

import java.util.Arrays;
import java.util.Arrays;
class Leetcode_question_34 {
    public static void main(String[] args) {
        int[] arr={5,7,7,8,8,10};
        int []a=searchRange(arr,8);
        System.out.println(Arrays.toString(a));
    }
    public static int[] searchRange(int[] nums, int target) {
        int[] a={-1,-1};

        a[0]=search(nums,target,true);
        if(a[0]!=-1){
            a[1]=search(nums,target,false);
        }
        return a;
    }
    public static int search(int[] nums,int target,boolean need){
        int start=0,mid;
        int end=nums.length-1;
        int ans=-1;
        while(start<=end){
            mid=start+(end-start)/2;
            if(nums[mid]==target){
                ans=mid;
                if(need){
                    end=mid-1;
                }
                else{
                    start=mid+1;
                }
            }
            else if(nums[mid]<target){
                start=mid +1;
            }
            else{
                end=mid-1;
            }
        }
        return ans;
    }
}

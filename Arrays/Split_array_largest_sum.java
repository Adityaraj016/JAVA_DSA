package Arrays;
//https://leetcode.com/problems/split-array-largest-sum/
/*Algorithm:
1.find the largest possible sum of array
2.Find the maximum element is the array
3.start=maximum element,end=maximum sum of array
4.mid=(start+end)/2
*/
public class Split_array_largest_sum {
    public static void main(String[] args) {
        int[] arr={7,2,5,10,8};
        System.out.println(splitArray(arr,2));
    }
    public static int splitArray(int[] nums, int k) {
        int max=0,sum=0;
        for(int i=0;i<nums.length;i++) {
            sum = sum + nums[i];   //finding sum and maximum element
            if (nums[i] > max) {
                max = nums[i];
            }
        }
        int start=max,end=sum;   //for binary search
        while(start<end){
            int mid=start+(end-start)/2;
            int pieces=1,result=0;   //pieces for no of subarray,initially=1
            for(int num:nums){
                if(result+num>mid){
                    //make new subarray
                    result=num;  //this is important,take example 7,2,5,10,8
                    pieces++;
                }
                else{
                     result=result+num;
                }
            }
            if(pieces>k){
                start=mid+1;  //Then sum must be larger,we took a little less sum
            }
            else{
                end=mid;
            }
        }
        return end;  //start==end here
    }


}

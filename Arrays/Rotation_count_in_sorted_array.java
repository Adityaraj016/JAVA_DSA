package Arrays;
//cponsider an array of distinct sorted in increasiong order,
//The array has been rotated(clockwise) k
// number of times.Given such an array,find the value of k
public class Rotation_count_in_sorted_array {
    public static void main(String[] args) {
        int[] arr={7,9,11,12,5};
        System.out.println(search(arr));

    }
    public static int search(int[] nums) {
        int pivot=peakIndexInArray(nums);    //this is pivot
         return pivot+1; //means array is in sorted ascending,no ratotaion
        //ifno pivot,and peak index returns -1 and -1+1=0,so no rotation
    }
    public static int peakIndexInArray(int[] nums) {
        //finding pivot
        //Pivot is a point from where array is rotated
        int start=0,end=nums.length-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(mid<end && nums[mid]>nums[mid+1]){
                return mid;
            }
            else if(mid>start && nums[mid]<nums[mid-1]){
                return mid-1;
            }
            else if(nums[start]>=nums[mid]){
                end=mid-1;
            }
            else{
                start=mid+1;
            }
        }
        return -1;
    }
}

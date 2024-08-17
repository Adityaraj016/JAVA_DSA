package Recursion;

public class rotated_binary_search {
    public static void main(String[] args) {
        int[] nums={4,5,6,7,0,1,2};
        int target=7;
        System.out.println(search(nums,target,0,nums.length-1));
    }
    public static int search(int[] nums, int target,int start,int end) {
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (nums[mid] == target) {
                return mid;
            }
            if (nums[start] <= nums[mid]) {
                if (nums[start] <= target && nums[mid] >= target) {
                    return search(nums,target,start,mid-1);
                } else {
                    return search(nums,target,mid+1,end);
                }
            }
            else if (nums[mid] <= target && nums[end] >= target) {
                return search(nums,target,mid+1,end);
            } else {
                return search(nums,target,start,mid-1);
            }
        }
        return -1;
    }
}

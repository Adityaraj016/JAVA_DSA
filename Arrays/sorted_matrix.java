package Arrays;
//search  sorted
//binary search in 2D array
//same code runs for both row wise sorted and col wise sorted and normal sorted
import java.util.Arrays;
public class sorted_matrix {
    public static void main(String[] args) {
        int[][] nums={
                {1,2,3,4},
                {5,6,7,8},
                {9,10,11,12},
                {14,15,16,15}
        };
        int[] num=search(nums,13);
        System.out.println(Arrays.toString(num));
    }
    static int[] search(int[][] nums,int target){
        if(nums.length==0){
            return new int[]{-1,-1};
        }
        int start=0,end=nums[0].length-1;   //n*m matrix bhi ho jayeega isse
        while(start<nums.length && end>=0){
            if(nums[start][end]==target){
                return new int[]{start,end};
            }
            else if(nums[start][end]>target){
                end--;
            }
            else{
                start++;
            }
        }
        return new int[]{-1,-1};
    }
}


package Arrays;
//search in row wise and col wise sorted
//binary search in 2D array
import java.util.Arrays;
public class matrix_search_rowwise_colwise_sorted {
    public static void main(String[] args) {
        int[][] nums={
                {10,20,30,40,55},
                {15,25,37,49,60},
                {25,29,37,49,65},
                {33,34,38,50,70}
        };
        int[] num=search(nums,15);
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

package Arrays;

import java.util.Scanner;
import java.util.Arrays;

public class Tw0D_array_search_second_approach {
    public static void main(String[] args) {
        int[][] arr={
                {1,2,3},{4,5},{6,7,8,9,10}
        };
        System.out.println("Enter the element you want to search");
        Scanner sc=new Scanner(System.in);
        int target=sc.nextInt();
        int[] value=search(arr,target);
        if(value[0]==-1){
            System.out.println("Element not present");
        }
        else{
            System.out.println("Elememt present at index:"+Arrays.toString(value));
        }
    }
    static int[] search(int[][] arr,int target){   //array return kara rahe ehich contains row
        //and column only
        if(arr.length==0){
            return new int[]{-1,-1};
        }
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                if(arr[i][j]==target){
                    return new int[]{i,j};
                }
            }
        }
        return new int[]{-1,-1};
    }
}

package Arrays;

import java.util.Scanner;

public class twoD_array_search {
    public static void main(String[] args) {
        int[][] arr={
                {1,2,3},{4,5},{6,7,8,9,10}
        };
        System.out.println("Enter the element you want to search");
        Scanner sc=new Scanner(System.in);
        int target=sc.nextInt();
        int value=search(arr,target);
        if(value==1){
            System.out.println("Element found");
        }
        else{
            System.out.println("Element not found");
        }

    }
    static int search(int[][] arr,int target){
        if(arr.length==0){
            return -1;
        }
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                if(arr[i][j]==target){
                    return 1;
                }
            }
        }
        return -1;
    }
}

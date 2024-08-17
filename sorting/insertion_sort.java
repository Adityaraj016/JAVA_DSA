package sorting;

import java.util.Arrays;

public class insertion_sort {
    public static void main(String[] args) {
        int[] arr={-60,-100};
        insertion(arr);
    }
    static void insertion(int[] arr){
        for(int i=0;i<arr.length-1;i++){
            //if length=5,i <=3
            //since if i==4,j=5,arr[j],index out of bound
            for(int j=i+1;j>0;j--){   //as j==0 the arr[j-1],exception
                if(arr[j]<arr[j-1]){
                    int temp=arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;
                }
                else{
                    break;  //isse inly inner for loop break hooga
                }
            }
        }
        System.out.println(Arrays.toString(arr));

    }
}

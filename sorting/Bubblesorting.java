package sorting;
import java.util.Arrays;
//The time complexity of bubble sort is O(n^2) in the worst and
// average case, and O(n) in the best case when the array is already sorted.
// This is because in the worst and average case, the algorithm has to iterate
// through the array n times, and in each iteration,
// it has to compare and swap elements.
public class Bubblesorting {
    public static void main(String[] args) {
        int[] arr={5,4,3,2,1};
        bubblesort(arr);
    }
    static void bubblesort(int[] arr){
        //run the steps n-1 times
        boolean swap;
        for(int i=0;i<arr.length;i++){
            swap=false;
            //in each step,largest element willl be at last respective index
            for(int j=1;j<arr.length-i;j++){
                //swap if item is smaller than previous one
                if(arr[j]<arr[j-1]){
                    //swap
                    int temp=arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;
                    swap=true;
                }
            }
            //if no swap then array is already soretd,no need to check further
            if(!swap){
                break;  //this will make time complexity O(n) for sorted arrays
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}

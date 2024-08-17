package sorting;
//This is my own code
import java.util.Arrays;
public class Selection {
    public static void main(String[] args) {
        int[] arr={-78,-100,0,70,5};
        selection(arr);
    }
    static void selection(int []arr){
        int maxindex;
        for(int i=0;i<arr.length;i++){
            //finding index at which the largest element is present
            maxindex=0;
            for(int j=0;j<arr.length-i;j++){
                if(arr[j]>arr[maxindex]){
                    maxindex=j;
                }
            }
            //After this for loop index is found
            //swapping
            int temp=arr[maxindex];  //we will send the element at maxindex to lastindex
            arr[maxindex]=arr[arr.length-i-1];   //elemnet at last index send to maxindex
            arr[arr.length-i-1]=temp;  //done
        }
        System.out.println(Arrays.toString(arr));
    }
}

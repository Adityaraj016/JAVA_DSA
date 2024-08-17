package Arrays;
import java.util.Arrays;
//reverse using two pointer
public class two_pointer_reverse {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6};
        int start=0;
        int end=arr.length-1;
        while(start<end){
            swap(arr,start,end);
            start++;
            end--;
        }
        System.out.println(Arrays.toString(arr));
    }
    static void swap(int[] arr,int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
}

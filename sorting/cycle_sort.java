package sorting;
import java.util.Arrays;
//Range should be 1 to N
public class cycle_sort {
    public static void main(String[] args) {
        int[] arr={1,6,5,3,2,4};   //array should be countionous
        cycle(arr);
        Arrays.sort(arr);
            }
    static void cycle(int[] arr){
        int i=0;
        while(i<arr.length){
            int correct=arr[i]-1;
            if(arr[i]!=arr[correct]){
                int temp=arr[i];
                arr[i]=arr[correct];
                arr[correct]=temp;
            }
            else{
                i++;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}

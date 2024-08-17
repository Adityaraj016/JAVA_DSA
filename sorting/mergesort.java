package sorting;
import java.util.Arrays;
public class mergesort {
    public static void main(String[] args) {
        int[] arr={8,3,4,12,5,6};
        arr=mergesort(arr);  //updating arr,as the original one is not modified
        //as it is always creating new objects as left right
        System.out.println(Arrays.toString(arr));
    }
    static int[] mergesort(int[] arr){
        if(arr.length==1){
            return arr;
        }
        int mid=arr.length/2;
        int[] left=mergesort(Arrays.copyOfRange(arr,0,mid));
        int[] right=mergesort(Arrays.copyOfRange(arr,mid,arr.length));  //outer rangle is exclusive

        return merge(left,right);
    }
    static int[] merge(int[] first,int[] second){
        int i=0,j=0,k=0;
        int[] mix=new int[first.length + second.length];
        while(i<first.length && j<second.length){
            if(first[i] < second[j]){
                mix[k]=first[i];
                i++;
            }
            else{
                mix[k]=second[j];
                j++;
            }
            k++;
        }
        //in case some elements remaining of an array
        while(i<first.length){
            mix[k]=first[i];
            i++;
            k++;
        }
        while(j<second.length){
            mix[k]=second[j];
            j++;
            k++;
        }


        return mix;
    }
}

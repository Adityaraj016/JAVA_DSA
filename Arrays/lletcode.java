package Arrays;
//https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/description/
//facebook interview question
import java.util.Arrays;
public class lletcode {
    public static void main(String[] args) {
        int[] arr={};
        int []a=array(arr,0);
        System.out.println(Arrays.toString(a));
    }
    static int[] array(int[] arr,int target){
        int []a=new int[2];
        int k=0,l=0;
        if(arr.length==0){
            a[0]=-1;
            a[1]=-1;
            return a;
        }
        for(int i=0;i<arr.length;i++){
            if(arr[i]==target){
                k=i;
                break;
            }
            k=arr.length+2;
        }
        for(int i=arr.length-1;i>=0;i--){
            if(arr[i]==target){
                l=i;
                break;
            }
            l=arr.length+2;
        }
        if(k==arr.length+2){
            a[0]=-1;
            a[1]=-1;
        }
        else{
            a[0]=k;
            a[1]=l;
        }
        return a;
    }
}

package Arrays;

public class ceiling_of_a_number_binary_approach {
    public static void main(String[] args) {
        int [] arr={2,4,6,7,8,10,12,15,19};
        int target=20;
        int ans=ceiling(arr,target);
        if(ans>arr.length-1){     //if target is larger than the graetest number
            System.out.println("Not present");
        }
        else{
            System.out.println(arr[ans]);
        }

    }
    static int ceiling(int[] arr,int target){
        int start=0,mid;
        int end=arr.length-1;
        while(start<=end){
            mid=start+(end-start)/2;
            if(arr[mid]==target){
                return mid;
            }
            else if(arr[mid]<target){
                start=mid +1;
            }
            else{
                end=mid-1;
            }
        }
        return start;
    }
}

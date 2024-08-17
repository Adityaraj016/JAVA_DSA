package Arrays;

public class floor_of_a_number {
    public static void main(String[] args) {
        int [] arr={2,4,6,7,8,10,12,15,19};
        int target=1;
        int ans=floor(arr,target);
        if(ans<0){     //if target is larger than the graetest number
            System.out.println("Not present");
        }
        else{
            System.out.println(arr[ans]);
        }

    }
    static int floor(int[] arr,int target){
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
        return end;
    }
}

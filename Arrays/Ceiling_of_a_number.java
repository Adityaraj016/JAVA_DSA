package Arrays;
//Ceiling of a number linear approach
public class Ceiling_of_a_number {
    public static void main(String[] args) {
        int [] arr={2,4,6,7,8,10,12,15,19};
        int target=2;
        int ans=ceiling(arr,target);
        System.out.println(ans);
    }
    static int ceiling(int[] arr,int target){
        int max=arr[arr.length-1];
        if(target>max){
            return Integer.MIN_VALUE;
        }
        int i;
        for(i=0;i<arr.length;i++){
            if(arr[i]>=target){
                break;
            }
        }
        int m=i;
        int [] ans=new int[arr.length-i];
        for(int j=0;j<arr.length-m;j++){
            ans[j]=arr[i];
            i++;
        }
        int smallest=ans[0];
        for(int j=0;j<arr.length-m;j++){
            if(ans[j]<smallest){
                smallest=ans[j];
            }

        }
        return smallest;
    }
}

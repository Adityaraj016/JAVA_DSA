package Recursion;

public class linear_search {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        int target=2;
        System.out.println(search(arr,target,0));
    }
    static int search(int[] arr,int target,int index){
        if(index==arr.length){
            return -1;
        }
        if(arr[index]==target){
            return index;
        }
        return search(arr,target,index+1);
    }
}

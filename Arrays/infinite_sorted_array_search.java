package Arrays;
//Find position of an element in a sorted array of infinite numbers
//Time complexity-o(logn),space complexity-O(1)
public class infinite_sorted_array_search {
    public static void main(String[] args) {
        int[] arr={2,4,5,7,8,9,10,34,56,78,90,200,500,900,901,905,1001,5020,5021,5022,5023,5024,5024
        ,5025,5026,5027,5028,5029,5030,5031,5032,5033,5034};

        int ans=search(arr,5032);
        System.out.println(ans);
    }
    static int search(int[] arr,int target){
        int low=0;
        int high=1;
        while (arr[high] < target) {
            low = high+1;
            high = 2 * high;
        }
        if(arr[high]>=target){
            int start=low,mid;
            int end=high;
            while(start<=end) {
                mid = start + (end - start) / 2;
                if (arr[mid] == target) {
                    return mid;
                } else if (arr[mid] < target) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            }
        }
        return -1;
    }
}

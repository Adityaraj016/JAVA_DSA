package Recursion.subset_string_subsequence;

import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

public class subset_iteration_duplicate {
    public static void main(String[] args) {
        int[] arr={1,2,2};
        List<List<Integer>> ans=subset(arr);
//        ans.remove(0);
        System.out.println(ans);
    }
    static List<List<Integer>> subset(int[] arr){
        List<List<Integer>> outer=new ArrayList<>();
        Arrays.sort(arr);
        outer.add(new ArrayList<>()); //this will create a empty list inside outer list
        int start=0;
        int end=0;
        for(int i=0;i<arr.length;i++){
            start=0;
            if(i>0 && arr[i] == arr[i-1] ){
                start=end;
            }
            end=outer.size();
            int n=outer.size();

            for(int j=start;j<n;j++){
                List<Integer> internal=new ArrayList<>(outer.get(j));  //outer.get(i) me add karna hai naya banake
                //means internal ek aisa list hai jisme pehle se kuch elemnets hai,i position wla
                internal.add(arr[i]);
                outer.add(internal);
            }
        }

        return outer;
    }
}

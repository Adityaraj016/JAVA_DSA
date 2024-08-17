package Recursion.subset_string_subsequence;

import java.util.ArrayList;
import java.util.List;

public class subset_of_array {
    public static void main(String[] args) {
        int[] arr={1,2,3};
        List<List<Integer>> ans=subset(arr);
//        ans.remove(0);
        System.out.println(ans);
    }
    static List<List<Integer>> subset(int[] arr){
        List<List<Integer>> outer=new ArrayList<>();
        outer.add(new ArrayList<>()); //so, size=1
        for(int num:arr){
            int n=outer.size();
            for(int i=0;i<n;i++){
                List<Integer> internal=new ArrayList<>(outer.get(i));
                //we will create a list that will already contain some element ,which is at ith position
//                of outer list,and we will add new element from there
                internal.add((num));
                outer.add(internal);
            }
        }
        return outer;
    }
}

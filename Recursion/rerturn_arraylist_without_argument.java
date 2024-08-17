package Recursion;

import java.util.ArrayList;

public class rerturn_arraylist_without_argument {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,4};
        int target=4;
        ArrayList<Integer> list=new ArrayList<>();
        System.out.println(search(arr,target,0));
    }
    static ArrayList<Integer> search(int[] arr, int target, int index){
        ArrayList<Integer> list=new ArrayList<>();
        if(index==arr.length){
            return list;
        }
        if(arr[index]==target){
            list.add(index);
        }
        ArrayList<Integer> ans=search(arr,target,index+1);
        list.addAll(ans);
        return list;
    }
}

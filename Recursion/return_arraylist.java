package Recursion;

import java.util.ArrayList;

public class return_arraylist {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,4};
        int target=4;
//        ArrayList<Integer> list=new ArrayList<>();
//        System.out.println(search(arr,target,0,list));
        ArrayList<Integer> list=search(arr,target,0,new ArrayList<>());
        System.out.println(list);
    }
    static ArrayList<Integer> search(int[] arr, int target, int index, ArrayList<Integer> list){
        if(index==arr.length){
            return list;
        }
        if(arr[index]==target){
            list.add(index);
        }
        return search(arr,target,index+1,list);
    }

}

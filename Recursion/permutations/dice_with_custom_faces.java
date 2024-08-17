package Recursion.permutations;

import java.util.ArrayList;

public class dice_with_custom_faces {
    public static void main(String[] args) {
        System.out.println(dice("",7, 8));
    }
    public static ArrayList<String> dice(String p, int target,int face){
        if(target == 0){
            ArrayList<String> list=new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String> ans=new ArrayList<>();
        for(int i=1;i<= face && i <= target;i++){
            ans.addAll(dice(p+i , target-i , face));
        }
        return ans;
    }
}

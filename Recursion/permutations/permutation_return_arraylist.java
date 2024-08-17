package Recursion.permutations;

import java.util.ArrayList;

public class permutation_return_arraylist {
    public static void main(String[] args) {
        System.out.println(permu("","abc"));
    }
    public static ArrayList<String> permu(String p,String up){
        if(up.isEmpty()){
            ArrayList<String> list=new ArrayList<>();
            list.add(p);
            return list;
        }
        char ch=up.charAt(0);

        ArrayList<String> ans=new ArrayList<>();

        for(int i=0;i<=p.length();i++){
            String first = p.substring(0,i);  //last index is exclusive
            String second = p.substring(i,p.length());

            ArrayList<String> ans1 = permu(first + ch + second , up.substring(1));
            ans.addAll(ans1);
        }
        return ans;  //har recusive call ke baad ans pehle wale recusive call ke pass ja raha hai
    }
}

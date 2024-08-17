package Recursion.subset_string_subsequence;

import java.util.ArrayList;
import java.util.List;

public class subsequence_iteration {
    public static void main(String[] args) {
        String str="abc";
        List<String> ans=subset(str);
//        ans.remove(0);
        System.out.println(ans);
    }
    static List<String> subset(String str){
        List<String> outer=new ArrayList<>();
        outer.add(""); //this will create a empty list inside outer list
        for(int i=0;i<str.length();i++){
            int n=outer.size();
            char ch=str.charAt(i);
            for(int j=0;j<n;j++){
                String s= outer.get(j);
                s=s+ch;
                outer.add(s);
            }
        }

        return outer;
    }
}

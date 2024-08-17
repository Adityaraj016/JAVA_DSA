package Recursion.permutations;
import java.util.ArrayList;
import java.util.List;

public class letter_combination_of_phonenumber_leetcode {
    public static void main(String[] args) {
        System.out.println(letterCombinations("","23"));
    }
    public  static List<String> letterCombinations(String p,String up) {
        if(up.isEmpty()){
            ArrayList<String> list=new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String> ans=new ArrayList<>();
        int digit=up.charAt(0) - '0'; //tgis will convet "2" to int 2
        int start = (digit - 2)*3 ;
        if(digit > 7){
            start = start + 1;
        }
        int end=(start + 3);
        if(digit ==7 || digit ==9){
            end= end + 1;
        }
        for (int i = start; i < end; i++) {
            char ch=(char) ('a' + i);
            ans.addAll(letterCombinations(p+ch , up.substring(1)));
        }

        return ans;
    }
}

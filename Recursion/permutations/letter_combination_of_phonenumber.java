package Recursion.permutations;
import java.util.ArrayList;
import java.util.List;
public class letter_combination_of_phonenumber {
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
        for (int i = (digit - 1)*3; i < (digit*3); i++) {
            char ch=(char) ('a' + i);
//            List<String> ans1 = letterCombinations(p+ch, up.substring(1));

            ans.addAll(letterCombinations(p+ch , up.substring(1)));
        }
        return ans;
    }
}

package Recursion.subset_string_subsequence;

import java.util.ArrayList;

public class subsequence_arraylist {
    public static void main(String[] args) {
        String str="abc";
        System.out.println(subseq("",str));
    }
    //p->processed,up->unprocessed
    static ArrayList<String> subseq(String p, String up){
        if(up.isEmpty()){
            ArrayList<String> list=new ArrayList<>();
            list.add(p);
//            if(!p.isEmpty()){
//                list.add(p);
//            }
            return list;
        }
        char ch=up.charAt(0);

        ArrayList<String> left=subseq(p+ch,up.substring(1));
        ArrayList<String> right=subseq(p,up.substring(1));

        left.addAll(right);  //addall se ek arrya list me dusra arralist de sakte hai

        return left; //har recusive call ke baad left pehle wale recusive call ke pass ja raha hai
        //basically return left har function call pe ho raha, and jab wo over ho ja raha tab upar pass ho arah
    }
}

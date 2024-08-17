package Recursion.subset_string_subsequence;

public class subsequence {
    public static void main(String[] args) {
        String str="abc";
        subseq("",str);
    }
    //p->processed,up->unprocessed
    static void subseq(String p,String up){
        if(up.isEmpty()){
            if(!p.isEmpty()){
                System.out.println(p);
            }
            return;
        }
        char ch=up.charAt(0);

        subseq(p+ch,up.substring(1));
        subseq(p,up.substring(1));
    }
}

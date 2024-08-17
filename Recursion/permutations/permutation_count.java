package Recursion.permutations;

public class permutation_count {
    public static void main(String[] args) {
        System.out.println("Count:"+permu("","abcd"));
    }
    public static int permu(String p,String up){
        if(up.isEmpty()){
            return 1;
        }
        char ch=up.charAt(0);
        int count=0;
        for(int i=0;i<=p.length();i++){
            String first = p.substring(0,i);  //last index is exclusive
            String second = p.substring(i,p.length());

            count=count+permu(first + ch + second , up.substring(1));
        }
        return count;
    }
}

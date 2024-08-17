package Recursion.permutations;

public class permutation {
    public static void main(String[] args) {
        permu("","abc");
    }
    public static void permu(String p,String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        char ch=up.charAt(0);
        for(int i=0;i<=p.length();i++){
            String first = p.substring(0,i);  //last index is exclusive
            String second = p.substring(i,p.length());

            permu(first + ch + second , up.substring(1));
        }
    }
}

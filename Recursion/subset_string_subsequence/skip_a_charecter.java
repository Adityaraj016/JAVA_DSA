package Recursion.subset_string_subsequence;

public class skip_a_charecter {
    public static void main(String[] args) {
        String str="bacccada";
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<str.length();i++){
            if(str.charAt(i) != 'a'){
                sb.append(str.charAt(i));
            }
        }
        System.out.println(sb);
    }
}

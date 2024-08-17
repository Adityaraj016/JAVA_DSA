package Recursion.subset_string_subsequence;

public class skip_string {
    public static void main(String[] args) {
        String str="I am apple aditya";
        String sb="";
        for(int i=0;i<str.length();i++){
            if(str.startsWith("apple",i)){
                i=i+4;
            }
            else{
                sb=sb+str.charAt(i);
            }
        }
        System.out.println(sb);
    }
}

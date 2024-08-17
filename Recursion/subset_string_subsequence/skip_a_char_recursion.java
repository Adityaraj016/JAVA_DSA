package Recursion.subset_string_subsequence;

public class skip_a_char_recursion {
    public static void main(String[] args) {
        String str="bacccada";
//        System.out.println(skip(str,"",0));
        System.out.println(skip(str));
    }
    static String skip(String str){
        if(str.isEmpty()){
            return "";
        }
        char ch=str.charAt(0);
        if(ch=='a'){
            return skip(str.substring(1));
        }
        else{
            return ch + skip(str.substring(1));
        }
    }
//    static String skip(String str,String sb,int n){
//        if(n==str.length()){
//            return sb;
//        }
//        if(str.charAt(n) != 'a'){
//            sb=sb+str.charAt(n);
//        }
//         return skip(str,sb,n+1);
//    }
}

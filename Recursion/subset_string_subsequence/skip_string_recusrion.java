package Recursion.subset_string_subsequence;

public class skip_string_recusrion {
    public static void main(String[] args) {
        String str="i am apple adiya";
        System.out.println(skip(str));
    }
    static String skip(String str){
        if(str.isEmpty()){
            return "";
        }
        if(str.startsWith("apple")){
            return skip(str.substring(5));
        }
        else{
            return str.charAt(0) + skip(str.substring(1));
        }
    }
}

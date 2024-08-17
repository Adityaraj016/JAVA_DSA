package Recursion.subset_string_subsequence;
//only skip app,not apple
public class skip_string_2 {
    public static void main(String[] args) {
        String str="i am apple app adiya";
        System.out.println(skipappnotapple(str));
    }
    static String skipappnotapple(String str){
        if(str.isEmpty()){
            return "";
        }
        if(str.startsWith("app") && !str.startsWith("apple")){
            return skipappnotapple(str.substring(3));
        }
        else{
            return str.charAt(0) + skipappnotapple(str.substring(1));
        }
    }
}

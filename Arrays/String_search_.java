package Arrays;

import java.util.Scanner;
import java.util.Arrays;

public class String_search_ {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string");
        String str=sc.nextLine();
//        char[] ch=str.toCharArray();
//        System.out.println(Arrays.toString(str.toCharArray()));
//        System.out.println(Arrays.toString(ch));
        System.out.println("Enter the charecter you want to search");
        char target=sc.nextLine().charAt(0);
        boolean value=search(str,target);
        if(value){
            System.out.println("Charecter present");
        }
        else{
            System.out.println("Charecter not present");
        }

    }

    static boolean search(String str,char target){
        if(str.length()==0){
            return false;
        }
        for(char s:str.toCharArray()){    //yaha string to array me badal rahe
            if(target==s){
                return true;
            }
        }
        return false;
    }

//    static boolean search(String str,char target){
//        if(str.length()==0){
//            return false;
//        }
//        for(int i=0;i<str.length();i++){
//            if(target==str.charAt(i)){
//                return true;
//            }
//        }
//        return false;
//    }

}

package Arrays;

import java.util.Scanner;

public class String_search {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of elements in array");
        int n=sc.nextInt();
        String[] str=new String[n];
        System.out.println(str.length);
        System.out.println("Enter elements");
        for(int i=0;i<str.length;i++){
            str[i]=sc.next();
        }
        System.out.println("Enter the String you want to search in array");
        String m=sc.next();
        int index=search(str,m);
        if(index==-1){
            System.out.println("String not found");
        }
        else{
            System.out.println("String present at index:"+index);
        }
    }
    static int search(String[] arr,String m){
        if(arr.length==0){
            return -1;
        }
        for(int in = 0; in <arr.length; in++){
            if(arr[in].equals(m)){
                return in;
            }
        }
        return -1;
    }
}

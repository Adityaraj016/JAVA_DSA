package maths_for_dsa;
//Given an array of integers in which each number
// appears twice and only on eappear one,return that unique number
public class Findunique {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,1,2,3,4};
        System.out.println(ans(arr));
    }
    static int ans(int[] arr){
        int unique=0;

        //Dry run and you will find the logic
        for(int n:arr){
            unique ^=n;   //unique=unique^n;
        }
        return unique;
    }
}

package maths_for_dsa;

public class power_of_2 {
    public static void main(String[] args) {
        int n=7;   //fix for n=0;
        boolean ans = (n &(n-1))==0;
        System.out.println(ans);
        //System.out.println(Math.pow(3,6));
    }
}

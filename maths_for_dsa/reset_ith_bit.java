package maths_for_dsa;

public class reset_ith_bit {
    public static void main(String[] args) {
        int number=7;
        int i=1;
        System.out.println(ans(number,i));
    }
    static int ans(int number,int i){
        return (number ^ (1 << (i-1)));
    }
}

package maths_for_dsa;
//Find the ith bit of a number
public class get_ith_bith {
    public static void main(String[] args) {
        int number=6;
        int i=1;
        System.out.println(ans(number,i));
    }
    static int ans(int number,int i){
        return ((number & (1 << i-1)) >> (i-1));
    }
}

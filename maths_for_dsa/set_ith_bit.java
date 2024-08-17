package maths_for_dsa;
//if it is zero,set it to 1,if it is 1 it remains 1
public class set_ith_bit {
    public static void main(String[] args) {
        int number=6;
        int i=1;
        System.out.println(ans(number,i));
    }
    static int ans(int number,int i){
        return (number | (1 << (i-1)));
    }
}

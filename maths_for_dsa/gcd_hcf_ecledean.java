package maths_for_dsa;

public class gcd_hcf_ecledean {
    public static void main(String[] args) {
        System.out.println(gcd(105,224));
    }
    static int gcd(int a,int b){
        if(a==0){
            return b;
        }
        return gcd(b%a,a);
    }
}

package maths_for_dsa;

public class evenorodd {
    public static void main(String[] args) {
        int n=500002;
        System.out.println(isodd(n));
    }
    static boolean isodd(int n){
        return (n & 1)==1;
    }
}

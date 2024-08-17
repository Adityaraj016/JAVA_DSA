package maths_for_dsa;
//lcm=d*f*g;
//d=hcd or gcd
// f=a/d;    g=b/d;
//lcm=d*f*g

// or lcm=(a*b)/hcf;
public class lcm {
    public static void main(String[] args) {
        int a=3;
        int b=17;
        int d=gcd(a,b);
        System.out.println("LCM:"+(a*b)/d);
    }
    static int gcd(int a,int b){
        if(a==0){
            return b;
        }
        return gcd(b%a,a);
    }
}

package maths_for_dsa;
// n*log(log(n))
public class prime_sieve_of_eratosthenes {
    public static void main(String[] args) {
        int n=40;
        boolean[] prime=new boolean[n+1];//initiall all are false
        sieve(40,prime);

    }

    static void sieve(int n,boolean[] prime){
        for(int i=2;i*i<=n;i++){
            if(!prime[i]){
                //if number is ptime then make all its multiples true,true-not prime,false-prime
                for(int j=2*i;j<=n;j=j+i){
                    prime[j]=true;
                }
            }
        }
        for(int i=2;i<=n;i++){
            if(!prime[i]){
                System.out.print(i+" ");
            }
        }
    }
}

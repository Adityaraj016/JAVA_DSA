package maths_for_dsa;

import java.util.ArrayList;
import java.util.List;

public class factors {
    public static void main(String[] args) {
        int n=36;
        factor1(n);
        factor2(n);
        factor3(n);
    }

    //O(N)
    static void factor1(int n){
        for(int i=1;i<=n/2;i++){
            if(n%i==0){
                System.out.print(i+" ");
            }
        }
        System.out.print(n+" ");
    }

    //O(sqrt(n))
    static void factor2(int n){
        System.out.println();
        for(int i=1;i<=Math.sqrt(n);i++) {
            if (n % i == 0) {
                if(n/i==i){
                    System.out.print(i+" ");
                }
                else {
                    System.out.print(i + " " + n / i + " ");
                }
            }
        }
    }

    //time and space o(sqrt(n)
    static void factor3(int n){
        System.out.println();
        List<Integer> list=new ArrayList<>();
        for(int i=1;i<=Math.sqrt(n);i++){
            if (n % i == 0) {
                if(n/i==i){
                    System.out.print(i+" ");
                }
                else {
                    System.out.print(i+" ");
                    list.add(n/i);
                }
            }
        }
        for(int i=list.size()-1;i>=0;i--){
            System.out.print(list.get(i)+" ");
        }
    }
}



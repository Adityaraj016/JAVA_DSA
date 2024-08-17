package maths_for_dsa;

public class number_og_digits_in_baseb {
    public static void main(String[] args) {
        int n=6;
//        int count=0;
//        while(n>0){
//            n=n>>1;
//            count++;
//        }
//        System.out.println(count);

        int b=2;   //this is base,can be binary ,decimal,octal,hexa

        int ans=(int)(Math.log(n)/ Math.log(b)) +1;  //formula
        System.out.println(ans);
    }
}

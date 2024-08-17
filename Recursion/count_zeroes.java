package Recursion;

public class count_zeroes {
    public static void main(String[] args) {
//        int num=0;
//        int count=0;
//        if(num==0){
//            System.out.println("1");
//            return;
//        }
//        while (num>0){
//            if(num%10==0){
//                count++;
//            }
//            num/=10;
//        }
//        System.out.println(count);

        //using recursion
        System.out.println(count1(303030));
        System.out.println(count2(303030));
    }

  //using extra variable
    static int count=0;
    static int count2(int n){
        if(n==0){
            return count;
        }
        if(n%10==0){
            count++;
            return count2(n/10);
        }
        else{
            return count2(n/10);
        }

    }


     //using hepper function
    static int count1(int n){
        if(n==0){
            return 1;
        }
        return helper(n,0);
    }
    static int helper(int n,int c){
        if(n==0){
            return c;
        }
        if(n%10==0){
            return helper(n/10,c+1);
        }
        else{
            return helper(n/10,c);
        }
    }
}

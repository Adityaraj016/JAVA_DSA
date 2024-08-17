package Recursion.permutations;

class Solution {
    public static void main(String[] args) {
        System.out.println(numRollsToTarget(2,6,7));
    }
    public static int numRollsToTarget(int n, int k, int target) {

        return dice("", target , k , n );
    }
    public static int dice(String p,int target,int face,int n){
        if(target == 0){
            if(p.length() == n){
                return 1;
            }else{
                return 0;
            }
        }

        int number=0;
        for(int i=1;i <= target && i<= face;i++){
            number=number + dice(p+i , target-i , face ,n );
        }

        return number;
    }
}
package maths_for_dsa;
//o(log(n))
public class square_root {
    public static void main(String[] args) {
        int precision=3;//upto 3 decimal points
        int n=8;
        System.out.printf("%.3f",sqrt(n,precision));
    }
    static double sqrt(int n,int pre){
        int start=0,end=n;
        double root=0;
        //for perfect squarrs
        while(start<=end){
            int mid=start+(end-start)/2;
            if(mid*mid==n){
                return mid;
            }
            if(mid*mid<n){
                start=mid+1;
            }
            else{
                end=mid-1;
            }
        }
        root=end;
        double precision=0.1;

        //for not perfect squares
        for(int i=0;i<pre;i++){
            while(root*root<=n){
                root=root+precision;
            }
            root=root-precision;
            precision=precision/10;
        }

        return root;
    }
}

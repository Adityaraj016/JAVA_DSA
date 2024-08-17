package Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class reverse {
    public static void main(String[] args) {
        int []nums={9,9,9,9,9,9,9,9,9,9};
        ArrayList<Long> list=new ArrayList<>();
        list=addToArrayForm(nums,1);
        System.out.println(list);
        //System.out.println(addToArrayForm(nums,1));

    }
    public static ArrayList<Long> addToArrayForm(int[] num, int k) {
        long sum=0;
        ArrayList<Long> list=new ArrayList<>();
        for(int i=0;i<num.length;i++){
            sum=(sum*10)+num[i];
        }
        sum=sum+k;
        long rem;
        //if sum==0 then it will not enter in while loop and we will get wrong results and our list will be empty
        if(sum==0){
            list.add(0l);
            return list;
        }
        while(sum>0){
            rem=sum%10;
            list.add(rem);
            sum=sum/10;
        }
        Collections.reverse(list);  //reversing list and sice we are adding last element to first position
        return list;

    }
}

package Arrays;

public class maximum {
    public static void main(String[] args) {
        int[] arr={20,5,7,3,9,30,35,6};
        max(arr);
    }
    static void max(int[] a){
        int max=a[0];
        for(int b:a){
            if(b>max){
                max=b;
            }
        }
        System.out.println("Maximum value:"+max);
    }
}

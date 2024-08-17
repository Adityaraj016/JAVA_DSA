package maths_for_dsa;
//it is giving us the number,not position,like 110 ,so it gives 10 that is 2
public class position_of_right_most_set_bit {
    public static void main(String[] args) {
        int number=6;
        int i=1;
        System.out.println(ans(number));
    }
    static int ans(int number){
        return (number & (-number));
    }
}

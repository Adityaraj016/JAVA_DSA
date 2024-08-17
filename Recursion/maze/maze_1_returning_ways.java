package Recursion.maze;

public class maze_1_returning_ways {
    public static void main(String[] args) {
        System.out.println(ways(4,4));
    }
    //initailly row and column are equal to size only
    static int ways(int row,int col){
        if(row == 1 || col == 1){
            return 1;
        }
        int left=ways(row-1,col);
        int right=ways(row,col-1);
        return left+right;
//        int count=0;
//        count=count + ways(row-1,col);
//        count=count + ways(row,col-1);
//
//        return count;
    }
}

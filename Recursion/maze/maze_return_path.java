package Recursion.maze;

import java.util.ArrayList;

public class maze_return_path {
    public static void main(String[] args) {
        System.out.println(ways("",4,4));
    }
    //initailly row and column are equal to size only
    static ArrayList<String> ways(String p, int row, int col){
        if(row == 1 && col == 1){
            ArrayList<String> list=new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String> ans1=new ArrayList<>();
        if(row > 1){
            ans1.addAll(ways(p+'D',row-1,col));
        }
        if( col > 1){
            ans1.addAll(ways(p+'R',row,col-1));
        }
        return ans1;
    }
}

package Recursion.backtracking;

import java.util.ArrayList;
//This is backtracking
public class maze_all_direction {
    public static void main(String[] args) {
        boolean[][] maze={{true,true,true},
                {true,true,true},
                {true,true,true},
        };
        System.out.println(ways(maze,"",0,0));
    }
    //initailly row and column are equal to 0 only
    static ArrayList<String> ways(boolean[][] maze, String p, int row, int col) {
        if (row == maze.length - 1 && col == maze[0].length - 1) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String> ans1 = new ArrayList<>();
        if (!maze[row][col]) {
            return ans1;
        }

        //we are visiting that path so make it false
        maze[row][col]=false;
        if (row < maze.length - 1) {
            ans1.addAll(ways(maze, p + 'D', row + 1, col));
        }
        if (col < maze[0].length - 1) {
            ans1.addAll(ways(maze, p + 'R', row, col + 1));
        }
        if(row > 0){
            ans1.addAll(ways(maze,p+'U' ,row-1 ,col));
        }
        if(col > 0){
            ans1.addAll(ways(maze , p+'L' , row,col-1));
        }

        //we visited that path and we are returnning back so make it like before
        maze[row][col]=true;
        return ans1;
    }
}

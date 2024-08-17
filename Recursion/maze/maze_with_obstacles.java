package Recursion.maze;

import java.util.ArrayList;

public class maze_with_obstacles {
    public static void main(String[] args) {
        boolean[][] maze={{true,true,true},
                {true,false,true},
                {true,true,true},
        };
        System.out.println(ways(maze,"",0,0));
    }
    //initailly row and column are equal to 0 only
    static ArrayList<String> ways(boolean[][] maze,String p, int row, int col){
        if(row == maze.length-1 && col == maze[0].length-1){
            ArrayList<String> list=new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String> ans1=new ArrayList<>();
        if(!maze[row][col]){
            return ans1;
        }
        if(row < maze.length-1){
            ans1.addAll(ways(maze,p+'D',row+1,col));
        }
        if( col < maze[0].length-1){
            ans1.addAll(ways(maze,p+'R',row,col+1));
        }
        return ans1;

        //you can also use this,
//        if(row != maze.length-1){
//            if(maze[row][col]){
//                ans1.addAll(ways(maze,p+'D',row+1,col));
//            }
//            else{
//                return ans1;
//            }
//        }
//        if( col != maze[0].length-1){
//            if(maze[row][col]){
//                ans1.addAll(ways(maze,p+'R',row,col+1));
//            }
//            else{
//                return ans1;
//            }
//        }
//        return ans1;
    }
}

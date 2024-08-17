package Recursion.backtracking;
import java.util.ArrayList;
import java.util.List;
public class return_n_queens_list {
    public static void main(String[] args) {
        int n=4;
        System.out.println(solveNQueens(n));
    }
    public static List<List<String>> solveNQueens(int n) {
        boolean[][] board=new boolean[n][n];
        return queens(board,0);
    }
    //initialyy all are false
    public static List<List<String>> queens(boolean[][] board,int row){
        if(row == board.length){
            //means end of a row and all are placed
            List<List<String>> list=new ArrayList<>();
            list=display(board);
            return list;
        }
        List<List<String>> ans=new ArrayList<>();
        //if position are safe or not,where to place
        for(int col=0;col< board.length;col++){
            if(isSafe(board,row,col)){
                board[row][col]=true;
                ans.addAll(queens(board,row+1));  //means if found ,directly shift to next row
                board[row][col]=false;  //backtracking,making it like earlier after each call over
            }
        }
        return ans;
    }
    private static boolean isSafe(boolean[][] board,int row,int col){
        //check vertical row
        for(int i=0;i<row;i++){
            if(board[i][col]){
                return false;
            }
        }
        //daigonal left
        int maxleft=Math.min(row,col);
        for(int i=1;i<= maxleft;i++){
            if(board[row - i][col - i]){
                return false;
            }
        }
        //daigonal right
        int maxRight=Math.min(row, board.length - col -1);
        for(int i=1;i<= maxRight;i++){
            if(board[row - i][col + i]){
                return false;
            }
        }

        return true;
    }
    public static List<List<String>> display(boolean[][] board){
        List<List<String>> list=new ArrayList<>();
        List<String> list1=new ArrayList<>();
        for(boolean[] row:board){
            StringBuilder sb=new StringBuilder();
            for(boolean element:row){
                if(element){
                    sb.append('Q');
                }
                else{
                    sb.append('.');
                }
            }
            list1.add(sb.toString());
        }
        list.add(list1);
        return list;
    }
}

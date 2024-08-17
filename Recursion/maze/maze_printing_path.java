package Recursion.maze;

public class maze_printing_path {
    public static void main(String[] args) {
        ways("",4,4);
    }
    //initailly row and column are equal to size only
    static void ways(String p,int row,int col){
        if(row == 1 && col == 1){
            System.out.println(p);
            return;
        }
        if(row > 1){
            ways(p+'D',row-1,col);
        }
        if( col > 1){
            ways(p+'R',row,col-1);
        }
    }
}

package Backtracking;

public class mazePath {
    public static int countMaze(int sr,int sc,int row,int col){
        if(sr>row || sc>col) return 0;
        if(sr==row-1 && sc==col-1) return 1;
        int rightWays = countMaze(sr,sc+1,row,col);
        int downWays = countMaze(sr+1,sc,row,col);
        return downWays + rightWays;
    }
    public static void main(String[] args) {
        int row = 3;
        int col = 3;
        System.out.println(countMaze(0,0,row,col));
    }
}

package Backtracking;

public class ratInDeadMaze {
    public static void print(int sr,int sc,int rows,int col,String s,int[][] maze){
        if(sr>rows || sc>col) return;
        if(sr==rows && sc==col){
            System.out.println(s);
        }
        if(maze[sr][sc]==0) return;
        print(sr,sc+1,rows,col,s+"R",maze);
        print(sr+1,sc,rows,col,s+"D",maze);

    }
    public static void main(String[] args) {
        int rows = 4;
        int col = 4;
        int[][] maze = {{1,0,0,0},
                        {1,1,0,1},
                        {0,1,0,0},
                        {0,1,1,1}};
        print(0,0,rows-1,col-1,"",maze);
    }
}

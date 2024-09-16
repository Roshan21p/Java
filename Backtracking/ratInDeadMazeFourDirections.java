package Backtracking;

public class ratInDeadMazeFourDirections {
//    public static void print(int sr,int sc,int rows,int col,String s,int[][] maze,boolean[][] isVisited){
//        if(sr<0 || sc<0) return;
//        if(sr>rows || sc>col) return;
//        if(sr==rows && sc==col){
//            System.out.println(s);
//        }
//        if(maze[sr][sc]==0) return;
//        if(isVisited[sr][sc]==true) return;
//        isVisited[sr][sc] = true;
//        print(sr,sc+1,rows,col,s+"R",maze,isVisited);
//        print(sr+1,sc,rows,col,s+"D",maze,isVisited);
//        print(sr,sc-1,rows,col,s+"L",maze,isVisited);
//        print(sr-1,sc,rows,col,s+"U",maze,isVisited);
//        isVisited[sr][sc] = false;
//    }
    // Optimised
    public static void print(int sr,int sc,int rows,int col,String s,int[][] maze){
        if(sr<0 || sc<0) return;
        if(sr>rows || sc>col) return;
        if(sr==rows && sc==col){
            System.out.println(s);
        }
        if(maze[sr][sc]==0) return;
        if(maze[sr][sc]==-1) return;
        maze[sr][sc]=-1;
        print(sr,sc+1,rows,col,s+"R",maze);
        print(sr+1,sc,rows,col,s+"D",maze);
        print(sr,sc-1,rows,col,s+"L",maze);
        print(sr-1,sc,rows,col,s+"U",maze);
        maze[sr][sc]=1;
    }

    public static void main(String[] args) {
        int rows = 3;
        int col = 4;
        int[][] maze = {{1,0,1,1},
                        {1,1,1,1},
                        {1,1,0,1}};
        //boolean[][] isVisited = new boolean[rows][col];
        print(0,0,rows-1,col-1,"",maze);
    }
}

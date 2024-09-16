package Backtracking;

public class fourDirectionsMazePath {
    public static void print(int sr,int sc,int row,int col,String ans,boolean[][] isVisted){
        if(sr<0 || sc<0) return;
        if(sr>row || sc>col) return;
        if(isVisted[sr][sc]==true) return;
        if(sr==row && sc==col){
            System.out.println(ans);
            return;
        }
        isVisted[sr][sc] = true;
        print(sr,sc+1,row,col,ans+"R",isVisted);
        print(sr+1,sc,row,col,ans+"D",isVisted);
        print(sr,sc-1,row,col,ans+"L",isVisted);
        print(sr-1,sc,row,col,ans+"U",isVisted);
        isVisted[sr][sc] = false;
    }
    public static void main(String[] args) {
        int row = 3;
        int col = 3;
        boolean[][] isVisted = new boolean[row][col];
        print(0,0,row-1,col-1,"",isVisted);
    }
}

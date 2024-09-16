package Backtracking;

public class printPath {
    public static void print(int sr,int sc,int row,int col,String ans){
        if(sr>row || sc>col) return;
        if(sr==row-1 && sc==col-1){
            System.out.println(ans);
            return;
        }
        print(sr,sc+1,row,col,ans+"R");
        print(sr+1,sc,row,col,ans+"D");
    }
    public static void main(String[] args) {
        int row = 3;
        int col = 3;
        print(0,0,row,col,"");
    }
}

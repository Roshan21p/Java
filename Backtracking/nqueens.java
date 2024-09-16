package Backtracking;

public class nqueens {
    static int count = 0;
    public static boolean isSafe(char[][] board,int row,int col){
        int n = board.length;
        // check row
        for(int i=0;i<n;i++) if(board[i][col] == 'Q') return false;
        // check column
        for(int j=0;j<n;j++) if(board[row][j] == 'Q') return false;
        // check north east
        int i = row;
        int j = col;
        while(i>=0 && j<n){
            if(board[i][j]=='Q') return false;
            i--;j++;
        }
        // check south east
        i = row;
        j = col;
        while(i<n && j<n){
            if(board[i][j]=='Q') return false;
            i++;j++;
        }
        //check south west
        i = row;
        j = col;
        while(i<n && j>=0){
            if(board[i][j]=='Q') return false;
            i++;j--;
        }
        //check north west
        i = row;
        j = col;
        while(i>=0 && j>=0){
            if(board[i][j]=='Q') return false;
            i--;j--;
        }
        return true;
    }
    public static void nQueen(char[][] board,int row){
        int n = board.length;
        if(row==n){
//            for(int i=0;i<n;i++){
//                for(int j=0;j<n;j++){
//                    System.out.print(board[i][j]);
//                }
//                System.out.println();
//            }
//            System.out.println();
            count++;
            return;
        }
        for(int j=0;j<n;j++){
            if(isSafe(board,row,j)){
                board[row][j] = 'Q';
                nQueen(board,row+1);
                board[row][j] = 'X';
            }
        }
    }
    public static void main(String[] args) {
        int n = 8;
        char[][] board= new char[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                board[i][j] = 'X';
            }
        }
        nQueen(board,0);
        System.out.println(count);
    }
}

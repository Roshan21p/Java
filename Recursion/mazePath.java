package Recursion;

import java.util.Scanner;

public class mazePath {
    static int countMaze(int row,int col,int r,int c){
        if(row==r || col==c) return 1;
        int rightWays = countMaze(row,col+1,r,c);
        int downWays = countMaze(row+1,col,r,c);
        return rightWays + downWays;
    }
    static int countMaze1(int r,int c){
        if(r==1 || c==1) return 1;
        int rightWays = countMaze1(r,c-1);
        int downWays = countMaze1(r-1,c);
        return rightWays + downWays;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of row : ");
        int r = sc.nextInt();
        System.out.println("Enter the number of column : ");
        int c = sc.nextInt();
        System.out.println("The number of paths in maze : "+countMaze(1,1,r,c));
        System.out.println("The number of paths in maze : "+countMaze1(r,c));
    }
}

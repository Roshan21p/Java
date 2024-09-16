package Recursion.STRING;

import java.util.Scanner;

public class generateparentheses {
    public static void print(int open,int close,int n,String ans){
        if(2*n==ans.length()){
            System.out.println(ans);
            return;
        }
        if(open < n){
            print(open+1,close,n,ans+"(");
        }
        if(close<open) print(open,close+1,n,ans+")");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        print(0,0,n,"");
    }
}

package Recursion.STRING;

import java.util.Scanner;

public class binaryString {
    static void printBinary(String s,int n){
        int m = s.length();
        if(m==n){
            System.out.println(s);
            return;
        }
        if(m==0 || s.charAt(m-1)=='0'){
            printBinary(s+1,n);
            printBinary(s+0,n);
        }
        else printBinary(s+0,n);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        printBinary("",n);
    }
}

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

//    public static void printBinary1(StringBuilder ans, int n) {
//        if (ans.length() == n) {
//            System.out.println(ans.toString());
//            return;
//        }
//
//        // If string is empty OR last char is '0'
//        if (ans.length() == 0 || ans.charAt(ans.length() - 1) == '0') {
//            ans.append('0');
//            printBinary(ans, n);
//            ans.deleteCharAt(ans.length() - 1);
//
//            ans.append('1');
//            printBinary(ans, n);
//            ans.deleteCharAt(ans.length() - 1);
//        }
//        else {
//            ans.append('0');
//            printBinary(ans, n);
//            ans.deleteCharAt(ans.length() - 1);
//        }
//    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        printBinary("",n);
    }
}

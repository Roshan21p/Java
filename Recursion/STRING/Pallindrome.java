package Recursion.STRING;

import java.util.Scanner;

public class Pallindrome {
    static boolean isPallindrome(String s,int l,int r){
        if(l >= r) return true ;
        return (s.charAt(l) == s.charAt(r)  && isPallindrome(s,l+1,r-1));
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string : ");
        String s = sc.nextLine();
        int l =0, r = s.length()-1;
        System.out.println(isPallindrome(s,l,r));
    }
}

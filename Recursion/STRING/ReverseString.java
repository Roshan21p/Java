package Recursion.STRING;

import java.util.Scanner;

public class ReverseString {
    static String reverse1(String s) {
        if (s.length() == 0) return "";

        String smallAns = reverse1(s.substring(1));
        return smallAns + s.charAt(0);

    }
    static String reverse(String s, int idx){
        if(idx == s.length())  return "";
        String smallAns = reverse(s,idx+1);
        return smallAns + s.charAt(idx);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       // System.out.println("Enter the string : ");
       // String s = sc.nextLine();
        String s = "roshan";
        StringBuilder a = new StringBuilder();
        System.out.println(a.reverse());
       int idx = 0;
//        String rev = reverse(s,idx);
//        if(rev.equals(s)){
//            System.out.printf("%s is Pallindrome",s);
//        }
//        else{
//            System.out.printf("%s is not Pallindrome",s);
//        }
//        System.out.println("");
      System.out.println("Reverse string is : "+reverse(s,idx));
//        System.out.println("Reverse string is : "+reverse1(s));
    }
}

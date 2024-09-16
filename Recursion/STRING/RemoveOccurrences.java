package Recursion.STRING;
// REMOVE ALL THE OCCURRENCES OF  'a' FROM STRING s = 'abcax'
import java.util.Scanner;

public class RemoveOccurrences {

    static String removeA2(String s){
        if(s.length() == 0) return "";

        String smallAns = removeA2(s.substring(1));
        char currChar = s.charAt(0);
        //self work
        if(currChar != 'a'){
            return currChar + smallAns;
        }else {
            return smallAns;
        }


    }
    static String removeA(String s,int idx){
        if(idx == s.length()) return "";

        String smallAns = removeA(s,idx+1);
        char currChar = s.charAt(idx);
        //self work
        if(currChar != 'a'){
            return currChar + smallAns;
        }else {
            return smallAns;
        }
    }

    static void skip(int idx,String s,String ans){
        if(idx==s.length()){
            System.out.println(ans);
            return;
        }
        if(s.charAt(idx) != 'a') ans += s.charAt(idx);
        skip(idx+1,s,ans);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string : ");
        String s = sc.nextLine();
        int idx = 0;
        System.out.println(removeA(s,idx));
        System.out.println(removeA2(s));
        skip(idx,s,"");
    }
}

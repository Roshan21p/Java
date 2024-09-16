package STACKS;

import java.util.Scanner;
import java.util.Stack;

public class balancedBrackets {
    static int count = 0;
    public static boolean isBalanced(String str){
        Stack<Character> st = new Stack<>();
        int n = str.length();
        for(int i=0;i<n;i++){
            char ch = str.charAt(i);
            if(ch == '(' ){
                st.push(ch);
            }
            else {
                if(st.empty()) return false;
                if(st.peek() == '(') st.pop();
            }
        }
        if(!st.empty()) return false;
        else return true;
    }
    public static void minBracketRemoval(String str) {
        Stack<Character> st = new Stack<>();
        int n = str.length();
        for(int i=0;i<n;i++){
            if(str.charAt(i)=='(') st.push(str.charAt(i));
            else{
                if(st.size()==0) count++;
                else if(st.peek()=='(') st.pop();
            }
        }
        if(st.size()>0) count = st.size();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the parentheses bracket:");
        String str = sc.nextLine();
        System.out.println(isBalanced(str));
        minBracketRemoval(str);
        System.out.println("Minimum number of bracket to remove to make balanced sequence : "+count);
    }
}

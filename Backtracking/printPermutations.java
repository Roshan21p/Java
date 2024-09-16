package Backtracking;

public class printPermutations {
    public static void print(String str,String ans){
        if(str.equals("")){
            System.out.println(ans);
            return;
        }
        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            String left = str.substring(0,i);
            String right = str.substring(i+1);
            String rem = left + right;
            print(rem,ans+ch);
        }
    }
    public static void main(String[] args) {
        String str = "abc";
        print(str,"");
    }
}

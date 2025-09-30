package Recursion.STRING;

public class printPermutation {
    static void printAllPermutation(String ans,String s){
        if(s.length()==0){
            System.out.print(ans+" ");
            return;
        }
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            String left = s.substring(0,i);
            String right = s.substring(i+1);
            printAllPermutation(ans+ch,left+right);
        }
    }

//    public static void printAllPermutation(StringBuilder ans, String s, boolean[] used) {
//            if (ans.length() == s.length()) {
//                System.out.print(ans + " ");
//                return;
//            }
//
//            for (int i = 0; i < s.length(); i++) {
//                if (used[i]) continue; // skip already used char
//
//                // choose
//                ans.append(s.charAt(i));
//                used[i] = true;
//
//                // explore
//                printAllPermutation(ans, s, used);
//
//                // undo (backtrack)
//                ans.deleteCharAt(ans.length() - 1);
//                used[i] = false;
//            }
//        }


    public static void main(String[] args) {
        String s = "abc";
        printAllPermutation("",s);
    }
}

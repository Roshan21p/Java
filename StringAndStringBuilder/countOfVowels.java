package StringAndStringBuilder;

import java.util.Scanner;

public class countOfVowels {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = "Roshan";
        int n = str.length();
        int count = 0;
        for (int i = 0; i < n; i++) {
            char ch = str.charAt(i);
//            if(isVowel(ch)==true) count++;
              if(notVowel(ch) == true) count++;
        }
        System.out.println("Count of Vowels :" +count);
    }
//    public static boolean isVowel(char ch){
//        if(ch =='a' || ch == 'A') return true;
//        if(ch =='e' || ch == 'E') return true;
//        if(ch =='i' || ch == 'I') return true;
//        if(ch =='o' || ch == 'O') return true;
//        if(ch =='u' || ch == 'U') return true;
//        return false;
//    }
    public static boolean notVowel(char ch){
        if(ch =='a' || ch == 'A') return false;
        if(ch =='e' || ch == 'E') return false;
        if(ch =='i' || ch == 'I') return false;
        if(ch =='o' || ch == 'O') return false;
        if(ch =='u' || ch == 'U') return false;
        return true;
    }
}

package StringAndStringBuilder;

import java.util.Scanner;

public class toggleCharacters {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String :");
        StringBuilder sb = new StringBuilder(sc.nextLine());
        for (int i = 0; i < sb.length(); i++) {
            char ch = sb.charAt(i);
            int ascii = (int)ch;
            if(ascii>=65 && ascii<=90){ //Capital Alphabet A -> 65 to Z -> 90
                ascii += 32;
                ch = (char)ascii;
                sb.setCharAt(i,ch);
            } else {                   // Small Alphabet  a -> 97 to z -> 122
                ascii -= 32;
                ch = (char)ascii;
                sb.setCharAt(i,ch);
            }
        }
        System.out.println(sb);
    }
}

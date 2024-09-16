package Recursion.STRING;

import java.util.Scanner;

public class BasicString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(s);

        //arr = {1,2,3} , arr[0]
        char ch = s.charAt(0);
        System.out.println(ch);
        System.out.println(s.substring(2,7));
        /*
        college
        0123456
        n =7
         */
        for(int i =0;i<s.length();i++){
            System.out.println(s.charAt(i));
        }
    }
}

package Recursion.STRING;

import java.util.*;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class BasicString {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(s);

        //arr = {1,2,3} , arr[0]
        char ch = s.charAt(0);
        System.out.println(ch);
        System.out.print(s.substring(2,7)+" ");
        /*
        college
        0123456
        n =7
         */
        System.out.println();
        for(int i =0;i<s.length();i++){
            System.out.print(s.charAt(i)+" ");
        }
        System.out.println();
        System.out.println(s.substring(0,0));
    }
}

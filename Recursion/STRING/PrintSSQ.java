package Recursion.STRING;

import java.util.ArrayList;
import java.util.Scanner;

public class PrintSSQ {
    static ArrayList<String> arr = new ArrayList<>();
    static void printSSQ(String s, String currAns){
        if(s.length() == 0){
            //System.out.print(currAns+" ");
            arr.add(currAns);
            return;
        }
        char curr = s.charAt(0);
        String remString = s.substring(1);

        // Curr char => chooses to be a part of currAns
        printSSQ(remString,currAns + curr);

        // curr char => does not choose to be a part of currAns
        printSSQ(remString,currAns);
    }
    public static void printSubsets(int i,String s,String ans){
        if(i==s.length()){
            System.out.println(ans);
            return;
        }
        char ch = s.charAt(i);
        printSubsets(i+1,s,ans+ch); //take
        printSubsets(i+1,s,ans); // do not take
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String : ");
        String s = sc.nextLine();
        String currAns = "";
        printSSQ(s, currAns);
        System.out.println(arr);
        printSubsets(0, s, "");
    }
}
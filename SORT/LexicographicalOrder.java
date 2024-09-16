package SORT;
/*
Given an array of names of the fruits you are supposed to sort it in lexographical order using the selection sort
 */

import java.util.Scanner;

public class LexicographicalOrder {
    static void SortFruits(String[] fruits){
        int n = fruits.length;
        for(int i=0;i<n-1;i++){
            int min_index = i;
            for(int j=i+1;j<n;j++){
                if(fruits[j].compareTo(fruits[min_index] )< 0){
                     min_index = j;
                }
            }
            String temp = fruits[i];
            fruits[i] = fruits[min_index];
            fruits[min_index] = temp;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        System.out.println("The the string of fruits name : ");
//        String fruits = sc.nextLine();
        String[] fruits = {"kiwi", "apple", "papaya", "mango"};

//        String[] fruits = new String[s];
//        System.out.println("The fruits name is : ");
//        for(int i=0;i < s.length();i++){
//            System.out.println(fruits[i] + "");
////            System.out.print(f.charAt(i) + "");
//        }
        SortFruits(fruits);
        for(String val : fruits){
            System.out.print(val + " ");
        }
    }
}
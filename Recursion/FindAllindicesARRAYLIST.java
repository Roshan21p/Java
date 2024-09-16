package Recursion;

import ARRAY.ARRAYLIST;

import java.util.ArrayList;
import java.util.Scanner;

public class FindAllindicesARRAYLIST {
    static ArrayList<Integer> allIndices(int[] arr,int n,int target,int idx){
        ArrayList<Integer> ans = new ArrayList<>();
        // base case
       // if(idx >= n) return new ArrayList<Integer>();  // return empty arraylist
        if(idx >= n) return ans;  // return empty arraylist

       // ArrayList<Integer> ans = new ArrayList<>();

        // self work
        if(arr[idx] == target){ // ans => {0}
            ans.add(idx);
        }
        //Recursive work
       ArrayList<Integer> smallans =  allIndices(arr,n,target,idx+1); // smallans => {3,4}
        ans.addAll(smallans); // { 0,3,4}
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {2,1,3,2,2,5};
        int target = 2;
        int idx = 0;
        System.out.println("The all Indices which is equal to target is : ");
        ArrayList<Integer> ans = allIndices(arr,arr.length,target,idx);
        for(Integer i:ans){
            System.out.println(i);
        }
    }
}

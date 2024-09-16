package Recursion;

import java.util.Scanner;

public class TargetArray {
    // FOR FirstINDEX =>  return index of target if target present in array, otherwise retuen -1;
    static int findFirstIndex(int[] arr,int n,int target,int idx) {
        // base case
        if (idx >= n) return -1;
        // self work
        if (arr[idx] == target) return idx;
        // recursive work
        return findFirstIndex(arr, n, target, idx + 1);
    }



    // FOR LAStINDEX =>  return index of target if target present in array, otherwise retuen -1;
    static int findLastIndex(int[] arr,int n,int target,int idx){
        // base case
        if(idx >= n) return -1;
        // recursive work
        int lastindex = findLastIndex(arr,n,target,idx+1);
        if (arr[idx] == target && idx > lastindex) {
            return idx;
        }
        else {
            return lastindex;
        }
    }


    // true,false => based on existen
    static boolean search(int[] arr, int n, int target, int idx) {
        // base case
        if (idx == n) return false;
        // self work
        if (arr[idx] == target) return true;
        //recursive work
        return search(arr, n, target, idx + 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {2, 3, 4, 4, 7};
        int target = 4;
        int idx = 0;

//        if (search(arr, arr.length, target, idx)) {
//            System.out.println("Yes");
//        } else {
//            System.out.println("No");
//        }
       // System.out.println("Print index : " +findIndex(arr,arr.length,target,idx));
        System.out.println("Print index : " +findLastIndex(arr,arr.length,target,idx));
    }
}

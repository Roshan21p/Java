package Recursion;
// GIVEN AN ARRAY arr OF SIZE N AND INTEGER X. THE TASK IS TO FIND ALL THE INDICES OF THE INTEGER X INT THE ARRAY
// INPUT : {1,2,3,2,2,5} X =2
//OUTPUT : 1,3,4
import java.util.Scanner;

public class AllindicesIntegerX {
    static void findAllIndex(int[] arr,int n,int target,int idx){
        // base case
        if(idx == n) return;
        // self work
        if(arr[idx] == target ){
            System.out.println(idx);
        }
        //recusive work
        findAllIndex(arr,n,target,idx+1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {1,2,3,2,2,5};
        int target = 2;
        int idx = 0;
        System.out.println("The all Indices which is equal to target is : ");
        findAllIndex(arr,arr.length,target,idx);
    }
}

package ARRAY.PrefixSuffixSum;
// GIVEN AN ARRAY OF INTEGERS OF SIZE n, ANSWER q QUERIES WHERE YOU NEED TO PRINT THE SUM OF VALUES IN A GIVEN RANGE OF INDICES FROM L TO R(BOTH INCLUDED)
// NOTE : THE VALUES OF l AND r IN QUERIES FOLLOW 1-BASED INDEXING
import java.util.Scanner;

public class RangeQuery {
    static void printArray(int[] arr){
        int n = arr.length;
        for(int i=0;i<n;i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    static int[] makePrefixsumArray(int[] arr){
        for(int i=1;i<arr.length;i++){
            arr[i] += arr[i-1];
        }
        return arr;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the array size:");
        int n = sc.nextInt();
        int[] arr = new int[n+1];

        System.out.print("Enter " +n+ " array element : ");
        for(int i=1;i<=n;i++){
            arr[i] = sc.nextInt();
        }
        int[] prefix = makePrefixsumArray(arr);
        System.out.print("Enter number of queries : ");
        int q = sc.nextInt();

        while(q-- > 0){
            System.out.println("Enter range : ");
            int l = sc.nextInt();
            int r = sc.nextInt();

            int ans = prefix[r] - prefix[l-1];

            System.out.println("Sum " +ans);
        }
    }
}

package ARRAY;
//Program to find the total number of pairs in the arrays whose sum is equal in the given value of x
import java.util.Scanner;

public class TotalNoPairs {

    static int pairSum(int[] arr, int target){
        int ans = 0;
        for(int i=0;i<arr.length;i++){ // first number
            for(int j=i+1;j<arr.length;j++){ //second number
                if(arr[i] + arr[j] == target){
                    ans++;
                }
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the array of size:");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("enter the array element :");
        for(int i=0;i< arr.length;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the target value:");
        int target = sc.nextInt();

        System.out.println("The total no of pairs is : " +pairSum(arr,target));
    }
}

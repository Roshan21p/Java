package ARRAY.arrayManipulation;

import java.util.Scanner;

//Find the unique number in a given array where all the elements are being repeated twice with one value being unique
/* ALGORITHM
1. traverse all pairs 2. equal pairs marks -1  3. traverse array again then value > 0 in our answer
 */
public class UniqueNumber {
    static int uniqueNo(int[] arr){
        int n = arr.length;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(arr[i] == arr[j]){
                    arr[i] = -1;
                    arr[j] = -1;
                }
            }
        }
        int ans = -1;
        for(int i=0;i<n;i++){
            if(arr[i] > 0){
                ans = arr[i];
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

        System.out.println("The unique number is : " +uniqueNo(arr));
    }

}

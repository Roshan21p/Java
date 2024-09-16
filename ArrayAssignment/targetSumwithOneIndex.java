package ArrayAssignment;

import java.util.Scanner;
/*
Given a 1-indexed array of integers numbers that is already sorted in non-decreasing order, find two
numbers such that they add up to a specific target number.
Return the indices of the two numbers added by one. Return -1 if pair does not exist.
Input:
n = 4
numbers = [2,7,11,15]
target = 9
Expected Output:
1 2
 */

public class targetSumwithOneIndex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of array");
        int n = sc.nextInt();
        int[] numbers = new int[n];
        System.out.println("Enter the elements of array");
        for(int i = 0; i < n; i++){
            numbers[i] = sc.nextInt();
        }
        System.out.println("Enter the target");
        int target = sc.nextInt();
        int i = 0;
        int j = n-1;
        while(i < j){
            if(numbers[i] + numbers[j] == target){
                System.out.println(++i + " " + ++j);
                return;
            }else if(numbers[i] + numbers[j] > target){
                j--;
            }else{
                i++;
            }
        }
        System.out.println(-1);
    }
}

package Recursion;

import java.util.Scanner;

public class SumOfDigits {
    static int SOD(int n){
        if(n >= 0 && n <= 9){
            return n;
        }
        // recursive work
        int smallAns = SOD(n/10);
        // self work
        int ans = smallAns + n%10;
        return ans;
        //return SOD(n/10) + n%10;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int n = sc.nextInt();
        System.out.println("The sum of digits is : " +SOD(n));
    }
}

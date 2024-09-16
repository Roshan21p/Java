package LOOPS;

import java.util.Scanner;

public class SumOfSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 1-2+3-4+......n
        System.out.println("Enter a number:");
        int n = sc.nextInt();

        int ans = 0;
        for(int i=1;i<=n;i++){
            if(i%2 == 0){
                ans -= i;
            }
            else{
                ans += i;
            }
        }
        System.out.println("Sum of series number is :"+ans);
    }
}

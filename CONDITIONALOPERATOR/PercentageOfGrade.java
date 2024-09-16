package CONDITIONALOPERATOR;

import java.util.Scanner;

public class PercentageOfGrade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number :");
        int n = sc.nextInt();
        if(n>90 && n<=100){
            System.out.println("Excellent");
        }
        else if(n>80 && n<=90){
            System.out.println("Very good");
        }
        else if(n>70 && n<=80) {
            System.out.println("good");
        }
        else if(n>60 && n<=70) {
            System.out.println("can do better");
        }
        else if(n>50 && n<=60) {
            System.out.println("Average");
        }
        else if(n>40 && n<=50) {
            System.out.println("Below Average");
        }
        else{
            System.out.println("fail");
        }

    }

}

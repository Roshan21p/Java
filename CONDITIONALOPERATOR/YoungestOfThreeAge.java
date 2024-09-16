package CONDITIONALOPERATOR;

import java.util.Scanner;

public class YoungestOfThreeAge {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Ram Age :");
        int Ram = sc.nextInt();
        System.out.println("Enter shyam Age :");
        int Shyam = sc.nextInt();
        System.out.println("Enter Ajay Age :");
        int Ajay = sc.nextInt();
        if (Ram < Shyam && Ram < Ajay) {
            System.out.println("Ram is Youngest");
        } else if (Shyam < Ram && Shyam < Ajay) {
            System.out.println("Shyam is Youngest");
        } else {
            System.out.println("Ajay is Youngest");
        }
    }
}
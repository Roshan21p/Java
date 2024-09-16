package CONDITIONALOPERATOR;

import java.util.Scanner;

public class AreaRectisGreaterthanPeri {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length :");
        int length = sc.nextInt();
        System.out.println("Enter the breadth :");
        int breadth = sc.nextInt();
       int Area = length * breadth;
       int Perimeter = 2 * (length + breadth);
       if(Area > Perimeter){
           System.out.println("Area is greater than Perimeter");
       } else if(Perimeter > Area){
           System.out.println("Perimeter is greater than Area");
       }
       else{
           System.out.println("Area and Perimeter both are equal");
       }
    }
}

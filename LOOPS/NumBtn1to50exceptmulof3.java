package LOOPS;
import java.util.Scanner;

public class NumBtn1to50exceptmulof3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number :");
        int num = sc.nextInt();
        for(int i=0;i<num;i++){
            if(i%3==0){
                continue;
            }
            System.out.println(i);
        }
    }
}

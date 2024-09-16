package ARRAY;
// FIND THE LAST OCCURENCE PF A ELEMENT X IN A GIVEN ARRAY meaning
//find last indices {1 2 4 2 6 4} last occurence is 3
import java.util.Scanner;

public class LastOccurenceOfX {

    static int LastOccurence(int[] arr, int x) {
        int lastIndex = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) {
                lastIndex = i;
            }
        }
        return lastIndex;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the array of size :");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter the array elements :");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter x");
        int x = sc.nextInt();
        System.out.println("The LastOccurence of x is :" + LastOccurence(arr, x));
    }
}

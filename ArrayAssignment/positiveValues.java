package ArrayAssignment;
import java.util.Scanner;
public class positiveValues {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = {1, 2, 6, 0, -5, -2, -4};
        for (int val:arr) {
            if(val >=0 ){
                System.out.println("The Positive values is :" +val);
            }
        }
    }
}

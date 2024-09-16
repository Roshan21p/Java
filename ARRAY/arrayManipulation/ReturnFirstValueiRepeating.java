package ARRAY.arrayManipulation;
//GIVEN AN ARRAY "a" CONSISTING OF INTEGERS . RETURN THE FIRST THE VALUE THAT IS REPEATING IN THIS ARRAY. IF NO VALUE IS BEING REPEATED RETURN -1
import java.util.Scanner;

public class ReturnFirstValueiRepeating {
    static int ReturnLastRepeatingValue(int[] arr) {
        int valueRepeat = -1;
        for (int i = 0; i < arr.length; i++) {// first number
            for (int j = i + 1; j < arr.length; j++) {//second number
                if (arr[i] == arr[j]) { // found ans
                    valueRepeat = arr[i];
                }
            }
        }
        return valueRepeat;
    }
    static int ReturnFirstRepeatingValue(int[] arr){
        for(int i=0;i<arr.length;i++){// first number
            for(int j=i+1;j<arr.length;j++){//second number
                if(arr[i] == arr[j]){ // found ans
                    return arr[i];
                }
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the array of size : ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter the array element :");
        for(int i=0;i< arr.length;i++){
            arr[i] = sc.nextInt();
        }
      //  System.out.println("First repeating value : " +ReturnFirstRepeatingValue(arr));
        System.out.println("last repeating value : " +ReturnLastRepeatingValue(arr));
    }
}

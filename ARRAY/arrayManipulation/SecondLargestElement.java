package ARRAY.arrayManipulation;
// IMP to find minimum element use ::: min : Integer(max.value) keyword
// IMP to find maximum element use ::: max : Integer(min.value) keyword
/* ALOGORITHM
1. find maximum  2. mark all maximum as -infinty  3.find maximum

 */
import java.util.Scanner;

public class SecondLargestElement {
//    static int FindMaxNo(int[] arr) {
//        int max = Integer.MIN_VALUE;
//        for (int i = 0; i < arr.length; i++) {
//            if (arr[i] > max) {
//                max = arr[i];
//            }
//        }
//        return max;
//    }
//
//        static int secondLargestNo(int[] arr){
//            int max = FindMaxNo(arr);
//
//            for(int i=0;i<arr.length;i++){
//                if(arr[i] == max){
//                    arr[i] = Integer.MIN_VALUE;
//                }
//        }
//            int secondmx = FindMaxNo(arr);
//            return secondmx;
//
//    }
        static int secondLargestNo(int[] arr){
            int firstMax = Integer.MIN_VALUE;
            int secondMax = Integer.MIN_VALUE;
            for (int i = 0; i < arr.length; i++) {
                if(arr[i] > firstMax){
                    secondMax = firstMax;
                    firstMax = arr[i];
                } else if(arr[i] > secondMax && arr[i] != firstMax){
                    secondMax = arr[i];
                }
            }
        return secondMax;
       }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the array of size:");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("enter the array element :");
        for(int i=0;i< arr.length;i++){
            arr[i] = sc.nextInt();
        }

        System.out.println("The second largest number is : " +secondLargestNo(arr));
    }
}

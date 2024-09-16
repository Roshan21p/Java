package ArrayAssignment;

import java.util.Scanner;

// find peak value in the array but peak value is one which is greater than its immediate left neighbour and its immediate righe neighbour . leftmost and rightmost element cannot be a peak element
public class peakValue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr =  {1,1,3,4,2,3,5,7,0};

        for(int i=1;i < arr.length; i++){
            if(arr[i-1] < arr[i] && arr[i] > arr[i+1]){
                System.out.println(arr[i]);
                break;
            }
        }
    }

}

package SORT.Assignment;

import java.util.Scanner;

public class sortbyinsertion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String :");
        String s = sc.next();
        char[] arr = s.toCharArray();
        for(int i=1;i< arr.length;i++){
            int j=i;
            //Insert a[i] into sorted left part
            while(j>0 && arr[j] < arr[j-1]){
                char temp = arr[j];
                arr[j] = arr[j-1];
                arr[j-1] = temp;
                j--;
            }
        }
        for (char val:arr) {
            System.out.print(val +"");
        }
    }
}

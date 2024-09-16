package ArrayAssignment;

import java.util.Scanner;
/*
- Given two arrays a[] and b[] of size n and m respectively where m >= n. The task is to find
union between these two arrays and print the number of elements of the union set.
Union of the two arrays can be defined as the set containing distinct elements from both
the arrays. If there are repetitions, then only one occurrence of element should be printed
in the union.
 */
public class printUnion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of arrays :");
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] a = new int[n];
        int[] b = new int[m];
        System.out.println("Enter " +n+ " elements");
        for(int i=0;i<n;i++){
            a[i] = sc.nextInt();
        }
        System.out.println("Enter " +m+ " elements");
        for(int i=0;i<m;i++){
           b[i] = sc.nextInt();
           boolean check = false;
           for(int j=0;j<n;j++){
               if(b[i] != a[j]){
                   check = true;
                   break;
               }
           }
           if(check == false){
               System.out.println(b[i]);
           }
        }
    }
}

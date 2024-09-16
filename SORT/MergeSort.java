package SORT;

import java.util.Scanner;

public class MergeSort {
    static void display(int[] arr){
        for(int i=0;i< arr.length;i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    // Method 1
    //    static void merge(int[] arr, int l,int mid, int r){
    //        int n1 = mid - l + 1;
    //        int n2 = r - mid;
    //        int[] left = new int[n1];
    //        int[] right = new int[n2];
    //        int i,j,k;
    //        for( i=0;i<n1;i++){
    //            left[i] = arr[l+i];
    //        }
    //        for(j=0;j<n2;j++){
    //            right[j] = arr[mid+1+j];
    //        }
    //         i = 0;
    //         j = 0;
    //         k = l;
    //        while(i < n1 && j < n2){
    //            if(left[i] <= right[j]) {
    //                arr[k++] = left[i++];
    //            }else
    //                 arr[k++] = right[j++];
    //            }
    //            while(i < n1){
    //                arr[k++] = left[i++];
    //            }
    //            while(j < n2){
    //                arr[k++] = right[j++];
    //            }
    //        }
    //
    //    static void mergeSort(int[] arr, int l, int r){
    //        if(l >= r) return;
    //        int mid = (l + r)/2;
    //        mergeSort(arr,l,mid);
    //        mergeSort(arr,mid+1,r);
    //        merge(arr,l,mid,r);
    //    }

    // Method 2
    public static void merge(int[] a,int[] b,int[] arr){
        int i=0,j=0,k=0;
        while(i<a.length && j<b.length){
            if(a[i] <= b[j]){
                arr[k++] = a[i++];
            }
            else {
                arr[k++] = b[j++];
            }
        }
        while(j< b.length) arr[k++] = b[j++];
        while(i< a.length) arr[k++] = a[i++];
    }
    public static void mergeSort(int[] arr){
        int n = arr.length;
        if(n==1) return;
        int[] a = new int[n/2];
        int[] b = new int[n-n/2];
        for(int i=0;i<n/2;i++){
            a[i] = arr[i];
        }
        for(int i=0;i<n-n/2;i++){
            b[i] = arr[i+n/2];
        }
        mergeSort(a);
        mergeSort(b);
        merge(a,b,arr);
        a=null;b=null;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("The array elements : ");
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Array before sorting : ");
        display(arr);
      //  mergeSort(arr,0,n-1);
        mergeSort(arr);
        System.out.println("Array After sorting : ");
        display(arr);
    }
}

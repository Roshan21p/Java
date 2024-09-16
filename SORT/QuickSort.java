package SORT;

import java.util.Scanner;

public class QuickSort {
    static void displayArr(int[] arr){
        for(int i=0;i< arr.length;i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    static void swap(int[] arr,int i,int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    static int partition(int[] arr,int st,int end){
//        int pivot = arr[st];
          int cnt = 0;
//        for(int i = st+1;i <= end;i++){
//            if(arr[i] <= pivot) cnt++;
//        }
        //Randomized quick sort
        int mid = (st+end)/2;
        int pivot = arr[mid];
        for(int i = st;i <= end;i++){
            if(i==mid) continue;
            if(arr[i] <= pivot) cnt++;
        }
        int pivotIdx = st + cnt;
        swap(arr,mid,pivotIdx);
       // swap(arr,st,pivotIdx);
        int i = st, j = end;
        while(i < pivotIdx && j > pivotIdx){
            while(arr[i] <= pivot) i++;
            while(arr[j] > pivot) j--;
            if(i < pivotIdx && j > pivotIdx){
                swap(arr,i,j);
                i++;
                j--;
            }
        }
        return pivotIdx;
    }
    static void quicksort(int[] arr,int st,int end){
        if(st >= end) return;
        int pi = partition(arr,st,end);
        quicksort(arr,st,pi-1);
        quicksort(arr,pi+1,end);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the array elements");
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Array before Sorting");
        displayArr(arr);
        quicksort(arr,0,n-1);
        System.out.println("Array after Sorting");
        displayArr(arr);
    }
}

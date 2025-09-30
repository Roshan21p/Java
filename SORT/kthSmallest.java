package SORT;

import java.util.Scanner;

public class kthSmallest {
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
        int pivot = arr[st];
        int cnt = 0;
        for(int i = st+1;i <= end;i++){
            if(arr[i] <= pivot) cnt++;
        }
        int pivotIdx = st + cnt;
        swap(arr,st,pivotIdx);
        // swap(arr,st,pivotIdx);
        int i = st, j = end;
        while(i < pivotIdx && j > pivotIdx){
            while(arr[i] <= pivotIdx) i++;
            while(arr[j] > pivotIdx) j--;
            if(i < pivotIdx && j > pivotIdx){
                swap(arr,i,j);
                i++;
                j--;
            }
        }
        return pivotIdx;
    }
    static void quickselect(int[] arr,int st,int end,int k){
        int n = arr.length;
        if(st > end) return;
        if(st==end){
            System.out.println("Kth smallest element : "+arr[k-1]);
            return;
        }
        int pi = partition(arr,st,end);
        if(k-1==pi) {
            System.out.println("Kth smallest element : "+arr[k-1]);
            return;
        } else if(k-1<pi) quickselect(arr,st,pi-1,k);
        else quickselect(arr,pi+1,end,k);
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
        System.out.println("Enter the kth smallest element :");
        int k = sc.nextInt();
        System.out.println("Array elements");
        displayArr(arr);
        quickselect(arr,0,n-1,k);
    }
}

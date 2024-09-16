package SORT;

public class inversionCount {

    static int count = 0;
    static void displayArr(int[] arr){
        for(int i=0;i< arr.length;i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void merge(int[] a,int[] b,int[] arr){
        int i=0,j=0,k=0;
        while(i<a.length && j<b.length){
            if(a[i] <= b[j]) {
                arr[k++] = a[i++];
            }
            else{ // a[i] > b[j]
              //  count += (a.length-i);
                arr[k++] = b[j++];
            }
        }
        while(j< b.length) arr[k++] = b[j++];
        while(i< a.length) arr[k++] = a[i++];
    }
    public static void inversionCount(int[] a,int[] b){
        int i=0,j=0;
        while(i< a.length && j< b.length){
            if(a[i] > b[j]){
                count += (a.length-i);
                j++;
            }
            else i++;
        }
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
        inversionCount(a,b);
        merge(a,b,arr);
    }
    public static void main(String[] args) {
        int[] arr = {8,2,5,3,1,4};
        displayArr(arr);
        mergeSort(arr);
        displayArr(arr);
        System.out.println("Inversion Count : "+count);
    }
}

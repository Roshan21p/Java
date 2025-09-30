package ARRAY;

public class MergedTwoSortedArray {
    public static void main(String[] args) {
        int[] a = {11,33,42,71};
        int[] b = {26,54,69,81};

        int n = a.length, m = b.length;

        int i=0,j=0,k=0;

        int[] ans = new int[n+m];

        while(i<n && j<m){
            if(a[i]>b[j]){
                ans[k++] = b[j++];
            } else {
                ans[k++]= a[i++];
            }
        }

        while(i<n) ans[k++] = a[i++];
        while(j<m) ans[k++] = b[j++];

        for(int ele : ans){
            System.out.print(ele+" ");
        }
    }
}

package BinarySearch;
//Given an array arr[], where arr[i] represents the number of pages in the i-th book,
// and an integer k denoting the total number of students,allocate all books to the students such that:
//
//        Each student gets at least one book.
//        Books are allocated in a contiguous sequence.
//        The maximum number of pages assigned to any student is minimized.
//        If it is not possible to allocate all books among k students under these conditions, return -1.
public class AllocateMinimumPages {
    public static boolean isValid(int[] arr,int maximumPagesAllowed,int k){
        int student = 1, pages = 0;
        for(int i=0;i<arr.length;i++){
            if(arr[i] > maximumPagesAllowed) return false;
            if(arr[i] + pages <= maximumPagesAllowed) pages += arr[i];
            else {
                student++;
                pages = arr[i];
            }
        }
        return student <= k ? true : false;
    }
    public static int findPages(int[] arr, int k) {
        // code here
        int n = arr.length;

        if(k>n) return -1;

        int sum = 0;
        int max = -1;
        for(int i=0;i<n;i++){
            sum += arr[i];
            max = Math.max(arr[i],max);
        }


//        for(int i=max;i<=sum;i++){   // Time -> n * (sum-max+1)
//            if(isValid(arr,i,k)) return i;
//        }
        int low = max, high = sum;

        int ans = 0;
        while(low<=high){
            int mid = low + (high-low)/2;
            if(isValid(arr,mid,k)){
                ans = mid;
                high = mid-1;
            } else low = mid + 1;
        }
        return ans;
    }
    public static void main(String[] args) {
        int arr[] = {12, 34, 67, 90};
        int k = 2;

        System.out.println("Minimum number of pages "+findPages(arr,k));
    }
}

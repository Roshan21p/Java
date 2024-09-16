package Heaps;

import java.util.Collections;
import java.util.PriorityQueue;

public class kthSmallestElement {

    public static void main(String[] args) {
        //Method 1 : Using MinHeap
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        int[] arr = {10,2,8,3,-6,-2,9,-12};
        int k = 2;
        for(int ele : arr){
            pq.add(ele);
        }
        for(int i=0;i<k-1;i++){
            pq.remove();
        }
        System.out.println(pq.peek());
        // Method 2 : Using MaxHeap
        PriorityQueue<Integer> pq1 = new PriorityQueue<>(Collections.reverseOrder());
        int[] arr1 = {10,2,8,3,-6,-2,9,-12};
        for(int ele : arr1){
            pq1.add(ele);
            if(pq1.size()>k) pq1.remove();
        }
        System.out.println(pq1.peek());
    }
}

package Heaps;

import java.util.Collections;
import java.util.PriorityQueue;

public class basicHeap {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();   //MinHeap
        pq.add(2);
        System.out.println(pq);
        pq.add(10);
        System.out.println(pq);
        pq.add(1);
        System.out.println(pq);
        pq.add(0);
        System.out.println(pq);
        pq.remove();
        System.out.println(pq);
        pq.add(-1);
        System.out.println(pq.peek());
        System.out.println(pq.size());

        // MaxHeap
        PriorityQueue<Integer> pq1 = new PriorityQueue<>(Collections.reverseOrder());
        pq1.add(2);
        System.out.println(pq1);
        pq1.add(10);
        System.out.println(pq1);
        pq1.add(1);
        System.out.println(pq1);
        pq1.add(0);
        System.out.println(pq1);
        pq1.remove();
        System.out.println(pq1);
        pq1.add(-1);
        System.out.println(pq1.peek());
        System.out.println(pq1);
        System.out.println(pq1.size());
    }
}

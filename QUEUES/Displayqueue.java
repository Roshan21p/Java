package QUEUES;


import java.util.*;

public class Displayqueue {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        // rear -> 5 4 3 2 1 -> front
        Queue<Integer> h = new LinkedList<>();
        while(q.size()>0){
            System.out.print(q.peek()+ " ");
            h.add(q.poll());
        }
        while(h.size() > 0){
            q.add(h.poll());
        }
    }
}
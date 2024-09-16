package LINKEDLIST;

public class NthNodeEnd {
    public static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }
//    public static Node nthNode(Node head,int n){ // O(n)
//        int size = 0;
//        Node temp = head;
//        while(temp!=null){
//            size++;
//            temp = temp.next;
//        }
//        int m = size - n +1;
//        //mth node from start
//        temp = head;
//        for(int i=0;i<m-1;i++){
//            temp = temp.next;
//        }
//        return temp;
//    }
    public static Node nthNode1(Node head,int n){
        Node slow = head;
        Node fast = head;
        for(int i=0;i<n;i++){
            fast = fast.next;
        }
        while(fast!=null){
            slow = slow.next;
            fast = fast.next;
        }
        return slow;
    }
    public static void display(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Node a = new Node(100);
        Node b = new Node(13);
        Node c = new Node(4);
        Node d = new Node(5);
        Node e = new Node(12);
        Node f = new Node(10);
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = f;
        Node temp = nthNode1(a,4);
        System.out.println(temp.data);
        display(a);
    }
}

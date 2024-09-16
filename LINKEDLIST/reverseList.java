package LINKEDLIST;

public class reverseList {
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data  = data;
        }
    }
    public static Node reverse(Node head){
        if(head.next == null) return head;
        Node newHead = reverse(head.next);
        head.next.next = head; // Interchanging the connections
        head.next = null;
        return newHead;
    }
    public static void display(Node head){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
    
    public static void main(String[] args) {
       Node a = new Node(100);
       Node b = new Node(13);
       Node c =  new Node(5);
       Node d = new Node(6);
       Node e = new Node(12);
       Node f = new Node(10);
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = f;
        display(a);
        a = reverse(a);
        display(a);
    }
}

package LINKEDLIST;

public class deletenthNodeEnd {
    public static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }
    public static Node deleteNthNodeEnd(Node head,int n) {
        Node slow = head;
        Node fast = head;
        if(n<=0){
            System.out.println("Wrong input");
            return head;
        }
        for (int i = 0; i < n; i++) fast = fast.next;

        if(fast == null) {
            head = head.next;
            return head;
        }
        while (fast.next != null) {
            slow = slow.next;
            fast = fast.next;
        }
        slow.next = slow.next.next;
        return head;
    }
    public static int MiddleLeft(Node head){
        Node slow = head;
        Node fast = head;
        while(fast.next.next!=null && fast!=null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow.data;
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
        display(a);
     //  a = deleteNthNodeEnd(a,2);
        System.out.println(MiddleLeft(a));
        display(a);
    }
}

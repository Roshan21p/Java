package LINKEDLIST;

public class DoublyLL {
    public static class Node {
        int val;
        Node next; // null
        Node prev; // null

        Node(int val) {
            this.val = val;
        }
    }
    public static Node insertAtStart(Node head,int val){
        Node temp = new Node(val);
        temp.next = head;
        head.prev = temp;
        head = temp;
        return head;
    }
    public static void insetAtTail(Node head,int val){
        Node temp = head;
        while(temp.next != null){
            temp = temp.next;
        }
        Node t = new Node(val);
        temp.next = t;
        t.prev = temp;
    }

    public static void display(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
        System.out.println();
    }
    public static void displayrev(Node tail) {
        Node temp = tail;
        while (temp != null) {
            System.out.print(temp.val + " ");
            temp = temp.prev;
        }
        System.out.println();
    }
    public static void display2(Node random) {
        Node temp = random;
        //move this temp backwards to the head
        while (temp.prev != null) {
            temp = temp.prev;
        }
        // Now temp is at head
        // print the list
        while (temp != null) {
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
        System.out.println();
    }


    public static void main(String[] args) {
        Node a = new Node(4);
        Node b = new Node(10);
        Node c = new Node(2);
        Node d = new Node(99);
        Node e = new Node(13);
        a.next = b;
        b.prev = a;
        b.next = c;
        c.prev = b;
        c.next = d;
        d.prev = c;
        d.next = e;
        e.prev = d;
//        display(a);
//        displayrev(e);
//        display2(c);
        Node newHead = insertAtStart(a,30);
       // display(insertAtStart(a,30));
        display(newHead);
        display(a);
        insetAtTail(newHead,19);
        display(a);
    }
}


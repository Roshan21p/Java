package LINKEDLIST;

public class BasicsLL {
    public static class Node {
        int data; //value
        Node next; // address of next node

        Node(int data) {
            this.data = data;
        }
    }
    public static void insertAtEnd(Node head, int val) {
        Node temp = new Node(val);
        Node t = head;
        while (t.next != null) {
            t = t.next;
        }
        t.next = temp;
    }

    public static int length(Node head) {
        int count = 0;
        while (head != null) {
            count++;
            head = head.next;
        }
        return count;
    }

    public static void display(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }

    public static void displayrecur(Node head) {
        if (head == null) return;
        displayrecur(head.next);
        System.out.print(head.data + " ");
    }


    public static void main(String[] args) {
        Node a = new Node(5);  // head node
        Node b = new Node(3);
        Node c = new Node(9);
        Node d = new Node(8);
        Node e = new Node(16);
        // 5 3 9 8 16
        a.next = b; // 5 -> 3  9 8 16
        b.next = c; // 5 -> 3 -> 9 8 16
        c.next = d; // 5 -> 3 -> 9 -> 8 16
        d.next = e; // 5 -> 3 -> 9 -> 8 -> 16
//        System.out.println(a.next.data);
//        System.out.println(a.data);
//        System.out.println(a.next.next.data);
        Node temp = a;
//        for(int i=1;i<=5;i++){
//            System.out.print(temp.data+" ");
//            temp = temp.next;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
      //  display(a);
        System.out.println();
      //  displayrecur(a);
        System.out.println();
      //  System.out.println("LENGTH IS : " + length(a));
        insertAtEnd(a, 57);
        display(a);
    }
}

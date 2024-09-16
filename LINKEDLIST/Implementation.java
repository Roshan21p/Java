package LINKEDLIST;

public class Implementation {
    public static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    public  static class linkedlist {
        Node head = null;
        Node tail = null;
        int size = 0;

        void insertAtEnd(int val) {
            Node temp = new Node(val);
            if (head == null) {
                head = temp;
            } else {
                tail.next = temp;
            }
            tail = temp;
            size++;
        }

        void insertAtStart(int val) {
            Node temp = new Node(val);
            if (head == null) {  // empty list
                head = tail = temp;
            } else { // non empty list
                temp.next = head;
                head = temp;
            }
            size++;
        }

        void insertAt(int idx, int val) {
            Node t = new Node(val);
            Node temp = head;
            if (idx == size) {
                insertAtEnd(val);
                return;
            } else if (idx == 0) {
                insertAtStart(val);
                return;
            } else if (idx < 0 || idx > size) {
                System.out.println("Wrong Input");
            }
            for (int i = 1; i <= idx - 1; i++) {
                temp = temp.next;
            }
            t.next = temp.next;
            temp.next = t;
            size++;
        }

        int getAt(int idx) {
            Node temp = head;
            for (int i = 0; i < idx; i++) {
                temp = temp.next;
            }
            return temp.data;
        }

        void deleteAtHead() throws Error{
            if(head==null) throw new Error("List is Empty");
            head = head.next;
            size--;
        }
        void deleteAt(int idx) {
            Node temp = head;
            if (idx == 0) {
                head = head.next;
                size--;
                return;
            }
            for (int i = 1; i <= idx - 1; i++) {
                temp = temp.next;
            }
            temp.next = temp.next.next;
            tail = temp;
            size--;
        }

        void display() {
            Node temp = head;
            while (temp != null) {
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
            System.out.println();
        }
//        int size(){  O(n)
//            Node temp = head;
//            int count = 0;
//            while(temp != null){
//                 count++;
//                temp = temp.next;
//            }
//            return count;
//        }
    }

    public static void main(String[] args) {
        linkedlist ll = new linkedlist();
        ll.insertAtStart(2);
        // ll.display();// 2 -> 4 -> 5 -> 12
        ll.insertAtEnd(4);
        //ll.display();
        ll.insertAtEnd(5); // 4 -> 5
        // ll.display();
        // System.out.println(ll.size());
        ll.insertAtEnd(12); // 4 -> 5 -> 12
        //  ll.display();
        ll.insertAt(0, 13);
        ll.display();
        ll.deleteAt(0);
        ll.display();
        ll.deleteAt(3);
        ll.display();
        System.out.println(ll.tail.data);
        // System.out.println(ll.tail.data);
        // System.out.println(ll.getAt(3));
        System.out.println(ll.size);
    }
}

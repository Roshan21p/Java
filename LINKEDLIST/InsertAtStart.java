package LINKEDLIST;

public class InsertAtStart {
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
        }
    }
    public static class linkedlist{
        Node head = null;
        Node tail = null;
        void insertAtStart(int val){
            Node temp = new Node(val);
            if(head == null){  // empty list
                head = tail = temp;
            }
            else { // non empty list
               temp.next = head;
               head = temp;
            }
        }
        void display(){
        Node temp = head;
            while(temp != null){
                System.out.print(temp.data+ " ");
                temp = temp.next;
            }
            System.out.println();
        }
        int size(){
            Node temp = head;
            int count = 0;
            while(temp != null){
                count++;
                temp = temp.next;
            }
            return count;
        }
    }
    public static void main(String[] args) {
        linkedlist ll = new linkedlist();
        ll.insertAtStart(3);
        ll.display();
        ll.insertAtStart(4); // 4 -> 3
         ll.display();
        System.out.println(ll.size());
      //  System.out.println();
        ll.insertAtStart(12);
        ll.display(); // 12 -> 4 -> 3
    }
}

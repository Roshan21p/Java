package LINKEDLIST;

public class doublyImplementation {
    public static class Node{
        int data;
        Node prev;
        Node next;
        Node(int data){
            this.data = data;
        }
    }
    public static class doublyLL {
        Node head = null;
        Node tail = null;
        int size = 0;
        void insertAtStart(int val){
            Node temp = new Node(val);
            if(head == null || size == 0) head = tail = temp;
            else {
                temp.next = head;
                head.prev = temp;
                head = temp;
            }
            size++;
        }
        void insertAtTail(int val){
            Node temp = new Node(val);
            if(size==0) head = tail = temp;
            else {
                tail.next = temp;
                temp.prev = tail;
                tail = temp;
            }
            size++;
        }

        void insertAt(int val , int idx){
            if(idx==0 || size == 0){
                insertAtStart(val);
                return;
            }
            else if(size == idx){
                insertAtTail(val);
                return;
            }
            else if(size < idx || idx < 0){
                System.out.println("Wrong Input");
                return;
            }
            else {
                Node temp = new Node(val);
                Node x = head;
                for(int i=1;i<=idx-1;i++){
                    x = x.next;
                }
                Node y = x.next;
                x.next = temp;
                temp.prev = x;
                temp.next = y;
                y.prev = temp;
            }
            size++;
        }

        void deleteHead() throws Error{
            if(head==null) throw new Error("List is empty");
            head = head.next;
            head.prev = null;
            size--;
        }
        void deleteTail() throws Error{
            if(size==0) throw new Error("List is empty");
            tail = tail.prev;
            tail.next = null;
            size--;
        }

        void delete(int idx){
            if(idx==0) {
                deleteHead();
                return;
            }
            else if(idx==size-1){
                deleteTail();
                return;
            }
            else if(idx<0 || idx>=size)
                throw new Error("Invalid Index");
            else {
                Node temp = head;
                for(int i=1;i<=idx-1;i++){
                    temp = temp.next;
                }
                temp.next = temp.next.next;
                temp = temp.next;
                temp.prev = temp.prev.prev;
            }
            size--;
        }
        void display(){
            Node temp = head;
            while(temp != null){
                System.out.print(temp.data+ " ");
                temp = temp.next;
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        doublyLL ll = new doublyLL();
        ll.insertAtStart(10);
        ll.insertAtStart(20);
        ll.insertAtTail(30);
        ll.insertAtTail(40);
        ll.display();
        System.out.println(ll.size);
        ll.insertAt(50,2);
        ll.insertAt(50,5);
        ll.insertAt(10,0);
        ll.display();
        ll.deleteHead();
        //ll.delete(5);
        ll.display();
    }
}

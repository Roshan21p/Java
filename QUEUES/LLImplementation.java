package QUEUES;
class Node{
    int val;
    Node next;
    Node(int val) {
        this.val= val;
    }
}
class queueLL{
    Node head = null;
    Node tail = null;
    int size = 0;
    void add(int x){
        Node temp = new Node(x);
        if(size == 0){
            head = tail = temp;
        }
        else {
            tail.next = temp;
            tail = temp;
        }
        size++;
    }
    int remove(){
        if(size == 0){
            System.out.println("Queue is Empty!");
            return -1;
        }
        int x = head.val;
        head = head.next;
        size--;
        return x;
    }
    int peek(){
        if(size == 0){
            System.out.println("Queue is Empty!");
            return -1;
        }
        return head.val;
    }
    void display(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.val+" ");
            temp = temp.next;
        }
        System.out.println();
    }
    boolean isEmpty(){
        if(size == 0) return true;
        return false;
    }
}
public class LLImplementation {
    public static void main(String[] args) {
        queueLL q = new queueLL();
        q.display();
        System.out.println(q.isEmpty());
        q.add(1);
        q.add(2);
        q.display();
        System.out.println(q.isEmpty());
        q.add(3);
        q.add(5);
        q.display();
        q.remove();
        q.display();
        System.out.println(q.size);
    }
}


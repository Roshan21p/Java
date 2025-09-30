package QUEUES;

public class CircularQueueLL {

        public class Node {
            int val;
            Node next;

            Node(int val) {
                this.val = val;
            }
        }

        private Node front;
        private Node rear;
        private int size;

      public  void enqueue(int val) {
        Node temp = new Node(val);
        if(isEmpty()){
            front = rear = temp;
            rear.next = front;
        } else {
            rear.next = temp;
            rear = temp;
            rear.next = front;
        }
        size++;
    }

    public int dequeue(){
        if (isEmpty()) {
            System.out.println("Queue is empty!");
            return -1;
        }
        int removed = front.val;
        if(front==rear){
            front = rear = null;   // Only one node in the queue
        } else {
            front = front.next;
            rear.next = front;
        }
        size--;
        return removed;
    }

    public int peek(){
        if(isEmpty()){
            System.out.println("Queue is empty!");
            return -1;
        }
        return front.val;
    }

    public boolean isEmpty() {
        return front == null;
    }

    public int size() {
        return size;
    }

    public void display(){
        if (isEmpty()) {
            System.out.println("Queue is empty!");
            return;
        }
        Node temp = front;
        do{
            System.out.print(temp.val+" ");
            temp = temp.next;
        }
        while(temp != front);
        System.out.println();
    }


    public static void main(String[] args) {
        CircularQueueLL q = new CircularQueueLL();

        q.enqueue(10);
       q.display(); // Queue: 10 20 30 40 50

        q.enqueue(20);
        q.enqueue(30);
        q.enqueue(40);
        q.enqueue(50);
        q.display(); // Queue: 10 20 30 40 50

        q.dequeue();
        q.dequeue();
        q.display(); // Queue: 30 40 50

        q.enqueue(60);
        q.enqueue(70);
        q.display(); // Queue: 30 40 50 60 70

        System.out.println("Peek: " + q.peek()); // 30
        System.out.println("Size: " + q.size()); // 5
    }
}

package QUEUES;


 class CircularQueue {

    private int[] arr;
    private int front;
   private int rear;
    private int size;
   private int capacity;
    public CircularQueue(int capacity) {
        this.capacity = capacity;
        this.arr = new int[capacity];
        this.front = 0;
        this.rear = -1;
        this.size = 0;
    }

    public void enqueue(int val) throws Exception {
        if(isFull()){
            throw new Exception("Queue is Empty");
        }
        rear = (rear+1)%capacity;
        arr[rear] = val;
        size++;
    }

    public int dequeue() throws Exception {
        if(isEmpty()){
            throw new Exception("Queue is Empty");
        }
        int removed = arr[front];
        front = (front+1)%capacity;
        size--;
        return removed;
    }

    public int peek() throws Exception {
        if(isEmpty()){
            throw new Exception("Queuw is empty");
        }
        return arr[front];
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean isFull() {
        return size == capacity;
    }

    public int size() {
        return size;
    }

    public void display() throws Exception {
        if(isEmpty()){
            throw new Exception("Queue is Empty");
        }
        for(int i=0;i<size;i++){
            System.out.print(arr[(front+i)%capacity]+" ");
        }
        System.out.println();
    }
}

public class CircularQueueArray {


    public static void main(String[] args) throws Exception {
        CircularQueue q = new CircularQueue(5);

        q.enqueue(10);
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
        System.out.println("Is full? " + q.isFull()); // true
        System.out.println("Size: " + q.size()); // 5
    }
}
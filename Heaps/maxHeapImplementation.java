package Heaps;

class maxHeap{
    int[] arr;
    int size;
    maxHeap(int capacity){
        arr = new int[capacity];
    }
    public void add(int num) throws Exception{
        if(size== arr.length) throw new Exception("Heap is Full!");
        arr[size++] = num;
        upheapify(size-1);
    }
    public int remove() throws Exception{
        if(size==0) throw new Exception("Heap is Empty!");
        int peek = arr[0];
        swap(0,size-1);
        size--;
        downHeapify(0);
        return peek;
    }
    public void upheapify(int idx) {
        if (idx == 0) return;
        int parent = (idx - 1) / 2;
        if (arr[idx] > arr[parent]) {
            swap(idx, parent);
            upheapify(parent);
        }
    }
    public void downHeapify(int idx){
        if(idx>=size-1) return;
        int lc = 2*idx+1, rc = 2*idx+2;
        int maxIdx = idx;
        if(lc<size && arr[lc] > arr[maxIdx]) maxIdx = lc;
        if(rc<size && arr[rc] > arr[maxIdx]) maxIdx = rc;
        if(idx==maxIdx) return;
        swap(idx,maxIdx);
        downHeapify(maxIdx);
    }
    public void swap(int i,int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public int size() throws Exception{
        if(size==0) throw new Exception("Heap is Empty!");
        return size;
    }
    public int peek() throws Exception{
        if(size==0) throw new Exception("Heap is Empty!");
        return arr[0];
    }
}
public class maxHeapImplementation {
    public static void main(String[] args) throws Exception {
    maxHeap pq = new maxHeap(10);
        pq.add(1);
        pq.add(6);
        pq.add(2);
        System.out.println(pq.peek());
        System.out.println(pq.remove());
        System.out.println(pq.peek());
        pq.add(20);
        System.out.println(pq.peek()+" "+ pq.size());
    }
}

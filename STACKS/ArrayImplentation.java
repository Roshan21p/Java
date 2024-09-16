package STACKS;


public class ArrayImplentation {
    public static class Stack{
        private int[] arr = new int[5];
        private int idx = 0;
        void push(int x){
            if(isFull()){
                System.out.println("Stack is Full");
                return;
            }
            arr[idx] = x;
            idx++;
        }
        int peek(){
            if(idx == 0){
                System.out.println("Stack is Empty!");
                return -1;
            }
            return arr[idx-1];
        }
       int pop(){
            if(idx == 0){
                System.out.println("Stack is Empty!");
                return -1;
            }
            int top = arr[idx-1];
            //arr[idx-1] = 0;
            idx--;
            return top;
        }
        void display(){
            for(int i=0;i<idx;i++){
                System.out.print(arr[i]+ " ");
            }
            System.out.println();
        }
        int size(){
            return idx;
        }
        boolean isEmpty(){
            if(idx == 0) return true;
            return false;
        }
        boolean isFull(){
            if(idx == arr.length) return true;
            return false;
        }
        int capacity(){
            return arr.length;
        }
    }
    public static void main(String[] args) {
        Stack st = new Stack();
        st.push(4);
        st.display(); // 4
        st.push(5);
        st.display(); // 4 5
        st.push(1);
        st.display(); // 4 5 1
        System.out.print("The peek value is : " +st.peek());
       System.out.println(st.size());
       st.pop();
        st.display(); // 4 5
//        System.out.println(st.size());
//        st.push(67);
//        st.push(12);
//        st.push(9);
//        System.out.println(st.isFull());
//        st.push(8);
//        System.out.println(st.capacity());
//        System.out.println(st.isEmpty());
//        st.pop();
//        st.pop();
//        st.pop();
//        st.pop();
//        st.pop();
//        st.display();
//        System.out.println(st.isEmpty());
        //st.pop();
    }
}

package STACKS;

public class LLImplementation {
    public static class Node { //user defined data type
        int val;
        Node next;

        Node(int val) {
            this.val = val;
        }
    }
        public static class LLStack{ //user defined data structure
            Node head = null;
            int size = 0;
            void push(int x){
                Node temp = new Node(x);
                temp.next = head;
                head = temp;
                size++;
            }
            int pop(){
                if(head==null){
                    System.out.println("Stack is Empty!");
                    return -1;
                }
                int x = head.val;
                head = head.next;
                return x;
            }
            int peek(){
                if(head==null){
                    System.out.println("Stack is Empty!");
                    return -1;
                }
                return head.val;
            }
            void displayRec(Node h){
                if(h == null) return ;
                displayRec(h.next);
                System.out.print(h.val+" ");
            }
            void display(){
               // displayRec(head);

                Node temp = head;
                while(temp != null){
                    System.out.println(temp.val+" ");
                    temp = temp.next;
                }
                System.out.println();
            }
            int size(){
                return size++;
            }
            boolean isEmpty(){
                if(size==0) return true;
                return false;
            }
        }
    public static void main(String[] args) {
        LLStack st = new LLStack();
        st.push(4);
       st.display(); // 4
        st.push(5);
       st.display(); // 4 5
        st.push(1);
        st.display(); // 4 5 1
      System.out.println("The peek value is : " +st.peek());
        System.out.println(st.size());
        st.pop();
        st.pop();
        st.display(); // 4 5
//        System.out.println(st.size());
//        st.push(67);
//        st.push(12);
//        st.push(9);
//      //  System.out.println(st.isFull());
//        st.push(8);
//     //   System.out.println(st.capacity());
//        System.out.println(st.isEmpty());
//        st.pop();
//        st.pop();
//        st.pop();
//        st.pop();
//        st.pop();
//        st.display();
//        System.out.println(st.isEmpty());
//        //st.pop();

    }
}

package LINKEDLIST;
import java.util.*;
public class practice {
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
        }
    }
    public static class linkedlist {
        Node head = null;
        Node tail = null;
        int size = 0;
        void insertAtEnd(int val){
            Node temp = new Node(val);
            if(head == null){
                head = temp;
            } else {
                tail.next = temp;
            }
            tail = temp;
            size++;
        }
        void insertAtStart(int val){
            Node temp = new Node(val);
            if(head == null){
                head = tail = temp;
            } else {
                temp.next = head;
                head = temp;
            }
            size++;
        }
        void insertAt(int idx,int val){
            Node t = new Node(val);
            Node temp = head;
            if(idx < 0 || size < idx){
                System.out.println("Wrong input");
               return ;
            } else if(idx == 0) {
                insertAtStart(val);
                return ;
            } else if(idx == size){
                 insertAtEnd(val);
                 return;
            }
            for(int i=0;i<idx-1;i++){
                temp = temp.next;
            }
            t.next = temp.next;
            temp.next = t;
            size++;
        }
        void deleteAt(int idx){
            Node temp = head;
            if(idx<0 || idx>size){
                System.out.println("wrong input");
            } else if(idx==0) {
                head = head.next;
                size--;
                return;
            } else if(idx == size-1){
                for(int i=0;i<idx-1;i++) temp = temp.next;
                temp.next = temp.next.next;
                tail = temp;
                size--;
                return;
            }
            else {
                for(int i=0;i<idx-1;i++) temp = temp.next;
                temp.next = temp.next.next;
                size--;
            }
        }
        int getAt(int idx){
            Node temp = head;
            for(int i=0;i<idx;i++){
                temp = temp.next;
            }
            return temp.data;
        }
        void display() {
            Node temp = head;
            while (temp != null) {
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
       linkedlist ll = new linkedlist();
       ll.insertAtEnd(4);
       ll.insertAtEnd(5);
       ll.display();
       ll.insertAtStart(1);
       ll.display();
        System.out.println(ll.getAt(2));
        ll.insertAt(0,3);
        ll.display();
        ll.insertAt(4,6);
        ll.display();
        System.out.println(ll.tail.data);
    }
}

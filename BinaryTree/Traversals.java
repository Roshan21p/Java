package BinaryTree;

import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;

public class Traversals {
    public static class  Pair{
        Node node;
        int level;
        Pair(Node node,int level){
            this.node=node;
            this.level=level;
        }
    }
    private static void preOrder(Node root){  // Root L R
        if(root==null) return;
        System.out.print(root.val+" ");
        preOrder(root.left);
        preOrder(root.right);
    }
    private static void inOrder(Node root){ //L Root R
        if(root==null) return;
        inOrder(root.left);
        System.out.print(root.val+" ");
        inOrder(root.right);

    }
    private static void postOrder(Node root){ // L R Root
        if(root==null) return;
        postOrder(root.left);
        postOrder(root.right);
        System.out.print(root.val+" ");
    }
//    private static void queueLevel(Node root){
//        Queue<Node> q = new LinkedList<>();
//        //Pair t= new Pair(root,0);
//        if(root != null) q.add(root);
//        System.out.println(q.size());
//        while(q.size() > 0){
//            Node front = q.remove();
//            System.out.print(front.val+" ");
//            if(front.left != null) q.add(front.left);
//            if(front.right != null) q.add(front.right);
//        }
//    }
    private static void queueLevel(Node root){
        int prevLevel = 0;
        Queue<Pair> q = new LinkedList<>();
        //Pair t= new Pair(root,0);
        if(root != null) q.add(new Pair(root,0));
        while(q.size() > 0) {
            Pair front = q.remove();
            Node temp = front.node;
            int level = front.level;
            if (level != prevLevel) {
                System.out.println();
                prevLevel++;
            }
            System.out.print(temp.val + " ");
            if (temp.left != null) q.add(new Pair(temp.left, level + 1));
            if (temp.right != null) q.add(new Pair(temp.right, level + 1));
        }
    }

    private static void nThLevel(Node root,int level,int n){
        if(root==null) return;
        if(level==n) System.out.print(root.val+" ");
        nThLevel(root.left,level+1,n);
        nThLevel(root.right,level+1,n);
    }
    public static void main(String[] args) {
        Node a = new Node(1); // a is the root
        Node b = new Node(2);
        Node c = new Node(3);
        Node d = new Node(4);
        Node e = new Node(5);
        Node f = new Node(6);
        Node g = new Node(7);
        Node h = new Node(8);

        a.left = b ; a.right = c;
        b.left = d; b.right = e;
        c.left = f; c.right = g;
        d.left = h;
        System.out.print("Pre-Order traversal is : ");
        preOrder(a);
        System.out.println();
        System.out.print("In-Order traversal is : ");
        inOrder(a);
        System.out.println();
        System.out.print("Post-Order traversal is : ");
        postOrder(a);
        System.out.println();
        System.out.println("Level order Traversal using Queue is : ");
        queueLevel(a);
        System.out.println();
        System.out.println("Display nTh level node : ");
        for(int x=0;x<4;x++){
            nThLevel(a,0,x);
            System.out.println();
        }
    }
}

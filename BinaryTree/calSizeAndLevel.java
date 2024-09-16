package BinaryTree;
class Node {
    int val;
    Node left;
    Node right;
    Node (int val){
        this.val = val;
    }
}
public class calSizeAndLevel {
    private static int size(Node root){
        if(root==null) return 0;
        return 1 + size(root.left) + size(root.right);
    }
    private static int level(Node root){
        if(root==null) return 0;
        return 1 + Math.max(level(root.left),level(root.right));
    }
    public static void main(String[] args) {
        Node a = new Node(1); // a is the root
        Node b = new Node(41);
        Node c = new Node(3);
        Node d = new Node(2);
        Node e = new Node(6);
        Node f = new Node(5);
        Node g = new Node(10);
        Node h = new Node(20);

        a.left = b ; a.right= c;
        b.left = d; b.right = e; e.right = h;
        c.right = f; c.left = g;
        System.out.println(size(a));
        System.out.println(level(a));
    }
}

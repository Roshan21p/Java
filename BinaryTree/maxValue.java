package BinaryTree;

public class maxValue {
    public static class Node {
        int val;
        Node left;
        Node right;
        Node (int val){
            this.val = val;
        }
    }
    private static void display(Node root){
        if(root==null) return;
        System.out.print(root.val+" ");
        display(root.left);
        display(root.right);
    }
    private static int  maxValue(Node root){
        if(root==null) return 0;
         int ans = Math.max(root.val,Math.max(maxValue(root.left),maxValue(root.right)));
        return ans;
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

        a.left = b ; a.right = c;
        b.left = d; b.right = e; e.right = h;
        c.right = f; c.left = g;
        display(a);
        System.out.println();
        System.out.println(maxValue(a));
    }
}

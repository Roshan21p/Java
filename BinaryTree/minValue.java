package BinaryTree;

public class minValue {
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
    private static int  minValue(Node root){
        if(root==null) return Integer.MAX_VALUE;
        int a = root.val;
        int b = minValue(root.left);
        int c = minValue(root.right);
         int ans = Math.min(a,Math.min(b,c));
        return ans;
    }

    public static void main(String[] args) {
        Node a = new Node(10); // a is the root
        Node b = new Node(7);
        Node c = new Node(14);
        Node d = new Node(3);
        Node e = new Node(8);
        Node f = new Node(11);
        Node g = new Node(21);
        Node h = new Node(9);

        a.left = b ; a.right = c;
        b.left = d; b.right = e; e.right = h;
        c.right = f; c.left = g;
        display(a);
        System.out.println();
        System.out.println(minValue(a));
    }
}

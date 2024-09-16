package BinaryTree;

public class sumTreeNode {
    public static class Node {
        int val;
        Node left;
        Node right;
        Node (int val){
            this.val = val;
        }
    }
    private static int sum(Node root){
        if(root==null) return 0;
        return root.val + sum(root.left) + sum(root.right);
    }
    private static int product(Node root){
        if(root==null || root.val==0
        ) return 1;
        return root.val * product(root.left) * product(root.right);
    }
    public static void main(String[] args) {

        Node a = new Node(1); // a is the root
        Node b = new Node(0);
        Node c = new Node(3);
        Node d = new Node(2);
        Node e = new Node(6);
        Node f = new Node(5);

        a.left = b ; a.right = c;
        b.left = d; b.right = e;
        c.right = f;
        System.out.println(sum(a));
        System.out.println(product(a));
    }
}

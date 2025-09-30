package BinaryTree;

import java.util.*;

public class BuilTree {
    static class Node {
        int val ;
        Node left;
        Node right;

        public Node(int x){
            val = x;
        }
    }


    public static Node buildTree(int[] arr){
        if(arr.length == 0 || arr[0] == -1) return null;

        Queue<Node> q = new LinkedList<>();
        Node root = new Node(arr[0]);
        q.add(root);
        int i=1;
        int n = arr.length;
        while(!q.isEmpty() && i<n){
            Node node = q.poll();

            if(arr[i] != -1){
                node.left = new Node(arr[i]);
                q.add(node.left);
            }
            i++;

            if(i<n && arr[i] != -1){
                node.right = new Node(arr[i]);
                q.add(node.right);
            }
            i++;
        }
        return root;
    }
    public static void postorder(Node root, List<Integer> ans) {
        if (root == null) return;
        postorder(root.left, ans);
        postorder(root.right, ans);
        ans.add(root.val);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of the array : ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter the array elements : ");
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }

        Node root = buildTree(arr);

        List<Integer> ans = new ArrayList<>();
        postorder(root, ans);

        // Print result
        for (int x : ans) {
            System.out.print(x + " ");
        }
    }
}

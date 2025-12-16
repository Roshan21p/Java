package Graph;
import java.util.*;

/**
 * Topological Sorting
 *
 * Topological sorting is a linear ordering of vertices of a directed graph
 * such that for every directed edge u → v, vertex u appears before v in the ordering.
 *
 * Key Properties:
 * - Applies only to Directed Acyclic Graphs (DAGs)
 * - A DAG can have multiple valid topological orderings
 * - Not possible for graphs with cycles
 * - Not applicable to undirected graphs (no direction, no dependency)
 *
 * Implementation:
 * - Can be implemented using:
 *   1) DFS (stack-based approach)
 *   2) BFS using Kahn’s Algorithm (indegree method)
 *
 * Cycle Detection:
 * - If topological sorting is not possible (graph has a cycle),
 *   then the graph is NOT a DAG
 *
 * Applications:
 * - Task scheduling
 * - Course prerequisite problems
 * - Build systems
 * - Dependency resolution
 */


public class TopologicalSort {

    // By dfs and bfs same Time Complexity = O(V + E) Space Complexity = O(V + E)

//    public static void dfs(int i,boolean[] vis,List<List<Integer>> adj,ArrayList<Integer> ans){
//        vis[i] = true;
//        for(int ele : adj.get(i)){
//            if(!vis[ele]) dfs(ele,vis,adj,ans);
//        }
//        ans.add(i);
//    }

    static boolean  hasCycle = false;

    public static void dfs(int node, int[] state, List<List<Integer>> adj, ArrayList<Integer> ans) {
        state[node] = 1; // currently in recursion stack

        for (int neigh : adj.get(node)) {
            if (state[neigh] == 1) {
                // Found a back-edge → cycle exists
                hasCycle = true;
                return;
            }
            if (state[neigh] == 0) {
                dfs(neigh, state, adj, ans);
                if (hasCycle) return;  // stop not explore other nodes
            }
        }

        state[node] = 2;  // processed
        ans.add(node);    // add after children (post-order)
    }


    public static ArrayList<Integer> topoSort(int V, int[][] edges) {
        List<List<Integer>> adj = new ArrayList<>();  // adjacent list

        for(int i=0;i<V;i++){
            List<Integer> list = new ArrayList<>();
            adj.add(list);
        }


        for(int i=0;i<edges.length;i++){
            int a = edges[i][0], b = edges[i][1];
            adj.get(a).add(b);
        }

        int[] state = new int[V];     // 0 = unvisited, 1 = in stack, 2 = done


        ArrayList<Integer> ans = new ArrayList<>();

        for (int i = 0; i < V; i++) {
            if (state[i] == 0) dfs(i, state, adj, ans);
            if (hasCycle) return new ArrayList<>();  // ⛔ cycle → return empty list
        }
        return ans;
    }

    public static void bfs(ArrayList<Integer> ans,int[] indegree,List<List<Integer>> adj){
        // Queue all nodes with indegree 0
        Queue<Integer> q = new LinkedList<>();
        for (int i = 0; i < indegree.length; i++) {
            if (indegree[i] == 0) q.add(i);
        }

        while(q.size()>0){
            int node = q.remove();
            ans.add(node);

            for(int ele: adj.get(node)){
                indegree[ele]--;
                if(indegree[ele]==0){
                    q.add(ele);
                }
            }
        }

        // Step 5: Check for cycle
        if (ans.size() != indegree.length) {
            // Cycle exists → topological sort NOT possible
            ans.clear();
        }

    }
    public static ArrayList<Integer> topoSort1(int V, int[][] edges) {
        List<List<Integer>> adj = new ArrayList<>();  // adjacent list

        for(int i=0;i<V;i++){
            List<Integer> list = new ArrayList<>();
            adj.add(list);
        }

        int[] inDegree = new int[V];

        for(int i=0;i<edges.length;i++){
            int a = edges[i][0], b = edges[i][1];
            adj.get(a).add(b);
            inDegree[b]++;
        }

        ArrayList<Integer> ans = new ArrayList<>();

        // By bfs

        bfs(ans,inDegree,adj);

        return ans;
    }
    public static void main(String[] args) {
        int V = 4;
        int[][] edges = {{3,0},{1,0},{2,0}};
        int V1 = 5;
        int[][] edges1 = {{0,2},{0,1},{2,3},{3,4},{4,2}};
        /*
         output
        [3, 2, 1, 0]
        [1, 2, 3, 0]
        [2, 3, 1, 0]
         */
        ArrayList<Integer> ans = topoSort(V1,edges1);
        Collections.reverse(ans);
        System.out.println("Topological Sort by DFS: "+ans);

        ArrayList<Integer> ans1 = topoSort1(V,edges);
        System.out.println("Topological Sort by BFS: "+ans1);
    }
}

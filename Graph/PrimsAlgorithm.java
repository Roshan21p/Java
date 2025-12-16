package Graph;
import java.util.*;


/**
 * /**
 * Prim’s Algorithm (Minimum Spanning Tree)
 *
 * Prim’s Algorithm is a greedy algorithm used to find the
 * Minimum Spanning Tree (MST) of a weighted, undirected,
 * and connected graph.
 *
 * A Minimum Spanning Tree:
 * - Connects all vertices
 * - Contains no cycles
 * - Has exactly (V - 1) edges
 * - Has minimum possible total edge weight
 *
 * Algorithm Idea:
 * - Start from any vertex
 * - Repeatedly select the minimum weight edge that connects
 *   a vertex inside the MST to a vertex outside the MST
 *
 * Important Notes:
 * - Works ONLY for undirected graphs
 * - Graph must be connected
 * - Can handle negative, zero, or positive edge weights
 * - Starting vertex does NOT affect total MST cost
 *   (structure may differ if multiple MSTs exist)
 *
 *  *
 *  * Time Complexity:
 *  *  - O((V + E) * log V) when using a PriorityQueue (Min-Heap)
 *  *    where V is the number of vertices and E is the number of edges.
 *  *
 *  * Auxiliary Space:
 *  *  - O(V + E), due to adjacency list, priority queue, visited array, and parent array.
 *  *
 *  * Input:
 *  * adj[][] = [[[1, 4], [2, 8]],
 *  *            [[0, 4], [4, 6], [2, 3]],
 *  *            [[0, 8], [3, 2], [1, 3]],
 *  *            [[2, 2], [4, 10]],
 *  *            [[1, 6], [3, 10]]]
 *  *
 *  * Output:
 *  * MST edges (one possible MST):
 *  * 0 - 1 (4)
 *  * 1 - 2 (3)
 *  * 2 - 3 (2)
 *  * 1 - 4 (6)
 *  *
 *  * Total weight of MST = 15
 *  *
 *  * Explanation:
 *  * - Start from vertex 0.
 *  * - Pick edge (0 → 1) with weight 4.
 *  * - Pick edge (1 → 2) with weight 3.
 *  * - Pick edge (2 → 3) with weight 2.
 *  * - Pick edge (1 → 4) with weight 6.
 *  * - All vertices are now connected using V - 1 edges with minimum total cost.
 *  */


public class PrimsAlgorithm {
    static class Pair {
        int node;
        int weight;

        Pair(int node, int weight) {
            this.node = node;
            this.weight = weight;
        }
    }
    static class Triplet implements Comparable<Triplet> {
        int node;
        int parent;
        int weight;

        Triplet(int node, int parent, int weight) {
            this.node = node;
            this.parent = parent;
            this.weight = weight;
        }

        @Override
        public int compareTo(Triplet t) {
            //this ->  weight of current object // t ->  weight of the object passed for comparison
            if(this.weight == t.weight) return Integer.compare(this.node , t.node);
            return this.weight - t.weight; // min-heap
        }
    }

    public static void primMST(int V, List<List<Pair>> adj){
        boolean[] vis = new boolean[V];
        PriorityQueue<Triplet> pq = new PriorityQueue<>();

        // Start from node 0;
        pq.add(new Triplet(0,-1,0));

        int totalCost = 0;

        List<String> mstEdges = new ArrayList<>();

        while(!pq.isEmpty() && mstEdges.size() < V-1){
            Triplet top = pq.poll();

            int node = top.node;
            if(vis[node]) continue;  // If visited skip it
            vis[node] = true;    // Mark as visited

            if(top.parent!=-1){
                mstEdges.add(top.parent + " - " + node + " (" + top.weight + ")");
                totalCost += top.weight;
            }

            for(Pair p : adj.get(node)){
                int v = p.node;
                int wt = p.weight;

                if(!vis[v]){
                    pq.add(new Triplet(v,node,wt));
                }
            }
        }

        // Print MST
        System.out.println("Edges in MST:");
        for (String e : mstEdges) {
            System.out.println(e);
        }

        System.out.println("Total cost of MST = " + totalCost);
    }
    public static void main(String[] args) {
        int[][] edges = {{0,1,4},{0,2,8},
                {1,0,4},{1,4,6},{1,2,3},
                {2,0,8},{2,3,2},{2,1,3},
                {3,2,2},{3,4,10},
                {4,1,6},{4,3,10}};
        int V = 5;

        List<List<Pair>> adj = new ArrayList<>();
        for(int i=0;i<V;i++) adj.add(new ArrayList<>());

        for(int[] ele : edges){
            int u = ele[0], v = ele[1], weight = ele[2];
            adj.get(u).add(new Pair(v,weight));
        }


        primMST(V, adj);

    }
}

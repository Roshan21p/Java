package Graph;
import java.util.*;
/**
 * * Dijkstra’s Algorithm (Single Source Shortest Path)
 *  *
 *  * Dijkstra’s Algorithm is a greedy algorithm used to find the
 *  * shortest path distances from a given source vertex to all
 *  * other vertices in a weighted graph.
 *  *
 *  * The graph can be:
 *  * - Directed or Undirected
 *  *
 *  * Graph Representation:
 *  * - Adjacency List adj[u], where each entry contains (v, w)
 *  *   meaning an edge from u → v with weight w
 *  *
 *  * Key Conditions:
 *  * - Edge weights must be NON-NEGATIVE
 *  * - Does NOT work with negative edge weights
 *  *
 *  * Algorithm Idea:
 *  * - Initialize distance of source as 0, others as infinity
 *  * - Repeatedly pick the vertex with the minimum distance
 *  * - Relax all adjacent edges
 *  *
 *  * Time Complexity:
 *  * - O((V + E) log V) using PriorityQueue (Min-Heap)
 *  *
 *  * Space Complexity:
 *  * - O(V + E)
 *  *
 *  * Does NOT work for:
 *  * - Graphs with negative edge weights
 *  * - Graphs with negative cycles
 *
 * Input: src = 0, adj[][] =[[[1, 4], [2, 8]],
 *                           [[0, 4], [4, 6], [2,3]],
 *                             [[0, 8], [3, 2], [1,3]],
 *                            [[2, 2], [4, 10]],
 *                              [[1, 6], [3, 10]]]
 *
 *  Output:  [0, 4, 7, 9, 10]
 * Explanation:  Shortest Paths:
 * 0 -> 0 = 0: Source node itself, so distance is 0.
 * 0 -> 1 = 4: Direct edge from node 0 to 1 gives shortest distance 4.
 * 0 -> 2 = 7: Path 0 → 1 → 2 gives total cost 4 + 3 = 7, which is smaller than direct edge 8.
 * 0 -> 3 = 9: Path 0 → 1 → 2 → 3 gives total cost 4 + 3 + 2 = 9.
 * 0 -> 4 = 10: Path 0 → 1 → 4 gives total cost 4 + 6 = 10.
 */
public class DijkstrasAlgorithm {
   public static class Pair implements Comparable<Pair> {
        int node;
        int weight;

        Pair(int node, int weight) {
            this.node = node;
            this.weight = weight;
        }

        public int compareTo(Pair p){
            if(this.weight == p.weight) return this.node - p.node;
            return this.weight - p.weight;
        }
    }

    private static int[] dijkstra(int V, List<List<Pair>> adj, int src) {
       int[] dist = new int[V];
       Arrays.fill(dist,Integer.MAX_VALUE);
       dist[src] = 0;

       PriorityQueue<Pair> pq = new PriorityQueue<>(); // Min Heap
        pq.add(new Pair(src,0));

       while(!pq.isEmpty()) {
           Pair top = pq.remove();
           int node = top.node;
           int currDist = top.weight;

           // Ignore outdated entries
           if (currDist > dist[node]) continue;

           for (Pair p : adj.get(node)) {
               int totalCost = currDist + p.weight;

               if(totalCost < dist[p.node]){
                   dist[p.node] = totalCost;
                   pq.add(new Pair(p.node,totalCost));
               }

           }
       }
         return dist;
    }
    public static void main(String[] args) {
        int[][] edges = {{0,1,4},{0,2,8},
                         {1,0,4},{1,4,6},{1,2,3},
                         {2,0,8},{2,3,2},{2,1,3},
                         {3,2,2},{3,4,10},
                         {4,1,6},{4,3,10}};
        int V = 5;
        int src = 0;
        //List<List<int[]>> adj = new ArrayList<>();
        List<List<Pair>> adj = new ArrayList<>();
        for(int i=0;i<V;i++) adj.add(new ArrayList<>());

        // One Way of creating adjacency list using arr
//        for(int[] ele : edges){
//            int u = ele[0], v = ele[1], dist = ele[2];
//            adj.get(u).add(new int[]{v,dist});
//        }
//
//        for (int u = 0; u < V; u++) {
//            System.out.print(u + " -> ");
//            for (int[] edge : adj.get(u)) {
//                int v = edge[0];
//                int dist = edge[1];
//                System.out.print("(" + v + ", " + dist + ") ");
//            }
//            System.out.println();
//        }

        // Another Way of creating adjacency list using class Pair

        for(int[] ele : edges){
            int u = ele[0], v = ele[1], dist = ele[2];
            adj.get(u).add(new Pair(v,dist));
        }

        int[] ans = dijkstra(V, adj,src);
        System.out.println("Shortest Path from source " + src + ":");
        for (int i = 0; i < V; i++) {
            System.out.println("Node " + i + " -> " + ans[i]);
        }
    }

}


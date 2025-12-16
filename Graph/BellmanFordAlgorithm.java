package Graph;
import java.util.*;

/**
 * Bellman-Ford Algorithm (Single Source Shortest Path)
 *
 * Bellman-Ford is a single source shortest path algorithm used to find
 * the shortest distances from a given source vertex to all other vertices
 * in a weighted graph.
 *
 * Graph Properties:
 * - Works for both directed and undirected graphs
 * - Can handle negative edge weights
 *
 * Key Idea:
 * - Relax all edges V - 1 times
 * - Each relaxation improves the shortest path estimate
 *
 * Negative Weight Cycle:
 * - A negative weight cycle is a cycle whose total edge weight is negative
 * - If such a cycle is reachable from the source, shortest paths are undefined
 * - Bellman-Ford detects this by performing one extra relaxation pass
 *
 * Output:
 * - If a negative cycle is reachable from the source, return -1
 * - Otherwise, return shortest distances
 * - Unreachable vertices retain infinite distance
 *
 * Time Complexity:
 * - O(V × E)
 *
 * Space Complexity:
 * - O(V)
 *
 *  * Input: V = 5, edges = [[0, 1, 5], [1, 2, 1], [1, 3, 2], [2, 4, 1], [4, 3, -1]], src = 0
 *  * Output: [0, 5, 6, 6, 7]
 *  * Explanation:  Shortest Paths:
 *  * For 0 to 1 minimum distance will be 5. By following path 0 → 1
 *  * For 0 to 2 minimum distance will be 6. By following path 0 → 1  → 2
 *  * For 0 to 3 minimum distance will be 6. By following path 0 → 1  → 2 → 4 → 3
 *  * For 0 to 4 minimum distance will be 7. By following path 0 → 1  → 2 → 4
 *  *
 *  * Input: V = 4, edges = [[0, 1, 4], [1, 2, -6], [2, 3, 5], [3, 1, -2]], src = 0
 *  * Output: [-1]
 *  * Explanation: The graph contains a negative weight cycle formed by the path 1 → 2 → 3 → 1,
 *  * where the total weight of the cycle is negative.
 */
public class BellmanFordAlgorithm {

    private static int[] bellmanFord(int V, int[][] edges, int src) {

        int[] dist = new int[V];
        Arrays.fill(dist,Integer.MAX_VALUE);
        dist[src] = 0;

        // Relaxation of all the edges V times, not (V - 1) as we
        // need one additional relaxation to detect negative cycle
        for(int i=0;i<V;i++){
            for(int[] edge: edges){
                int u = edge[0];
                int v = edge[1];
                int wt = edge[2];

                if(dist[u] != Integer.MAX_VALUE && dist[u] + wt < dist[v]){
                    // If this is the Vth relaxation, then there is
                    // a negative cycle
                    if(i == V-1) return new int[]{-1};

                    dist[v] = dist[u] + wt;
                }
            }
        }
        return dist;
    }

    public static void main(String[] args) {
        int V = 5;
        int[][] edges = {{0,1,5},{1,2,1},{1,3,2},{2,4,1},{4,3,-1}};
        int src = 0;

        int V1 = 4;
        int[][] edges1 = {{0,1,4},{1,2,-6},{2,3,5},{3,1,-2}};
        int src1 = 0;

        int[] ans = bellmanFord(V1,edges1,src1);

        System.out.println("Shortest Path from source to all vertices " + src + ":");
        for(int i=0;i< ans.length;i++){
            System.out.println("Node " + i + " -> " + ans[i]);
        }
    }
}

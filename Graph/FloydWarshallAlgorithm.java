package Graph;
import java.util.*;

/**
 * Floyd–Warshall Algorithm (All-Pairs Shortest Path)
 *
 * Floyd–Warshall is a dynamic programming algorithm used to find
 * the shortest paths between all pairs of vertices in a weighted graph.
 *
 * Graph Properties:
 * - Works for both directed and undirected graphs
 * - Supports negative edge weights
 *
 * Important Limitation:
 * - If a negative weight cycle exists, shortest paths are undefined
 * - Floyd–Warshall can detect negative cycles using dist[i][i] < 0
 *
 * When to Use:
 * - All-pairs shortest paths are required
 * - Graph is dense
 * - Number of vertices is small (typically ≤ 100–400)
 *
 * Core Idea:
 * - For each intermediate vertex k,
 *   try to improve the path between every pair (i, j)
 *
 *   dist[i][j] = min(dist[i][j], dist[i][k] + dist[k][j])
 *
 * Time Complexity:
 * - O(V³)
 *
 * Space Complexity:
 * - O(V²)
 */


public class FloydWarshallAlgorithm {

    static final int  INF = (int)1e9;
    private static int[][] floydWarshall(int n, int[][] edges){
        int[][] dist = new int[n][n];



        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(i==j) dist[i][j] = 0;
                else dist[i][j] = INF;
            }
        }

        for (int i = 0; i < edges.length; i++) {
            int u = edges[i][0];
            int v = edges[i][1];
            int wt = edges[i][2];
            //dist[u][v] = Math.min(dist[u][v], wt);
            dist[u][v] = wt;
        }




        // Floyd–Warshall
        for(int k=0;k<n;k++){
            for(int i=0;i<n;i++){
                for(int j=0;j<n;j++){
                    if(dist[i][k] < INF && dist[k][j] < INF){
                        dist[i][j] = Math.min(dist[i][j], dist[i][k] + dist[k][j] );
                    }
                }
            }
        }

        // Optional: detect negative cycle
        for (int i = 0; i < n; i++) {
            if (dist[i][i] < 0) {
                System.out.println("Negative cycle detected");
            }
        }

        return dist;
    }
    public static void main(String[] args) {
        int V = 5;
        int[][] edges = {{0,1,2},{0,4,8},
                         {1,0,2},{1,2,3},{1,4,2},
                         {2,1,3},{2,3,1},
                         {3,2,1},{3,4,1},
                         {4,3,1},{4,0,8},{4,1,2}};

        int[][] ans = floydWarshall(V,edges);

        System.out.println("All-Pairs Shortest Path Matrix:");
        for (int i = 0; i < V; i++) {
            for (int j = 0; j < V; j++) {
                if (ans[i][j] == (int)1e9) {
                    System.out.print("INF ");
                } else {
                    System.out.print(ans[i][j] + "   ");
                }
            }
            System.out.println();
        }


    }
}

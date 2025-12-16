package Graph;
/**
# 🌲 Kruskal’s Algorithm
        ## 📌 What is Kruskal’s Algorithm?

        Kruskal’s Algorithm is a **greedy algorithm** used to find the **Minimum Spanning Tree (MST)** of a **connected, weighted, undirected graph**.
        👉 A **Minimum Spanning Tree (MST)**:
        * Connects all vertices
        * Has **no cycles**
        * Has **minimum possible total edge weight**
        ---
        ## 🧠 Core Idea (Intuition)
        1. Sort all edges by **increasing weight**
        2. Pick the smallest edge
        3. Add it to MST **only if it does NOT form a cycle**
        4. Repeat until we have **V − 1 edges**

        👉 Cycle detection is done using **Disjoint Set Union (DSU) / Union-Find**
        ---
        ## 🛠 Data Structures Used

        * **Edge List** → store all edges
        * **DSU (Union-Find)** → detect cycles efficiently

        * `find()` → find parent
        * `union()` → merge two components
        ---
        ## ⚙️ Algorithm Steps

        1. Initialize DSU for `V` vertices
        2. Sort all edges by weight
        3. For each edge `(u, v, w)`:

        * If `find(u) != find(v)`:

        * Add edge to MST
        * `union(u, v)`
        4. Stop when MST has `V - 1` edges

        ---
        ## ⏱ Time and Space Complexity

        ### Time Complexity
        * Sorting edges: **O(E log E)**
        * DSU operations: **O(E α(V)) ≈ O(E)**
        👉 **Overall:** `O(E log E)`

        ### Space Complexity
        * DSU arrays + edge list → **O(V + E)**
        ---
        ## ✅ When to Use Kruskal’s Algorithm

        ✔ Graph is **sparse**
        ✔ Need **Minimum Spanning Tree**
        ✔ Edges are easy to sort

        ❌ Not for directed graphs
        ❌ Not for shortest path problems

 */

import java.util.*;

public class KruskalsAlgorithm {
    static class Edge implements Comparable<Edge> {
        int u, v, wt;
        Edge(int u, int v, int wt) {
            this.u = u;
            this.v = v;
            this.wt = wt;
        }
        public int compareTo(Edge e) {
            if(this.wt == e.wt) return Integer.compare(this.u,e.u);
            return this.wt - e.wt; // same weights allowed
        }
    }

    static class DSU {
        int[] parent, rank;
        DSU(int n){
            parent = new int[n];
            rank = new int[n];

            for(int i=0;i<n;i++) parent[i] = i;
        }

        int find(int a){
            if(parent[a]==a) return a;
            return parent[a] = find(parent[a]);  // Path Compression
        }

        void union(int a,int b){
            int pa = find(a);
            int pb = find(b);
            if (pa == pb) return;  // already in the same set

            if (rank[pa] < rank[pb]) {
                parent[pa] = pb;     // attach smaller rank under bigger
            } else if (rank[pa] > rank[pb]) {
                parent[pb] = pa;
            } else {
                parent[pb] = pa;
                rank[pa]++;          // only increase rank if ranks were equal
            }
        }
    }
    public static void main(String[] args) {
        int V = 6;
        int[][] edges = {{0,1,2},{0,2,2},
                        {1,2,2},{1,3,3},
                        {2,3,3},
                        {3,4,1},
                        {4,5,1}};
        List<Edge> adj = new ArrayList<>();

        for(int[] ele: edges){
            int u = ele[0], v = ele[1], wt = ele[2];
            adj.add(new Edge(u,v,wt));
        }

        Collections.sort(adj);

        DSU dsu = new DSU(V);

        int mstWeight = 0;
        int count = 0;
        System.out.println("Edges in MST:");

        for (Edge e : adj) {
            if (dsu.find(e.u) != dsu.find(e.v)) {
                dsu.union(e.u, e.v);
                mstWeight += e.wt;
                count++;
                System.out.println(e.u + " - " + e.v + " : " + e.wt);
                if(count == V-1) break;
            }
        }

        System.out.println("Total MST Weight = " + mstWeight);
    }
}

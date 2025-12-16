package Graph;
import java.util.*;
public class UndirectedGraphCycle {
    public static class Pair {
        int node;
        int parent;

        Pair(int node, int parent){
            this.node = node;
            this.parent = parent;
        }
    }

    public static boolean bfs(int i,boolean[] vis,List<List<Integer>> adj){
        Queue<Pair> q = new LinkedList<>();
        q.add(new Pair(i,-1));
        while(q.size() > 0){
            Pair temp = q.remove();
            int node = temp.node;
            int parent = temp.parent;
            for(int ele : adj.get(node)){
                if(vis[ele] && ele != parent) return true;
                if(vis[ele]==false && ele != parent){
                    vis[ele] = true;
                    q.add(new Pair(ele,node));
                }
            }
        }
        return false;
    }

    public boolean dfs(int node,int parent,boolean[] vis,List<List<Integer>> adj){
        for(int ele : adj.get(node)){
            if(!vis[ele]){
                vis[ele] = true;
                if(dfs(ele, node, vis,adj)) return true;
            } else if (vis[ele] && ele != parent){
                return true;
            }
        }
        return false;
    }

    public static boolean isCycle(int V, int[][] edges,List<List<Integer>> adj) {
        boolean[] vis = new boolean[V];

        for(int i=0;i<V;i++){
            if(!vis[i]){
                vis[i] = true;
                boolean ans = bfs(i,vis,adj);
                if(ans==true) return true;
            }
        }
        return false;
    }


    public static void main(String[] args) {
        int V = 4;
        int E = 4;
        int edges[][] = {{0, 1}, {0, 2}, {1, 2}, {2, 3}};
        List<List<Integer>> adj = new ArrayList<>();

        for(int i=0;i<V;i++){
            List<Integer> list = new ArrayList<>();
            adj.add(list);
        }

        for(int i=0;i<edges.length;i++){
            int a = edges[i][0], b = edges[i][1];
            adj.get(a).add(b);
            adj.get(b).add(a);
        }


        System.out.println(isCycle(V,edges,adj));
    }
}

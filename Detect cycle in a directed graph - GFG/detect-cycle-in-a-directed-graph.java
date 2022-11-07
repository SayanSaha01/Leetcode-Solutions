//{ Driver Code Starts
import java.util.*;
import java.io.*;
import java.lang.*;

class DriverClass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            ArrayList<ArrayList<Integer>> list = new ArrayList<>();
            int V = sc.nextInt();
            int E = sc.nextInt();
            for (int i = 0; i < V; i++)
                list.add(i, new ArrayList<Integer>());
            for (int i = 0; i < E; i++) {
                int u = sc.nextInt();
                int v = sc.nextInt();
                list.get(u).add(v);
            }
            if (new Solution().isCyclic(V, list) == true)
                System.out.println("1");
            else
                System.out.println("0");
        }
    }
}
// } Driver Code Ends


/*Complete the function below*/

class Solution {
    public boolean isCyclic(int V, ArrayList<ArrayList<Integer>> adj) {
        int[] vertex = new int[V];
        int[] indegree = new int[V];
        Queue<Integer> queue = new LinkedList<>();
        for(int i=0;i<V;i++)
        {
            for(int it:adj.get(i))
            {
                indegree[it]++;
            }
        }
        
        for(int i=0;i<V;i++)
        {
            if(indegree[i]==0)
            {
                queue.add(i);
            }
        }
        
        int index=0;
        int[] sorted = new int[V];
        while(!queue.isEmpty())
        {
            int node = queue.poll();
            index++;
            for(int it:adj.get(node))
            {
                indegree[it]--;
                if(indegree[it]==0)
                {
                    queue.add(it);
                }
            }
        }
        
        return (index==V)?false:true;
    }
}
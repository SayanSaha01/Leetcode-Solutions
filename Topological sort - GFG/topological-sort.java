//{ Driver Code Starts
import java.util.*;
import java.io.*;
import java.lang.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());

        while (t-- > 0) {
            ArrayList<ArrayList<Integer>> list = new ArrayList<>();
            String st[] = read.readLine().trim().split("\\s+");
            int edg = Integer.parseInt(st[0]);
            int nov = Integer.parseInt(st[1]);

            for (int i = 0; i < nov + 1; i++)
                list.add(i, new ArrayList<Integer>());

            int p = 0;
            for (int i = 1; i <= edg; i++) {
                String s[] = read.readLine().trim().split("\\s+");
                int u = Integer.parseInt(s[0]);
                int v = Integer.parseInt(s[1]);
                list.get(u).add(v);
            }

            int[] res = new Solution().topoSort(nov, list);

            if (check(list, nov, res) == true)
                System.out.println("1");
            else
                System.out.println("0");
        }
    }
    static boolean check(ArrayList<ArrayList<Integer>> list, int V, int[] res) {
        
        if(V!=res.length)
        return false;
        
        int[] map = new int[V];
        for (int i = 0; i < V; i++) {
            map[res[i]] = i;
        }
        for (int i = 0; i < V; i++) {
            for (int v : list.get(i)) {
                if (map[i] > map[v]) return false;
            }
        }
        return true;
    }
}

// } Driver Code Ends


/*Complete the function below*/

/*Topological Sort using DFS 
class Solution
{
    //Function to return list containing vertices in Topological order. 
    static int[] topoSort(int V, ArrayList<ArrayList<Integer>> adj) 
    {
        int[] vertex = new int[V];
        int[] sorted = new int[V];
        Stack<Integer> st = new Stack<Integer>();
        for(int i=0;i<V;i++)
        {
            if(vertex[i]==0)
            {
                dfs(i,adj,vertex,st);
            }
        }
        
        int index=0;
        while(!st.isEmpty())
        {
            sorted[index++]=st.peek();
            st.pop();
        }
        return sorted;
    }
    static void dfs(int node,ArrayList<ArrayList<Integer>> adj,int[] vertex,Stack<Integer> st)
    {
        vertex[node]=1;
        for(int it:adj.get(node))
        {
            if(vertex[it]==0)
            {
                dfs(it,adj,vertex,st);
            }
        }
        st.push(node);
    }
}
*/ 

/*Topological Sort using BFS (Kahns Algorithm) */

class Solution
{
    static int[] topoSort(int V, ArrayList<ArrayList<Integer>> adj) 
    {
        int[] indegree = new int[V];
        for(int i=0;i<V;i++)
        {
            for(int it:adj.get(i))
            {
                indegree[it]++;
            }
        }
        
        //adding all the vertices that have 0 indegree
        Queue<Integer> queue = new LinkedList<Integer>();
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
            sorted[index++]=node;
            
            for(int it:adj.get(node))
            {
                indegree[it]--;
                if(indegree[it]==0)
                {
                    queue.add(it);
                }
            }
        }
        
        return sorted;
    }
}

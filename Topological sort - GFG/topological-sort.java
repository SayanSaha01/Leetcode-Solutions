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


/*class Solution
{
    //Function to return list containing vertices in Topological order DFS Approach
    static int[] topoSort(int V, ArrayList<ArrayList<Integer>> adj) 
    {
        int[] visited = new int[V];
        Stack<Integer> st = new Stack<Integer>();
        Arrays.fill(visited,0);
        for(int i=0;i<V;i++)
        {
            if(visited[i]==0)
            {
                dfs(i,adj,visited,st);
            }
        }
        int[] arr = new int[V];
        int j=0;
        while(!st.isEmpty())
        {
            arr[j++]=st.pop();
        }
        return arr;
    }
    static void dfs(int idx,ArrayList<ArrayList<Integer>> adj,int[] visited,Stack<Integer> st)
    {
        visited[idx]=1;
        for(int it : adj.get(idx))
        {
            if(visited[it]==0)
            {
                dfs(it,adj,visited,st);
            }
        }
        st.push(idx);
    }
}
*/
class Solution
{
    //Function to return list containing vertices in Topological order BFS Approach
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
        Queue<Integer> queue = new LinkedList<Integer>();
        for(int i=0;i<V;i++)
        {
            if(indegree[i]==0)
            {
                queue.offer(i);
            }
        }
        int[] arr = new int[V];
        int j=0;
        while(!queue.isEmpty())
        {
            int node=queue.poll();
            arr[j++]=node;
            for(int it:adj.get(node))
            {
                indegree[it]--;
                if(indegree[it]==0)
                {
                    queue.offer(it);
                }
            }
        }
        return arr;
    }
}
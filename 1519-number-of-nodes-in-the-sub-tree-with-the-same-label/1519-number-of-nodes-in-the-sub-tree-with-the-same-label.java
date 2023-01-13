class Solution {
    List<List<Integer>> list;
    int[] result;
    boolean[] visited;
    public int[] countSubTrees(int n, int[][] edges, String labels) {
        list = new ArrayList<>(n);
        result = new int[n];
        for(int i=0;i<n;i++)
        {
            list.add(new ArrayList<>());
        }
        for(int [] edge:edges)
        {
            list.get(edge[0]).add(edge[1]);
            list.get(edge[1]).add(edge[0]);
        }
        visited = new boolean[n];
        dfs(0,labels);
        return result;
    }
    public int[] dfs(int node, String labels)
    {
        visited[node]=true;
        int[] label = new int[26];   // to keep track of all the labels in its subtree or children nodes
        for(int it:list.get(node))
        {
            if(!visited[it])
            {
                int[] child_label = dfs(it,labels);
                //updating the labels with the occurence of child_label in each of its subtree from the node
                for(int i =0;i<26;i++)
                {
                    label[i]+=child_label[i];
                }
            }
        }
        //updating the label array with the label present at the current node, we were adding the child_nodes previously in the label
        char ch = labels.charAt(node);
        label[ch-'a']++;
        //storing the count of the subtrees of the current node, label array is being initialised every time we go the children of nodes
        result[node]=label[ch-'a'];
        return label;
    }
}
class Solution {
    List<Integer> list = new ArrayList<Integer>();
    public List<Integer> lexicalOrder(int n) {
        dfs(1,9,n);
        return list;
    }
    public void dfs(int start,int end,int n)
    {
        for(int i=start;i<=end && i<=n;i++)
        {
            list.add(i);
            dfs(i*10,i*10+9,n);
        }
    }
}
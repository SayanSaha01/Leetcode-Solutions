class Solution {
    public boolean canVisitAllRooms(List<List<Integer>> adj) {
        Stack<Integer> st = new Stack<Integer>();
        int[] rooms = new int[adj.size()];
        st.push(0);
        while(!st.isEmpty())
        {
            int idx = st.pop();
               //we are marking all the rooms who have keys with 1 to identify which rooms we can visit because of the availability of keys, in question it is mentioned all the rooms have keys except 0 hence we are inserting 0 into the loop before the while loop begins
            if(rooms[idx]==1)
                continue;
            for(int i=0;i<adj.get(idx).size();i++)
            {
                st.push(adj.get(idx).get(i));
                
            } 
            rooms[idx]=1;
        }
        for(int i=0;i<rooms.length;i++)
        {
            if(rooms[i]==0)
                return false;
        }
        return true;
    }
}
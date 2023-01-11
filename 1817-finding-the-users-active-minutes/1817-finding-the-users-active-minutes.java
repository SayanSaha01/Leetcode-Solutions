class Solution {
    public int[] findingUsersActiveMinutes(int[][] logs, int k) {
        int[] arr = new int[k];
        HashMap<Integer,Set<Integer>> map = new HashMap<>();
        for(int[] log:logs)
        {
            int id = log[0];
            int time = log[1];
            if(!map.containsKey(id))
            {
                HashSet<Integer> set = new HashSet<Integer>();
                set.add(time);
                map.put(id,set);
            }
            else
            {
                map.get(id).add(time);
            }
        }
        for(int key:map.keySet())
        {
            int uam = map.get(key).size();
            arr[uam-1]++;
        }
        return arr;
    }
}
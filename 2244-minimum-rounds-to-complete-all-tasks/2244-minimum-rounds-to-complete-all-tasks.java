class Solution {
    public int minimumRounds(int[] tasks) {
        HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
        for(int i:tasks)
        {
            map.put(i,map.getOrDefault(i,0)+1);
        }
        int count=0;
        for(int values:map.values())
        {
            if(values==1)
                return -1;
            count+=values/3;
            if(values%3!=0)
                count++;
        }
        return count;
    }
}
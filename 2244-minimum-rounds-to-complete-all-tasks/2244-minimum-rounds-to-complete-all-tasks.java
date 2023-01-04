class Solution {
    public int minimumRounds(int[] tasks) {
        HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
        for(int i:tasks)
        {
            map.put(i,map.getOrDefault(i,0)+1);
        }
        int min = 0;
        for(int count:map.values())
        {
            if(count==1)
               return -1;
            min+=count/3;
            if(count%3!=0)
                min++;
        }
        return min;
    }
}
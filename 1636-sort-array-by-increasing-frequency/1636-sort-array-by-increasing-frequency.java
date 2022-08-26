class Solution {
    public int[] frequencySort(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
        for(int i=0;i<nums.length;i++)
        {
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        PriorityQueue<Integer> pq = new PriorityQueue<>((a,b)->{
            if(map.get(a) != map.get(b))
              return map.get(a) - map.get(b);
            else
              return b - a;
        });
        for(Integer i:map.keySet())
        {
            pq.add(i);
        }
        int count=0;
        int[] arr = new int[nums.length];
        while(!pq.isEmpty())
        {
            int d = pq.poll();
            for(int i=0;i<map.get(d);i++)
            {
                arr[count++]=d;
            }
        }
        return arr;
    }
}
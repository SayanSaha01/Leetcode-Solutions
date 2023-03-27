class Solution {
    public int[] numberOfPairs(int[] nums) {
        int[] arr = new int[2];
        HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
        for(int i:nums)
        {
            map.put(i,map.getOrDefault(i,0)+1);
        }
        int count=0;
        int rem=0;
        for(int i:map.keySet())
        {
            count+=map.get(i)/2;
            rem+=map.get(i)%2;
        }
        arr[0]=count;
        arr[1]=rem;
        return arr;
    }
}
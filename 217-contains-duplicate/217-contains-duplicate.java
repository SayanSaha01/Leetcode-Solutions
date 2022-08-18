class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
        for(int i:nums){
            map.put(i,map.getOrDefault(i,0)+1);
            if(map.get(i)>=2){
                return true;
            }
        }
        return false;
    }
}
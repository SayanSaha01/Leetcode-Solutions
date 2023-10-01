class Solution {
    public int minOperations(List<Integer> nums, int k) {
        HashSet<Integer> set = new HashSet<>();
        int total_ops=0;
        for(int i=nums.size()-1;i>=0;i--){
            total_ops++;
            if(nums.get(i)<=k){
                set.add(nums.get(i));
            }
            if(set.size()==k)
                break;
        }
        return total_ops;
    }
}
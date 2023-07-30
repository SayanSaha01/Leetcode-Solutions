class Solution {
    public int countCompleteSubarrays(int[] nums) {
        int count=0;
        HashSet<Integer> hs=new HashSet<>();
        for(int a:nums)
            hs.add(a);
        int size=hs.size();
        for(int i=0;i<nums.length;i++){
            HashSet<Integer> hs1=new HashSet<>();
            for(int j=i;j<nums.length;j++){
                hs1.add(nums[j]);
                if(hs1.size()==size){ 
                    count++;
                }
            }    
        }
        return count;
    }
}
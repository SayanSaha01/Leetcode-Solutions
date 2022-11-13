class Solution {
    public int findPairs(int[] nums, int k) {
        HashSet<ArrayList<Integer>> hs = new HashSet<ArrayList<Integer>>();
		Arrays.sort(nums);
		for(int i=0;i<nums.length;i++){
			for(int j=i+1;j<nums.length;j++)
            {
				if(Math.abs(nums[i] - nums[j]) == k){
					hs.add(new ArrayList<Integer>(Arrays.asList(nums[i]<=nums[j]?nums[i]:nums[j],nums[i]>=nums[j]?nums[i]:nums[j])));
				}
			}
		}
		return hs.size();
    }
}
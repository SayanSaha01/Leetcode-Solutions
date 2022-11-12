class Solution {
    public int distinctAverages(int[] nums) {
        HashSet<Double> set = new HashSet<Double>();
        
        int start=0;
        int end=nums.length-1;
        Arrays.sort(nums);
        while(start<end)
        {
            int min = nums[start++];
            int max = nums[end--];
            Double avg = ((double)min+(double)max)/2;
            set.add(avg);
        }
        return set.size();
    }
}
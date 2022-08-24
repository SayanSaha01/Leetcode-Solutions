class Solution {
    public int countNicePairs(int[] nums) {
        int mod= (int)Math.pow(10,9)+7;
        int n = nums.length;
        
        Map<Integer, Integer> map = new HashMap<>();
        int res = 0;
        for (int j = 0; j < n; j++) {
            nums[j] -= rev(nums[j]);
            
            int count = map.getOrDefault(nums[j], 0);  
            res = (res + count)%mod;   
            
            map.put(nums[j], count + 1);   
        }
        return res;
    }
        private int rev(int x) {
            int res = 0;
            while (x != 0) {
                res = res * 10 + (x % 10);
                x /= 10;
            }
            return res;
    }
    
}
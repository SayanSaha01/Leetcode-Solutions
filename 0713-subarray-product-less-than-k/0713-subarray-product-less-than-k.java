class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        if (k <= 1) {
            return 0;
        }
        int i = 0;
        int j = 0;
        int res = 0;
        int p = 1;
        while (j < nums.length) {
            p = p * nums[j];
            if (p < k) {
                res += (j - i + 1);
                j++;
            } else if (p >= k) {
                while (p >= k) {
                    p = p / nums[i];
                    i++;
                }
                res += (j - i + 1);
                j++;
            }
        }
        return res;
    }
}

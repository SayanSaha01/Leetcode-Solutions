/*import java.util.*;
class Solution {
    public List<Integer> largestDivisibleSubset(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        int[] dp = new int[n];
        Arrays.fill(dp,1);
        int[] hash = new int[n];
        Arrays.fill(hash,1);
        int max=0;
        int lastindex=0;
        for(int idx=0;idx<=n-1;idx++)
        {
            for(int prev=0;prev<=idx-1;prev++)
            {
                if(nums[idx]%nums[prev]==0 && 1+dp[prev]<dp[idx])
                {
                    dp[idx] = 1+dp[prev];
                    hash[idx]=prev;
                }
            }
            if(nums[idx]>max)
            {
                max = nums[idx];
                lastindex = idx;
            }
        }
        List<Integer> res = new ArrayList<>();
        while (lastindex!=-1) {
            res.add(nums[lastindex]);
            lastindex = hash[lastindex];
        }
        return res;
    }
}*/
public class Solution {
    public List<Integer> largestDivisibleSubset(int[] nums) {
        int n = nums.length;
        int[] count = new int[n];
        int[] pre = new int[n];
        Arrays.sort(nums);
        int max = 0, index = -1;
        for (int i = 0; i < n; i++) {
            count[i] = 1;
            pre[i] = -1;
            for (int j = 0; j <= i-1; j++) {
                if (nums[i] % nums[j] == 0 && 1 + count[j] > count[i]) {
                        count[i] = count[j] + 1;
                        pre[i] = j;
                    }
                }
            if (count[i] > max) {
                max = count[i];
                index = i;
            }
        }
        List<Integer> res = new ArrayList<>();
        while (index != -1) {
            res.add(nums[index]);
            index = pre[index];
        }
        return res;
    }
}
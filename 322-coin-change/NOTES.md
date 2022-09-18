class Solution {
public int coinChange(int[] coins, int amount) {
int n = coins.length;
int ans = recursion(n-1,coins,amount);
if(ans >= Integer.MAX_VALUE)
return -1;
else
return ans;
}
public int recursion(int idx,int[] coins,int target)
{
if(idx == 0)
{
if(target % coins[idx] == 0)
return target/coins[idx];
else
return Integer.MAX_VALUE;
}
int notTaken = 0 + recursion(idx-1,coins,target);
​
int taken = Integer.MAX_VALUE;
if(coins[idx] <= target)
taken = 1 + recursion(idx-1,coins,target-coins[idx]);
​
return Math.min(notTaken,taken);
}
}
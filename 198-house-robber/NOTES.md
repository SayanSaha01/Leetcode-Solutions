// Recursive Approach (Gives TLE)
/*class Solution {
public int rob(int[] nums) {
int n = nums.length;
int ans = recursion(nums,n-1);
return ans;
}
public static int recursion(int[] nums,int n)
{
if(n<0)
return 0;
if(n==0)
return nums[0];
int include = recursion(nums,n-2)+nums[n];
int exclude = recursion(nums,n-1)+0;
//[1,2,3,1] => exclude is for the elements other than n-2 that is pairing of 1 with 1, 1 initially adds with 3 but if we exclude 3 we come to 1 which is also a non adjacent element
​
return Math.max(include,exclude);
}
}*/
​
//Recursion + Memoization (Also gives TLE)
/*class Solution {
public int rob(int[] nums) {
int n = nums.length;
int[] dp = new int[n+1];     //step1
Arrays.fill(dp,-1);
int ans = memoization(nums,n-1,dp);
return ans;
}
public static int memoization(int[] nums,int n,int[] dp)
{
if(n<0)
return 0;
if(n==0)
return nums[0];
/*class Solution {
    public int mincostTickets(int[] days, int[] costs) {
        return recursion(days,costs,0);
    }
    public static int recursion(int[] days, int[] cost, int idx)
    {
	if(idx >= days.length) 
        return 0;
	int option1 = cost[0] + recursion(days, cost, idx + 1);
    int i = idx;
    // pass for 7 days
    while(i< days.length && days[i] < days[idx] + 7)                                   i++;
    int option2 = cost[1] + recursion(days, cost, i);
    //here as you can see we are passing i instead of idx(index), i here denotes the index of the element after 7 days
    i = idx;   //reinitialising i to idx to iterate for 30days 
    //pass for 30 days
    while(i < days.length && days[i] < days[idx] + 30)                                 i++;
    int option3 = cost[2] + recursion(days, cost,i);
    return Math.min(option1, Math.min(option2,option3));
   }
}
*/

class Solution {
    public int mincostTickets(int[] days, int[] costs) {
        int[] dp = new int[days.length+1];
        Arrays.fill(dp,-1);
        return recursion(days,costs,0,dp);
    }
    public static int recursion(int[] days, int[] cost, int idx,int[] dp)
    {
	if(idx >= days.length) 
        return 0;
    if(dp[idx]!=-1)
        return dp[idx];
	int option1 = cost[0] + recursion(days, cost, idx + 1,dp);
    int i = idx;
    // pass for 7 days
    while(i< days.length && days[i] < days[idx] + 7)                                   i++;
    int option2 = cost[1] + recursion(days, cost, i,dp);
    //here as you can see we are passing i instead of idx(index), i here denotes the index of the element after 7 days
    i = idx;   //reinitialising i to idx to iterate for 30days 
    //pass for 30 days
    while(i < days.length && days[i] < days[idx] + 30)                                 i++;
    int option3 = cost[2] + recursion(days, cost,i,dp);
    dp[idx] = Math.min(option1, Math.min(option2,option3));
    return dp[idx];
   }
}

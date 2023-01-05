//find the number of overlapping intervals and subtract it from the number of intervals to get the number of non-overlapping intervals
//Solve this problem first - https://leetcode.com/problems/minimum-number-of-arrows-to-burst-balloons/
//https://leetcode.com/problems/minimum-number-of-arrows-to-burst-balloons/discuss/3000877/Easy-Java-Solution
class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
        if(intervals.length==0)
            return 0;
        Arrays.sort(intervals,(a,b)->Integer.compare(a[1],b[1]));
        int count=1;
        int initialpoint = intervals[0][1];
        for(int i=1;i<intervals.length;i++)
        {
            if(intervals[i][0]>=initialpoint)
            {
                count++;
                initialpoint = intervals[i][1];
            }
        }
        return intervals.length-count;
    }
}
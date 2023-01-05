class Solution {
    public int findMinArrowShots(int[][] points) {
        if(points.length==0)
            return 0;
        Arrays.sort(points,(a,b)->Integer.compare(a[1],b[1]));
        int count=1;
        int initialpoint = points[0][1];
        for(int i=1;i<points.length;i++)
        {
            if(points[i][0]>initialpoint)
            {
                count++;
                initialpoint = points[i][1];
            }
        }
        return count;
    }
}
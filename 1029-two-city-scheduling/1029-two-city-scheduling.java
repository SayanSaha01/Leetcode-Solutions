class Solution {
    public int twoCitySchedCost(int[][] costs) {
        Arrays.sort(costs,(a,b)->(a[0]-a[1])-(b[0]-b[1]));   //basis of sorting on the basis of cost difference, if we get negative then we understand the first value is very less and the second value of array is big and when the cost difference is +ve we understand that the first value is big and the second value is less hence we assign the first n values which have negative difference to city a and the next n values which have positive difference to city b .
        int sum=0;
        for(int i=0;i<costs.length/2;i++)
        {
            sum+=costs[i][0];
        }
        for(int i=costs.length/2;i<costs.length;i++)
        {
            sum+=costs[i][1];
        }
        return sum;
    }
}
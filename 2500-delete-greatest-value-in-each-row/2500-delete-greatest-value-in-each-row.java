class Solution {
    public int deleteGreatestValue(int[][] grid) {
        for(int[] r:grid){
            Arrays.sort(r);
        }
        int sum=0;
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        int n = grid[0].length-1;
        for(int j=0;j<grid[0].length;j++)  //iterating over columns
        {
            for(int[] row:grid)
            {
                pq.add(row[n]);
            }
            n--;
            sum+=pq.poll();
            pq.clear();
        }
        return sum;
    }
}
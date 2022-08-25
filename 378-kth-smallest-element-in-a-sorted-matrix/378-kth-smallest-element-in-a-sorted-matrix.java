class Solution {
    public int kthSmallest(int[][] matrix, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
        for(int i=0;i<matrix.length;i++)
        {
            for(int j=0;j<matrix[i].length;j++)
            {
                pq.add(matrix[i][j]);
            }
        }
        for(int i=1;i<k;i++)     //if we iterate from 0 to <k it will go on till 8 which is 15 but we want 13 in the example 1 so we iterate from 1 to 7
        {
            pq.poll();
        }
        return pq.peek();
    }
}
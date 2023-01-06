class Solution {
    public int[] kWeakestRows(int[][] mat, int k) {
        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> a[1] == b[1] ? b[0] - a[0] : b[1] - a[1]);
        for(int i = 0; i < mat.length; i++) {
            int j = 0;
            while(j < mat[0].length && mat[i][j] == 1) // we can also improve this a bit using binary search as row is sorted
                j++;
            pq.add(new int[]{i, j});
            if(pq.size() > k)
                pq.poll();
        }
        
        int[] result = new int[k];
        while(k > 0) {
            result[--k] = pq.poll()[0];
        }
        
        return result;
    }
}
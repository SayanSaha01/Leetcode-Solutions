class Solution {
    public int minGroups(int[][] mx) {
        int n = mx.length;
        int[] begin = new int[n], end = new int[n];
        for (int i = 0; i < n; i++) {
            begin[i] = mx[i][0];
              end[i] = mx[i][1];
        }
        
        // we sort the start / end time of each meeting separately
        Arrays.sort(begin);
        Arrays.sort(end);
        
        int res = 0; // how many meeting rooms we need
        // i traverse the begin time of each meeting, while j traverse end time of each
        for (int i = 0, j = 0; i < n; i++) {
            if (begin[i] <= end[j]) res++; // when a meeting begins before the current earliest meeting end time, we need a new room for this meeting
            else j++; // when a meeting begins after another meeting ends, we don't need a new room, we increase j here to check for next earliest end time (i is increased every loop anyway for new start of meeting)
        }
        
        return res;
    }
}
class Solution {
    public int minCostToMoveChips(int[] position) {
        int odds = 0, evens = 0;
        for(int num: position){
            if (num % 2 == 0) evens ++;
            else odds ++;
        }
        return Math.min(evens,odds);
    }
}
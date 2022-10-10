class Solution {
    public int minMoves(int target, int maxDoubles) {
        if(target==1)   //since we are starting from 1 itself
            return 0;
        if(target%2==0 && maxDoubles>0)
            return 1 + minMoves(target/2,maxDoubles-1);
        if(target%2!=0 && maxDoubles>0)
            return 1 + minMoves(target-1,maxDoubles);
        else
            return target-1;     //why target-1 and not target, as we are starting from 1, we return target-1, if we had started from 0, we could return target
    }
}
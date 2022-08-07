class Solution {
    public int poorPigs(int buckets, int tdie, int ttest) {
        int test = ttest/tdie;
        int count=0;
        
        while( Math.pow(test+1,count) < buckets ){
            count++;
        }
        
        return count;
    }
}
class Solution {
    public int maximumBags(int[] capacity, int[] rocks, int additionalRocks) {
        int[] remaining = new int[rocks.length];
        for(int i=0;i<rocks.length;i++)
        {
            remaining[i] = capacity[i]-rocks[i];
        }
        Arrays.sort(remaining); //sorted in ascending order to find the max no of bags that will have minimal remaining rocks
        int ans=0;
        for(int i=0;i<remaining.length;i++)
        {
            if(remaining[i]==0)
                ans++;
            else if(additionalRocks>=remaining[i])
            {
                additionalRocks = additionalRocks - remaining[i];
                ans++;
            }
        }
        return ans;
    }
}
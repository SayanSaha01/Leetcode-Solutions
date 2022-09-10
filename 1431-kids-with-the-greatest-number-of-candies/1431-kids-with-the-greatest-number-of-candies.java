class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> arr = new ArrayList<Boolean>();
        int max = 0;
        for(int j:candies)
        {
            max = Math.max(j,max);
        }
        for(int i=0;i<candies.length;i++)
        {
            if(candies[i]+extraCandies>=max)
            {
                arr.add(true);
            }
            else
                arr.add(false);
        }
        return arr;
    }
}
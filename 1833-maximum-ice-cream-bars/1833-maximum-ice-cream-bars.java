class Solution {
    public int maxIceCream(int[] costs, int coins) {
        Arrays.sort(costs);
        int count=0;
        for(int i:costs)
        {
            if(i<=coins)
            {
                coins-=i;
                count++;
            }
        }
        return count;
    }
}
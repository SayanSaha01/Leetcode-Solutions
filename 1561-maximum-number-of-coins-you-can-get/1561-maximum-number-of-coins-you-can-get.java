class Solution {
    public int maxCoins(int[] piles) {
        int sum = 0;
        Arrays.sort(piles);
        int coinindex = piles.length-2;
        for(int i=0;i<piles.length/3;i++)
        {
            sum+=piles[coinindex];
            coinindex-=2;
        }
        return sum;
    }
}
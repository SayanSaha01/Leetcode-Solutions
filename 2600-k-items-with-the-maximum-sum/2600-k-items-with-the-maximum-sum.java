class Solution {
    public int kItemsWithMaximumSum(int numOnes, int numZeros, int numNegOnes, int k) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        while(numOnes-->0)
            list.add(1);
        while(numZeros-->0)
            list.add(0);
        while(numNegOnes-->0)
            list.add(-1);
        int sum=0;
        while(k-->0)
        {
            sum+=list.get(k);
        }
        return sum;
    }
}
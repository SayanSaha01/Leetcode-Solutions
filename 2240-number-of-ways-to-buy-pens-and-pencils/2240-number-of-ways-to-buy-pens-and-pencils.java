class Solution {
    public long waysToBuyPensPencils(int total, int cost1, int cost2) {
        long res=0;
		for (int i = 0; i * cost1 <= total; i++)
				res += (total - i * cost1) / cost2 + 1;
        return res;
    }
}
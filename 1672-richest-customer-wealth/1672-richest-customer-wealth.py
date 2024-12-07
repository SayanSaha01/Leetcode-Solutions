class Solution:
    def maximumWealth(self, accounts: List[List[int]]) -> int:
        max_wealth = -1
        for acc in accounts:
            wealth = sum(acc)
            if wealth>max_wealth:
                max_wealth = wealth
        return max_wealth
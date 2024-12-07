class Solution:
    def minimumOperations(self, nums: List[int]) -> int:
        cnt = 0
        for i in nums:
            if (i-1)%3==0 or (i+1)%3==0:
                cnt+=1
            else:
                continue
        return cnt
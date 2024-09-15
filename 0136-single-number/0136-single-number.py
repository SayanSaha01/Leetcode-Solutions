class Solution:
    def singleNumber(self, nums: List[int]) -> int:
        uniqnum=0
        for idx in nums:
            uniqnum^=idx
        return uniqnum
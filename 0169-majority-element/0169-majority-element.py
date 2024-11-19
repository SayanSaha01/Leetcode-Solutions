class Solution:
    def majorityElement(self, nums: List[int]) -> int:
        num_dict = {}
        for i in nums:
            num_dict[i] = num_dict.get(i,0)+1
            if num_dict[i]>len(nums)/2:
                return i
        
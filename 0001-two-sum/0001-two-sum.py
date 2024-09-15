class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        # n = len(nums)
        # for i in range(0,n-1):
        #     for j in range(i+1,n):
        #         if(nums[i]+nums[j]==target):
        #             return [i,j]
        #             break
        # return []
        
        hashmap = {}
        n = len(nums)
        
        for i in range(n):
            hashmap[nums[i]]=i
            
        for i in range(n):
            complement = target - nums[i]
            if complement in nums and hashmap[complement]!=i:
                return [i,hashmap[complement]]
        return []
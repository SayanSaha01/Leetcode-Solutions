class Solution:
    def separateDigits(self, nums: List[int]) -> List[int]:
        list1 = []
        for i in nums:
            for j in str(i):
                list1.append(int(j))
        return list1
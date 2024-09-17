class Solution:
    def sumOfEncryptedInt(self, nums: List[int]) -> int:
        sum=0
        for n in nums:
            n_str = str(n)
            maxDig = max(n_str)
            sum += int(len(n_str) * maxDig)
        return sum
    
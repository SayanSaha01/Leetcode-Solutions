class Solution:
    def lengthOfLastWord(self, s: str) -> int:
        z = list(s.rstrip(" ").split(" "))
        return len(z[-1])
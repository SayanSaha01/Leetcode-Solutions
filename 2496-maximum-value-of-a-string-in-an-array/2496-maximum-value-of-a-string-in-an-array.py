class Solution:
    def maximumValue(self, strs: List[str]) -> int:
        return max(int(n) if n.isdigit() else len(n) for n in strs)
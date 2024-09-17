class Solution:
    def sortPeople(self, names: List[str], heights: List[int]) -> List[str]:
        result = []
        sorted_heights = sorted(heights,reverse=True)
        for height in sorted_heights:
            idx = heights.index(height)
            result.append(names[idx])
        return result
class Solution:
    def sortPeople(self, names: List[str], heights: List[int]) -> List[str]:
        sorted_heights = sorted(heights,reverse=True)
        list2=[]
        for height in sorted_heights:
            z = heights.index(height)
            list2.append(names[z])
        return list2
class Solution:
    def getSneakyNumbers(self, nums: List[int]) -> List[int]:
        map = {}
        for i in nums:
            map[i]=map.get(i,0)+1
        lst = []
        for i in map.keys():
            if map[i]==2:
                lst.append(i)
        return lst
            
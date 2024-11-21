class Solution:
    def firstUniqChar(self, s: str) -> int:
        map={}
        for i in s:
            map[i]=map.get(i,0)+1
        for i in map:
            if map[i]==1:
                return s.index(i)
        return -1
            
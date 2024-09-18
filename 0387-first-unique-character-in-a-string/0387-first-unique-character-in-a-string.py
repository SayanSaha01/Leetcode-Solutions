class Solution:
    def firstUniqChar(self, s: str) -> int:
        duplicate = []
        unique = []
        for i in s:
            if i in unique:
                duplicate.append(i)
            else:
                unique.append(i)
        # print(unique)
        # print(duplicate)
        for c in unique:
            if c not in duplicate:
                return s.index(c)
        return -1
            
        
        
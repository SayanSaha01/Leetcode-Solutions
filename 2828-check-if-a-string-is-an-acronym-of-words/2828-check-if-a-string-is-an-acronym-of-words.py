class Solution:
    def isAcronym(self, words: List[str], s: str) -> bool:
        str = ''
        for i in words:
            str+=i[0]
        return str==s
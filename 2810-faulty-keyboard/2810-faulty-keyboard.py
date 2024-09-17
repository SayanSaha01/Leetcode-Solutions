class Solution:
    def finalString(self, s: str) -> str:
        word=[]
        for char in s:
            if char=='i':
                word = word[::-1]
            else:
                word.append(char)
        return ''.join(word)